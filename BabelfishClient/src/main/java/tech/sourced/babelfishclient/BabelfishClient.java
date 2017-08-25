/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.sourced.babelfishclient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;

import github.com.bblfsh.sdk.protocol.Generated.ParseRequest;
import github.com.bblfsh.sdk.protocol.Generated.ParseResponse;
import github.com.bblfsh.sdk.protocol.ProtocolServiceGrpc;
import github.com.bblfsh.sdk.uast.Generated.Node;


public class BabelfishClient {
    
    private final ManagedChannel channel;
    private final ProtocolServiceGrpc.ProtocolServiceBlockingStub blockingStub;
    
    public BabelfishClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext(true)
        .build());
    }
    
    BabelfishClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = ProtocolServiceGrpc.newBlockingStub(channel);
    }
    
    public void shutdown() throws InterruptedException {
      channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    
    /** Say hello to server. */
    public void greet(String content, String language) {
      ParseRequest request = ParseRequest.newBuilder()
              .setContent(content)
              .setLanguage(language)
              .build();
      
      ParseResponse response;
      try {
          response = blockingStub.parse(request);
      } catch (StatusRuntimeException e) {
          System.out.println(e);
          return;
      }
      if(response.hasUast()) {
          Node node = response.getUast();
          System.out.println(node.toString());
      }
    }
}

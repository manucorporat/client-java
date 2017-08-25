package github.com.bblfsh.sdk.protocol;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: github.com/bblfsh/sdk/protocol/generated.proto")
public final class ProtocolServiceGrpc {

  private ProtocolServiceGrpc() {}

  public static final String SERVICE_NAME = "github.com.bblfsh.sdk.protocol.ProtocolService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<github.com.bblfsh.sdk.protocol.Generated.ParseRequest,
      github.com.bblfsh.sdk.protocol.Generated.ParseResponse> METHOD_PARSE =
      io.grpc.MethodDescriptor.<github.com.bblfsh.sdk.protocol.Generated.ParseRequest, github.com.bblfsh.sdk.protocol.Generated.ParseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "github.com.bblfsh.sdk.protocol.ProtocolService", "Parse"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              github.com.bblfsh.sdk.protocol.Generated.ParseRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              github.com.bblfsh.sdk.protocol.Generated.ParseResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtocolServiceStub newStub(io.grpc.Channel channel) {
    return new ProtocolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtocolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProtocolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtocolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProtocolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProtocolServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Parse uses DefaultParser to process the given parsing request to get the UAST.
     * </pre>
     */
    public void parse(github.com.bblfsh.sdk.protocol.Generated.ParseRequest request,
        io.grpc.stub.StreamObserver<github.com.bblfsh.sdk.protocol.Generated.ParseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PARSE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PARSE,
            asyncUnaryCall(
              new MethodHandlers<
                github.com.bblfsh.sdk.protocol.Generated.ParseRequest,
                github.com.bblfsh.sdk.protocol.Generated.ParseResponse>(
                  this, METHODID_PARSE)))
          .build();
    }
  }

  /**
   */
  public static final class ProtocolServiceStub extends io.grpc.stub.AbstractStub<ProtocolServiceStub> {
    private ProtocolServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtocolServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtocolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parse uses DefaultParser to process the given parsing request to get the UAST.
     * </pre>
     */
    public void parse(github.com.bblfsh.sdk.protocol.Generated.ParseRequest request,
        io.grpc.stub.StreamObserver<github.com.bblfsh.sdk.protocol.Generated.ParseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PARSE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProtocolServiceBlockingStub extends io.grpc.stub.AbstractStub<ProtocolServiceBlockingStub> {
    private ProtocolServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtocolServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtocolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parse uses DefaultParser to process the given parsing request to get the UAST.
     * </pre>
     */
    public github.com.bblfsh.sdk.protocol.Generated.ParseResponse parse(github.com.bblfsh.sdk.protocol.Generated.ParseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PARSE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProtocolServiceFutureStub extends io.grpc.stub.AbstractStub<ProtocolServiceFutureStub> {
    private ProtocolServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtocolServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtocolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Parse uses DefaultParser to process the given parsing request to get the UAST.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<github.com.bblfsh.sdk.protocol.Generated.ParseResponse> parse(
        github.com.bblfsh.sdk.protocol.Generated.ParseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PARSE, getCallOptions()), request);
    }
  }

  private static final int METHODID_PARSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProtocolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProtocolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARSE:
          serviceImpl.parse((github.com.bblfsh.sdk.protocol.Generated.ParseRequest) request,
              (io.grpc.stub.StreamObserver<github.com.bblfsh.sdk.protocol.Generated.ParseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ProtocolServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return github.com.bblfsh.sdk.protocol.Generated.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProtocolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtocolServiceDescriptorSupplier())
              .addMethod(METHOD_PARSE)
              .build();
        }
      }
    }
    return result;
  }
}

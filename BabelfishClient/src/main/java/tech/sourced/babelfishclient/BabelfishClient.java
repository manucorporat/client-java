/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.sourced.babelfishclient;
/**
 *
 * @author manu
 */
public class BabelfishClient {
    
    private final String endpoint;
    
    public BabelfishClient(String endpoint) {
        this.endpoint = endpoint;
        System.out.printf("Connecting to %s\n", endpoint);
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }
    
}

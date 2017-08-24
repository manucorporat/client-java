/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.sourced.babelfishcli;

import tech.sourced.babelfishclient.BabelfishClient;

/**
 *
 * @author manu
 */
public class BabelfishCLI {
    
    public static void main(String[] args) {
        BabelfishClient client = new BabelfishClient("0.0.0.0:4123");   
    }
    
}

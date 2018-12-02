package com.example.bank.server.rest_server;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.example.bank.bankservices.resource.KontoResource;
import com.example.bank.bankservices.resource.KundenResource;
import com.sun.net.httpserver.HttpServer;


public class Server {
	
	public static void main (String args[]) throws Exception {
		 URI endpoint = new URI("http://localhost:55554/bankservices/");
		 ResourceConfig rc=new ResourceConfig(KontoResource.class, KundenResource.class);
		 HttpServer server = JdkHttpServerFactory.createHttpServer(endpoint, rc);
		 } 

}

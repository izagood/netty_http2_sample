package test.java.io.netty.example.http2;

import org.junit.Test;

import main.java.io.netty.example.http2.helloworld.client.Http2Client;
import main.java.io.netty.example.http2.helloworld.server.Http2Server;

public class TestHttp2ClientServer {
	Http2Client client = new Http2Client();
	Http2Server server = new Http2Server();
	
	@Test
	public void testCommunication() throws Exception {
		
	}
}

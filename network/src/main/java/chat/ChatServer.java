package chat;

import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	private void doJoin(String nickName, Writer writer) {
		this.nickName = nickName;
	}

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			// 1. 서버 소켓 생성
			serverSocket = new ServerSocket();
			
			// 2. 바인딩
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			log("starts..." + hostAddress + ":" + PORT);
			
			while (true) {
				Socket socket = serverSocket.accept();
				new ChatServerThread(socket).start();
			}
		} catch {
			
		}
	}

}

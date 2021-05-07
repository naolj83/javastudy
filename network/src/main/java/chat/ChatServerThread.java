package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatServerThread extends Thread {
	Scanner scanner = new Scanner(System.in);
	private String nickname;
	private Socket socket;
	
	public ChatServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

//			while (true) {
//				String request = br.readLine();
//				if(request == null) {
//					log("클라이언트로 부터 연결 끊김");
//					break;
//				}
//			String[] tokens = request.split(" ");
//				if ("GET".equals(tokens[0])) {
//					log("request:" + tokens[1]);
//					responseStaticResource(pw, tokens[1], tokens[2]);
//			}
//			
			while (true) {
				System.out.println(">>");
				String input = Scanner.nextLine();
			}
		
		
		
		}
	}
	public void log(String message) {
		System.out.println("[RequestHandler#" + getId() + "] " + message);

}

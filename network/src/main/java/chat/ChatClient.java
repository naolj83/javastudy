package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 9999;

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			
			socket = new Socket();
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			
			System.out.println("닉네임>>");
			String nickname = scanner.nextLine();
			pw.println("JOIN:" + nickname);
			String ack = br.readLine();
			if("JOIN:OK".equals(ack)) {
				System.out.println("입장하였습니다. 즐거운 채팅 되세요");
			}
			
			new chatClientThread(socket).start();
			
			
			 
		}
	}

}

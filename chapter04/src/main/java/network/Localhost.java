package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Localhost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
			
			System.out.println(hostName);
			System.out.println(hostAddress);
			
			byte[] addresses = inetAddress.getAddress();
			for(byte address : addresses) {
				// System.out.print(address); -로 나오니까 아래처럼 MSB 변경해줘야함
				System.out.print(address & 0x000000ff);
				System.out.print(".");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
package networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		PrintWriter printwriter = null;
		Scanner scanner = null;		//서버에서 전송되는 메시지를 읽음
		Scanner scan = null;		//서버로 전송할 메시지를 입력받음 

		try {
			socket = new Socket("192.168.0.138",10004);
			System.out.println("192.168.0.138 서버의 10004번 포트로 접속중");
			System.out.println("접속성공! "+socket);
			

			printwriter = new PrintWriter(socket.getOutputStream());
			scanner = new Scanner(socket.getInputStream());
			scan = new Scanner(System.in);

			System.out.println(scanner.nextLine());
			
//			키보드로 입력한 메시지 or 서버에서 전송받은 메시지가 "BYE"면 통신을 끝낸다.
			String msg = "";
			do {
				System.out.print("client >> ");
				msg = scan.nextLine().trim();
				printwriter.write(msg + "\n");
				printwriter.flush();
				if (msg.toUpperCase().equals("BYE")) {
					System.out.println("종료합니다.");
					break;
				}
				msg = scanner.nextLine();
				System.out.println("Server >> "+msg);
				
			} while (!msg.toUpperCase().equals("BYE"));
			
			
			
		} catch (UnknownHostException e) {		} catch (IOException e) {		} 
		finally {
//			클라이언트<->서버 통신이 종료되면, 통신에 사용한 서버, 통신소켓을 닫는다.
				if (socket != null) {
					try {socket.close();} catch (IOException e) {}
				}
			}
		
		
	}

}

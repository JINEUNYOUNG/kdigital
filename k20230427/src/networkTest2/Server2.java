package networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket = null;
		PrintWriter printwriter = null;
		Scanner scanner = null;		//클라이언트에서 전송되는 메시지를 읽음
		Scanner scan = null;		//클라이언트로 전송할 메시지를 입력받음 
		
		try {
			server = new ServerSocket(10004);
			System.out.println("서버시작" + server);
			System.out.println("클라이언트가 접속하길 기다리는중..");
			socket = server.accept();
			System.out.println("클라이언트 접속 확인");
			
			printwriter = new PrintWriter(socket.getOutputStream());
			scanner = new Scanner(socket.getInputStream());
			scan = new Scanner(System.in);
			
//			접속할 메시지를 전송한다.
			
			printwriter.write("어서와랑 클라이언트\n");
			printwriter.flush();
			
			String msg = "";
			do {
				msg = scanner.nextLine();
				System.out.println("client >> "+msg);

				if (msg.toUpperCase().equals("BYE")) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.print("server >> ");
				msg = scan.nextLine().trim();
				printwriter.write(msg + "\n");
				printwriter.flush();
				
			} while (!msg.toUpperCase().equals("BYE"));
			
		} catch (IOException e) {
		} finally {
//		클라이언트<->서버 통신이 종료되면, 통신에 사용한 서버, 통신소켓을 닫는다.
			if (socket != null) {try {socket.close();} catch (IOException e) {}	}
			if (server != null) {try {server.close();} catch (IOException e) {}	}

		}
		
		
		
		
	}

}

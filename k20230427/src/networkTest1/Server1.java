package networkTest1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;	//서버소켓
		Socket socket = null;	//통신소켓
		Scanner scanner = null; //클라이언트에서 전송되는 데이터를 읽음
		PrintWriter printWriter = null; //클라이언트로 데이터를 전송
		try {
//		192.168.0.138 ip 주소를 가지는 10004번 포트를 열어 서버 소켓을 생성한다. 
			server = new ServerSocket(10004);
			System.out.println("서버시작: "+server);
			socket = server.accept();   //지정된 포트로 클라이언트가 접속하기를 기다리며 무한대기
			System.out.println("클라이언트 접속 확인");
			
//		서버->클라이언트 데이터 전송을 위해 전송용 객체를 선언한다 
			printWriter = new PrintWriter(socket.getOutputStream()); //getoutputstream()출력용 객체
//		서버->클라이언트 메시지를 전송한다. => 반드시 끝에 개행 문자 \n
			printWriter.write("어서와랑 \n");
			printWriter.flush();
			scanner = new Scanner(socket.getInputStream());
			System.out.println(scanner.nextLine());
		} catch (IOException e) {
		} finally {
//		클라이언트<->서버 통신이 종료되면, 통신에 사용한 서버, 통신소켓을 닫는다.
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {}
			}
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {}
			}
		}
		
	}

}

package networkTest1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
	
		Socket socket = null;	//통신소켓
		Scanner scanner = null; //서버에서 전송되는 데이터를 읽음
		PrintWriter printWriter = null; //서버로 데이터를 전송
		
//		socket(host,port)
		try {
			//서버에 접속한다.
			System.out.println("192.168.0.138 서버의 10004번 포트로 접속합니다.");
			
			socket = new Socket("192.168.0.138",10004);
			scanner = new Scanner(socket.getInputStream());
			System.out.println(scanner.nextLine());
			printWriter = new PrintWriter(socket.getOutputStream()); //getoutputstream()출력용 객체
//			서버<-클라이언트 메시지를 전송한다. => 반드시 끝에 개행 문자 \n
				printWriter.write("어서와 오래기다렸당 지녕아\n");
				printWriter.flush();
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {}}
		
		
	}
	
		
	}
}
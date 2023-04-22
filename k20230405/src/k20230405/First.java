package k20230405;

public class First {
	
	public static void main(String[] args) {
		
		
//		println 
//		print
		
		System.out.print("안녕자바! \n");
		System.out.println("안녕자바!2 ");
		System.out.printf("%s","안녕자바!3 \n");
		
//		printf		d(decimal 정수) f(float 실수) s(string 문자열) c(char 문자)
//		n  출력할 전 체 자리수, 
//		-왼쪽정렬
//		0 비는 자리에는 0을채움
//		.m 소수점아래 자리수 
		
		System.out.println(100);
		System.out.println(1);
		System.out.println(10000);
		
		System.out.printf("%d\n",100);
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",10000);
		
		System.out.printf("%5d\n",100);
		System.out.printf("%5d\n",1);
		System.out.printf("%-5d\n",100);
		System.out.printf("%05d\n",1);
		System.out.printf("%5d\n",10000);

//		문자열 출력시 0을 사용하면 포맷오류가 발생되니 주의하자
//		System.out.println("%-05s\n",100);
//		출력할 서식문자와 실제 데이터가 달라도 오류남
//		출력서식에 %를 입력하려면 %%와 같이 입력
//		출력서식의 개수보다 데이터가 많으면 이외는 무시됨
//		출력서식의 개수보다 데이터가 적으면 오류남.!!! 주의 
		
		
//		정수와 정수의 연산은 결과도 정수다
//		boolean	1	true false
//		byte	1	2진데이터전송
//		char	2	문자1개
//		short	2	+-32768 사이 정수
//		int		4	
//		long	8
//		float	4	소수점 아래 약 6자리
//		double	8	소수점 아래 약 16자리
		
		
//		##묵시적 형변환(암시적 형변환)
//		형이 다르면 크기가 큰 쪽으로 자동 변환
//		정수는 실수로 변환된다. 
//		##명시적 형변환(casting)
//		프로그래머가 지정해서 변환 
//		(double) 이런식 
	}

}

package k20230411;

public class WhileTest {

	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i =1; i<=10; i++) {            
			sum += i;
		}
		System.out.println("1~10의 합계: "+sum);
		
		
// 	while (조건식) {
//     	    조건식이 참인 동안 반복할 문장;
//        	 ....;
//		}

//    do {
		
//		} while (조건식);    //while문은 ;을 빼먹어선 안된다. 
		
		sum = 0;
		int i = 1;
		while (i <=10) {    //조건식이 항상 참인걸 적으면 무한루프   //조건식이 거짓이면 한번도 안돈다.
			sum += i;
			i++;
		}
		System.out.println("1~10의 합계: "+sum);
		
		
		sum = 0;
		i =1;  //sum = i = 0; 도 된다. 변수선언시에는 사용할 수 없고 초기화할때 가능. //0를 i에 그리고 i를 sum에
	   do {
		  sum += i;
		  i++;
	   } while (i<=10);        //조건식이 거짓이라도 처음 한번은 돈다. 
		System.out.println("1~10의 합계: "+sum);
	}
}



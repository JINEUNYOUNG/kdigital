package k20230411;

public class Stn {
	
	public static void main(String[] args) {
		
		
		int[] data = {1,2,3,4,5};
		
		/*
		
		int max = 0;
		int min = 100;
		
		for (int i=0; i<data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			else if (data[i] < min) {
				min = data[i];
			}
		}
		*/
		
		int max = data[0];
		int min = data[0];
		
		for (int i=1; i<data.length; i++) {
			if (data[i] > max) {
				max = data[i];
				
			} else if (data[i] < min) {
				min = data[i];
			}
			
		}
				
		System.out.printf("최대값은 : %d, 최소값은 : %d\n",max,min);
		
		//전체 데이터의 합계를 계산한 후 최대와 최소를 뺀다
		int sum = 0;
		for (int i=0; i<data.length; i++) {
			sum += data[i];
		}
		sum = sum - max - min;
		double avg = (double) sum / (data.length-2);
		System.out.printf("합계는 %d, 평균은 %f\n",sum,avg);
		
		
	 double stn = 0.00;
	 for (int i=1; i<data.length - 1; i++) {
		 double temp = data[i] - avg;
		 stn += Math.pow(temp, 2);
	 }
	 
	 double var = stn / (data.length -2);

	 System.out.printf("최대값과 최소값을 제외한 나머지 데이터의 분산: %f\n",var);
	 
	 double std = Math.sqrt(var);
	 System.out.printf("최대값과 최소값을 제외한 나머지 데이터의 표준편차: %f",std);
	 
	 
		
		
		
		}
	}


package study_20230422;

public class Arrays {
		public static void main(String[] args) {
			int[] score = {45,25,12,13,73,72};
			int max = score[0];
			int min = score[0];
			
			for (int i = 1; i < score.length; i++) {
				if (score[i] > max) {
					max = score[i];
				}
				else if (score[i] < min) {
					min = score[i];
					}
						
				}
			System.out.println(max+ ","+ min);
		}

		
	
		=
		}


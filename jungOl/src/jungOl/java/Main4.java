package jungOl.java;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		/*정수를 계속 입력 받다가 0이 입력되면 
		 * 입력된 수중 홀수의 합과 평균을 출력하는 프로그램을 작성하시오. 
		 * (정수 미만은 버림)*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = num;
		int avg = 0;

		for(int cnt = 1;num!=0;) {
			num = sc.nextInt();
			
				if(num%2==1) {
					cnt++;
					
					sum+=num;
				
				}if(num==0){
					
					avg = sum/cnt;
					System.out.println("홀수의 합 = "+sum);
					System.out.print("홀수의 평균 = "+avg);
					
				}
				
			
		       }
		
		}
		
}
			

				
		
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



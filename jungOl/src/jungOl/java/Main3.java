package jungOl.java;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		/*정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
		 * 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = num;
		double avg = 1;

		for(int cnt = 1;num<100;) {
			num = sc.nextInt();
			sum+=num;
			cnt++;
				if(num>=100) {
						
				System.out.println(+sum);
				
				}if(num>=100){
				
					avg = (double)sum/cnt;
					
					System.out.printf("%.1f",avg);
					
				}
				
			
		       }
		
		}
		
}
			

				
		
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



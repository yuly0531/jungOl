package jungOl.java;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		/*정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고 
		 * 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램을 작성하시오. 
		 * (평균은 반올림하여 소수 둘째자리까지 출력한다.)
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("number? ");
		
		
		double avg = 1;
		int cnt = 0;
		int sum = 0;
		

		for(int num = sc.nextInt();num!=0;) {
			sum+=num;
			num = sc.nextInt();		//변수위치 되게 중요하네..
			cnt++;					//위치에따라 값이 달라지니 조심!
			

			for(;num==0;){
				if(num==0) {
					System.out.println("입력된 자료의 개수 = "+cnt);
			
			
				}if(num==0) {
					
						
				System.out.println("입력된 자료의 합계 = "+sum);
				}if(num==0){
				
					avg = (double)sum/cnt;
					System.out.printf("입력된 자료의 평균 = "+"%.2f",avg);
					
				break;}
				
			
		       }
		
		}
			
				}
		
		
	}
			
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



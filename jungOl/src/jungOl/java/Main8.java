package jungOl.java;
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		
		/*
		 * 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.

		0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여

		홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
		 * ​*/
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int cnt1 = 0;
		
		int num = sc.nextInt();
		
		for(;num!=0;) {
			
		
			
				if(num%2==0) {
					
					cnt1++;
					
				}else {
					
					cnt++;
					
				}
				num = sc.nextInt();
				
				
			}
			
		
		System.out.println("odd : "+cnt);
		System.out.print("even : "+cnt1);
		}
		
	}
	

		

			

				
		
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



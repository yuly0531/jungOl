package jungOl.java;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		
		/*
		 * 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는
		 *  프로그램을 작성하시오.
		 * ​*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		
		for(int x = 1;x<=num ;x++) {
			
			System.out.print(x+" ");
			if (x==num) {
				
				break;
			}
			
			
		}for(int i =1;i>num ;) {
				
			
			System.out.print(i+" ");
			i--;
			
			if(i==num) {
				System.out.print(num);
				
				break;
			}
			
			
	
			}
			
		}
				 
		
	}

		

			

				
		
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



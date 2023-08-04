package jungOl.java;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		
		for(int num = sc.nextInt(); num<=10;) {
			
			cnt++;
			if(cnt<=num) {
				System.out.println("C언어 프로그래밍");
				
			}else {
				break;
			}
				
		}
		

		
		}
	}


		
		/*
		 * 10 이하의 정수를 입력받아 입력받은 정수만큼 "C언어 프로그래밍"이라고 출력하는 프로그램을 작성하시오

         }

      }

   }
*/
		
		
		
		
		
		
		
		
		
		
		//-------------------------------------------------------
		
		/*
		 * 이거 왜 런타임에러지?
		 * 
		 * while (true) {
			System.out.print("Base = ");
			double Base = sc.nextInt();
			System.out.print("Height = ");
			double Height = sc.nextInt();
			System.out.printf("Triangle width = %.1f", (Base * Height) / 2);
			System.out.println();

			System.out.println("Continue?");
			char con = sc.next().charAt(0);

			if (con == 'y' || con == 'Y') {

			} else if (con == 'n' || con == 'N')
				break;

		}*/

	


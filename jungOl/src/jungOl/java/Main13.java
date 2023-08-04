package jungOl.java;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		int num = 19;
		String st = sc.next();
		
		loop:for(int cnt = 0;;cnt++) {
			System.out.print(st);
			if(cnt==num) {
				break loop;
			}
			
		}

		
		}
	}


		
		/*
		 * 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.

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

	


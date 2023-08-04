package jungOl.java;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		
		for (;;) {

			System.out.print("Base = ");
			double Base = sc.nextDouble();
			System.out.print("Height = ");
			double Height = sc.nextDouble();

			System.out.printf("Triangle width = %.1f", (Base * Height) / 2);
			System.out.println();

			System.out.println("Continue?");
			char con = sc.next().charAt(0);

			if (con == 'y' || con == 'Y') {

			} else if (con == 'n' || con == 'N') {

				break;

			}

		}
		}
	}


		
		/*
		 * 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y'
		 * 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
		 * 
		 * (넓이는 반올림하여 소수 첫째자리까지 출력한다.)​​
		 */

		/*Scanner sc = new Scanner(System.in);	//이게 왜 정답이지???

      System.out.print("Base = ");
      double Base = sc.nextDouble();
      System.out.print("Height = ");
      double Height = sc.nextDouble();
      System.out.printf("Triangle width = %.1f", (Base * Height) / 2);
      System.out.println();

      System.out.print("Continue?");
      char con = sc.next().charAt(0);

      while (con == 'y' || con == 'Y') {
         System.out.print(" Base =");
         Base = sc.nextDouble();
         System.out.print(" Height =");
          Height = sc.nextDouble();
         System.out.printf(" Triangle width = %.1f", (Base * Height) / 2);
         System.out.println();

         System.out.print("Continue?");
         con = sc.next().charAt(0);
         
         
         if (con == 'n' || con == 'N') {

            break;

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

	


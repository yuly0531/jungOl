package jungOl.java;

import java.util.Scanner;


public class Main10 {
	public static void main(String[] args) {

		/*
		 * 0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오. ​
		 */

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt = 0;

		for (; num != 0;) {
				cnt++;
			if (num % 3 == 0) {
				cnt1++;

			}
			else if (num % 5 == 0) {

				cnt2++;

			} else if (num == 0) {

				break;

			}

			num = sc.nextInt();

		}

		System.out.println(cnt - (cnt1 + cnt2));

	}

}

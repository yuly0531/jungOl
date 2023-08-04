package jungOl.java;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		
		/*아래 예와 같이 메시지를 출력하고 숫자를 입력받아 선택한 번호에 
		 * 해당하는 메시지를 출력하는 작업을 반복하다가 4가 입력되면 
		 * 메시지 출력 후 종료하는 프로그램을 작성하시오. 
		 * (1~4 이외의 수가 입력되면 "잘못 입력하였습니다." 
		 * 라고 출력한다.)*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1. 입력하기\n"
				+ "2. 출력하기\n"
				+ "3. 삭제하기\n"
				+ "4. 끝내기\n"
				+ "작업할 번호를 선택하세요. \n"
				+ "");
		

		
		loop:for(int num = sc.nextInt(); ;) {
			
			
			switch(num) {
				
			case 1 : System.out.println("입력하기를 선택하였습니다.\n");break;
			case 2 : System.out.println("출력하기를 선택하였습니다.\n");break;
			case 3 : System.out.println("삭제하기를 선택하였습니다.\n");break;
			case 4  :System.out.println("끝내기를 선택하였습니다.");  break loop;
			default : System.out.println("잘못 입력하였습니다.\n");
			
	
			}
			System.out.print("1. 입력하기\n"
					+ "2. 출력하기\n"
					+ "3. 삭제하기\n"
					+ "4. 끝내기\n"
					+ "작업할 번호를 선택하세요. \n"
					+ "");
			num = sc.nextInt();
		}
				 
		
	}
}
		

			

				
		
			
			
			
				
		
			
				
		
		
			
		
		
		
		
		
		
	


	


	
		

	



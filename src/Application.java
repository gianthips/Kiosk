import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master ma = new Master();
		while(true) {
			System.out.println("1. 메뉴 및 주문 받기");
			System.out.println("2. 김밥 재료 구성");
			System.out.println("3. 재료 계산");
			System.out.println("4. 매상 계산");
			System.out.print("5. 시스템 종료");
			System.out.print("");
			
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
			switch(no) {
				case 1: 
					ma.menuNotice();
				case 2: 
					ma.orderTotalSpecies();
					ma.orderSpecies();
					ma.orderAmount();
					ma.calculator();
					ma.ordercomp();
		
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
	}

}

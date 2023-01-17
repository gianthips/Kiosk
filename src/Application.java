import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerMethods ma = new CustomerMethods();
		while(true) {
			System.out.println("1. 메뉴 제시 및 주문 받기");
			System.out.println("2. 김밥 재료 구성");
			System.out.println("3. 재료 계산");
			System.out.println("4. 매상 계산");
			System.out.println("5. 시스템 종료");
			System.out.println("");
			
			Scanner sc = new Scanner(System.in);
			String no = sc.next();
			
			switch(no) {
				case "1": 
					ma.menuNotice(); //메뉴 노티스
					ma.orderCheckandMake(); //주문 받아서, 주문 체크 후 저장.
					
					
					
				case "2": 
					ma.orderTotalSpecies();
					ma.orderSpecies();
					ma.orderAmount();
					ma.calculator();
					ma.ordercomp();
		
				case "9": System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
	}

}

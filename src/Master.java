import java.util.Scanner;
import java.math.*;


public class Master {

	public void menuNotice() {
		
		System.out.println("====메뉴====");
		System.out.println("1. 야채김밥");
		System.out.println("2. 참치김밥");
		System.out.println("3. 김치김밥");
		System.out.println("4. 참치김치김밥");
		System.out.println("우리는 카드만 받습니다!^^");
		System.out.println("");
		System.out.println("주문번호: ");
		
	}
	
	public Orders orderCheckandMake() {		
		
		int q_menunum = 0; //주문 번호가 제대로 입력되었는지 여부를 따지는 index
		int q_ordernum = 0; //주문 수량이 제대로 입력되었는지 여부를 따지는 index
		int menuNum = 0;
		int orderNum = 0;
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
						
		while(q_menunum == 0) {
			String menuNumTemp = sc.next();
			if(ch.menuNumCheck(menuNumTemp)) {
				menuNum = Integer.parseInt(menuNumTemp);
				q_menunum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_menunum = 0;
			}
		}
		
		while(q_ordernum == 0) {
			String orderNumTemp = sc.next();
			if(ch.orderNumCheck(orderNumTemp)) {
				orderNum = Integer.parseInt(orderNumTemp);
				q_ordernum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_ordernum = 0;
			}			
		}		
		return new Orders(menuNum, orderNum);
	}
	
	public Orders[] orderArray() {
		Orders[] soo = {};
		
		
		return Orders[];		
	}
	
	
}
	

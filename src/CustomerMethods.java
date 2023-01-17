import java.util.Scanner;
import java.math.*;


public class CustomerMethods {
	
	public void menuNotice() {
		
		System.out.println("====메뉴====");
		System.out.println("1. 야채김밥");
		System.out.println("2. 참치김밥");
		System.out.println("3. 김치김밥");
		System.out.println("4. 참치김치김밥");
		System.out.println("우리는 카드만 받습니다!^^");
		System.out.println("");
		
	}
	
	public Orders orderCheckandMake() {		
		
		int q_menunum = 0; //주문 번호가 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int q_ordernum = 0; //주문 수량이 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int orderFinishNum = 0;//주문이 완료되었는지 여부를 따지는 index. 0이면 추가 입력이 있을 예정.
		int menuNum = 0;
		int orderNum = 0;
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		
		while(q_menunum == 0) {
			System.out.println("주문번호: ");
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
			System.out.println("몇 개를 구매하시겠습니까?: ");
			String orderNumTemp = sc.next();
			if(ch.orderNumCheck(orderNumTemp)) {
				orderNum = Integer.parseInt(orderNumTemp);
				q_ordernum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_ordernum = 0;
			}			
		}
		
		System.out.println("주문을 완료하셨습니까? Y/N" );
		String orderTablingTemp = sc.next();
		if(ch.orderContinueCheck(orderTablingTemp)) {
			if(orderTablingTemp == "Y" ) {
				orderFinishNum=1;
			}else {
				orderFinishNum=0;				
			}
			
		}else{
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			orderFinishNum = 0;			
		}
		
		
		return new Orders(menuNum, orderNum, orderFinishNum);
	}
	
	
}
	
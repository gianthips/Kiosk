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
	
	public Orders orderCheckandMake() {		//order 한 줄을 만드는 코드
		
		int q_menuNum = 0; //주문 번호가 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int q_orderNum = 0; //주문 수량이 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int orderFinishNum = 0;//주문이 완료되었는지 여부를 따지는 index. 0이면 추가 입력이 있을 예정.
		int menuNum = 0;
		int orderNum = 0;
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		
		while(q_menuNum == 0) {
			System.out.println("주문번호: ");
			String menuNumTemp = sc.next();
			if(ch.menuNumCheck(menuNumTemp)) {
				menuNum = Integer.parseInt(menuNumTemp);
				q_menuNum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_menuNum = 0;
			}
		}
		
		while(q_orderNum == 0) {
			System.out.println("몇 개를 구매하시겠습니까?: ");
			String orderNumTemp = sc.next();
			if(ch.orderNumCheck(orderNumTemp)) {
				orderNum = Integer.parseInt(orderNumTemp);
				q_orderNum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_orderNum = 0;
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
	
	public Orders[] orderTabling(Orders[] table, Orders newOrder) {//table 작성. array가 0부터 시작하는 것을 고려하여 섬세하게 해야된다.
		
		int i = table.length;
		Orders[] newtable;
		//깊은 복사
		if(i==0) {			
			newtable = new Orders[1];
			newtable[1] = newOrder;		
		}else {
			newtable = new Orders[i+1];			
			for(int j=0;j<i;j++) {
			newtable[j]=table[j];	
			}			
			newtable[i+1] = newOrder;			
		}		
		return newtable;		
	}		
}
	

import java.util.Scanner;
import java.math.*;


public class CustomerMethods {
	
	public void menuNotice() {    
		

		System.out.println("====================");
		System.out.println("****메뉴****");
		System.out.println("1. 야채김밥");
		System.out.println("2. 참치김밥");
		System.out.println("3. 김치김밥");
		System.out.println("4. 참치김치김밥");
		System.out.println("우리는 카드만 받습니다!^^");
		System.out.println("====================");
		System.out.println("");
		
	}
	
	public Orders orderCheckandMake() {		//order 한 줄을 만드는 코드
		
		int q_menuNum = 0; //주문 번호가 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int q_orderNum = 0; //주문 수량이 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int q_orderFinish = 0; //주문을 완료하였는지에 대한 메세지가 제대로 입력되었는지 여부를 따지는 index. 0이면 잘못 입력.
		int orderFinishNum = 0;//전체적으로 주문이 완료되었는지 여부를 따지는 index. 0이면 추가 입력이 있을 예정.
		int menuNum = 0;
		String menuName = "";
		int orderNum = 0;
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		
	
		while(q_menuNum == 0) {
			System.out.println("주문번호: ");
			String menuNumTemp = sc.next();
			
			if(ch.menuNumCheck(menuNumTemp)) {
				menuNum = Integer.parseInt(menuNumTemp);
				menuName = ch.orderClassification(menuNum);
				System.out.println(menuName + "을 주문합니다.");
				
				q_menuNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_menuNum = 0;
			}
	
		}
	
		while(q_orderNum == 0) {
			System.out.println("몇 개를 구매하시겠습니까?: ");
			String orderNumTemp = sc.next();
			if(ch.StringNumCheck(orderNumTemp)) {
				orderNum = Integer.parseInt(orderNumTemp);
				System.out.println(orderNum + "개를 주문합니다.");
				q_orderNum = 1;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			q_orderNum = 0;
			}			
		}
	
		while(q_orderFinish==0) {
			System.out.println("주문을 완료하셨습니까? Y/N" );
			String orderTablingTemp = sc.next();
			if(ch.YesNoCheck(orderTablingTemp)) {
				if(orderTablingTemp.equals("Y")) {
					orderFinishNum=1;
				}else {
					orderFinishNum=0;					
				}			
				q_orderFinish = 1;
			}else{
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				orderFinishNum = 0;
				q_orderFinish=0;
			}
		}
						
		return new Orders(menuNum, menuName, orderNum, orderFinishNum);
	}
	
	public Orders[] orderTabling(Orders[] table, Orders newOrder) {//table 작성
		
		int i = table.length;
		Orders[] newtable = new Orders[i+1];
		
		for(int j=0;j<i;j++) {
			newtable[j] = table[j];
		}
		
		if(i==0) {
			newtable[0] = newOrder;
		}else {
			newtable[i] = newOrder; 
		}
		
		return newtable;	

	}	
}
	

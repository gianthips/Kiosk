import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Orders[] tableTemp = {};
		Orders[] tableSave = {};
		
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
					int orderFinishNum = 0;
					CustomerMethods ma = new CustomerMethods();
					ma.menuNotice();
				
					
					/*order를 받아서 table을 계속 채우도록*/
					while(orderFinishNum == 0) {
						Orders newOrder = ma.orderCheckandMake();
						tableTemp = ma.orderTabling(tableTemp, newOrder);
						if(newOrder.orderFinishNum == 0) {
							orderFinishNum = 0;
						}else {orderFinishNum = 1;}						
					}					
					//test
//					System.out.println(tableTemp[0].orderFinishNum);
					tableSave = tableTemp;
					//test
//					System.out.println(tableTemp[0].menuNum + "," + tableTemp[1].menuNum + "," + tableTemp[2].menuNum);					
					break;
					
				case "2": break;
				case "3": break;
				case "4": break;
				
				case "5": System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
	}

}

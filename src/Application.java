import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Orders[] orderTableTemp = {};
		Orders[] orderTableSave = {};
		
		MasterMethods mm = new MasterMethods();
		
		Recipe[] rcinit = mm.RecipeTableInitial(); // 레시피 초기화
		Recipe[] rcbefore = rcinit.clone(); // 초기화 한 것을 레시피 변경전 정보로 저장해둠.
		
		Price priceinit = new Price(); // 가격 초기화
		Price pricebefore = new Price(priceinit);//복사생성자를 만들어 변경전 가격으로 저장해둠.		
		
		while(true) {
			System.out.println("====================");
			System.out.println("1. 메뉴 제시 및 주문 받기");
			System.out.println("2. 김밥 재료 구성");
			System.out.println("3. 재료 가격 설정");
			System.out.println("4. 주문 원가 계산");
			System.out.println("5. 매상 계산");
			System.out.println("6. 시스템 종료");
			System.out.println("====================");
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
						orderTableTemp = ma.orderTabling(orderTableTemp, newOrder);
						if(newOrder.orderFinishNum == 0) {
							orderFinishNum = 0;
						}else {orderFinishNum = 1;}						
					}					
							
					orderTableSave = orderTableTemp.clone();//임시 저장
					
//					/*테스트코드*/
//					System.out.println(orderTableSave[0].menuName);
//					System.out.println(orderTableSave[1].menuName);
//					System.out.println(orderTableSave[2].menuName);
//					/*테스트코드*/
					
					break;
					
				case "2":

					mm.RecipeModifyDisplay();
					
					
//					/*테스트코드*/
//					System.out.println(rcbefore[0].laverspecies);
//					System.out.println(rcbefore[0].laver);
//					System.out.println(rcbefore[1].laverspecies);
//					System.out.println(rcbefore[1].laver);
//					System.out.println(rcbefore[2].laverspecies);
//					System.out.println(rcbefore[2].laver);
//					System.out.println(rcbefore[3].laverspecies);
//					System.out.println(rcbefore[3].laver);
//					/*테스트코드*/
					
					Recipe[] rctemp = rcbefore.clone();
					
//					/*테스트코드*/
//					System.out.println(rctemp[0].laverspecies);
//					System.out.println(rctemp[0].laver);
//					System.out.println(rctemp[1].laverspecies);
//					System.out.println(rctemp[1].laver);
//					System.out.println(rctemp[2].laverspecies);
//					System.out.println(rctemp[2].laver);
//					System.out.println(rctemp[3].laverspecies);
//					System.out.println(rctemp[3].laver);
//					/*테스트코드*/
					
					rcbefore = mm.RecipeModifier(rctemp);
					
//					/*테스트코드*/					
//					System.out.println(rcbefore[0].laverspecies);
//					System.out.println(rcbefore[0].laver);
//					System.out.println(rcbefore[1].laverspecies);
//					System.out.println(rcbefore[1].laver);
//					System.out.println(rcbefore[2].laverspecies);
//					System.out.println(rcbefore[2].laver);
//					System.out.println(rcbefore[3].laverspecies);
//					System.out.println(rcbefore[3].laver);
//					/*테스트코드*/
					
					break;
					
				case "3": 
					/*테스트코드*/
					System.out.println(pricebefore.laverP + "," + pricebefore.hamP+ "," + pricebefore.carrotP);
					/*테스트코드*/
					
					Price pricetemp = new Price(pricebefore);
					pricebefore = mm.PriceModifier(pricetemp);
					

					/*테스트코드*/
					System.out.println(pricebefore.laverP + "," + pricebefore.hamP+ "," + pricebefore.carrotP);
					/*테스트코드*/
					
					break;			
				
				case "4": break;
				case "5": break;
				case "6": System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
			}
			
		}
	}

}

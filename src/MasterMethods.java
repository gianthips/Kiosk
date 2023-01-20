import java.util.Scanner;

public class MasterMethods {
	
	public void RecipeModifyDisplay() {
		System.out.println("===어떤 메뉴의 재료 구성을 변경하시겠습니까?===");
		System.out.println("1. 야채김밥");
		System.out.println("2. 김치김밥");
		System.out.println("3. 참치김밥");
		System.out.println("4. 참치김치김밥");		
	}
		
	public Recipe[] RecipeTableInitial() {
		Recipe[] rcinit = new Recipe[4]; 
		rcinit[0] = new Recipe("완도곱창김", "홍천쌀", "스팸", 1, 1, 1, 1, 1, 1, 1, 1);//야채김밥
		rcinit[1] = new Recipe("완도곱창김", "홍천쌀", "스팸", 1, 1, 1, 1, 1, 1, 1, 1, 1);//김치김밥
		rcinit[2] = new Recipe("완도곱창김", "홍천쌀", "스팸", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);//참치김밥
		rcinit[3] = new Recipe("완도곱창김", "홍천쌀", "스팸", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);//참치김치김밥
		return rcinit;		
	}
	
	public Recipe RecipeMaker(int menuNum) { //Recipe를 리턴하려면 최초에 값 선언을 해줘야 함. 근데 그러면 초기화가 되어 버림. 
		
		int q_recipeOn = 0;
			
		String laverspecies; String ricespecies; String hamspecies; 
		/*각 재료의 수량을 일단 String으로 받는다.*/
		String laverSA; String hamSA; String carrotSA; String spinachSA;
		String dakuangSA; String sesameoilSA; String vinegarSA; String sesameSA;
		String kimchiSA; String tunaSA; String mayoSA;
		
		int laverA=0; int hamA=0; int carrotA=0; int spinachA=0;
		int dakuangA=0; int sesameoilA=0; int vinegarA=0; int sesameA=0;
		int kimchiA=0; int tunaA=0; int mayoA=0;
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();

//		while(q_menuNum == 0) {
//			System.out.println("변경할 메뉴 번호: ");
//			String menuNumTemp = sc.next();
//			
//			if(ch.menuNumCheck(menuNumTemp)) {
//				menuNum = Integer.parseInt(menuNumTemp);
//				menuName = ch.orderClassification(menuNum);
//				System.out.println(menuName + "의 재료 구성을 변경합니다.");
//				
//				q_menuNum = 1;
//			}else {
//				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//				q_menuNum = 0;
//			}	
//		}
		
		/*종류 입력*/
		//김 종류나 원산지
		System.out.println("김의 종류나 원산지를 입력하세요.: ");
		laverspecies = sc.next();
		//쌀 종류나 원산지
		System.out.println("쌀의 종류나 원산지를 입력하세요.: ");
		ricespecies = sc.next();
		//햄 종류나 원산지
		System.out.println("햄의 종류나 원산지를 입력하세요.: ");
		hamspecies = sc.next();
		
		/*재료 on/off 입력*/
		//김		
		while(q_recipeOn==0) {
			System.out.println("김을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			laverSA = sc.next();
			if(ch.YesNoCheck(laverSA)) {
				if(laverSA.equals("Y")) {
					laverA = 1;
				}else {
					laverA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//햄		
		while(q_recipeOn==0) {
			System.out.println("햄을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			hamSA = sc.next();
			if(ch.YesNoCheck(hamSA)) {
				if(hamSA.equals("Y")) {
					hamA = 1;
				}else {
					hamA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//당근	
		while(q_recipeOn==0) {
			System.out.println("당근을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			carrotSA = sc.next();
			if(ch.YesNoCheck(carrotSA)) {
				if(carrotSA.equals("Y")) {
					carrotA = 1;
				}else {
					carrotA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//시금치	
		while(q_recipeOn==0) {
			System.out.println("시금치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			spinachSA = sc.next();
			if(ch.YesNoCheck(spinachSA)) {
				if(spinachSA.equals("Y")) {
					spinachA = 1;
				}else {
					spinachA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//단무지
		while(q_recipeOn==0) {
			System.out.println("단무지를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			dakuangSA = sc.next();
			if(ch.YesNoCheck(dakuangSA)) {
				if(dakuangSA.equals("Y")) {
					dakuangA = 1;
				}else {
					dakuangA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//참기름
		while(q_recipeOn==0) {
			System.out.println("참기름을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			sesameoilSA = sc.next();
			if(ch.YesNoCheck(sesameoilSA)) {
				if(sesameoilSA.equals("Y")) {
					sesameoilA = 1;
				}else {
					sesameoilA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;
		
		//식초
		while(q_recipeOn==0) {
			System.out.println("식초를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			vinegarSA = sc.next();
			if(ch.YesNoCheck(vinegarSA)) {
				if(vinegarSA.equals("Y")) {
					vinegarA = 1;
				}else {
					vinegarA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;		
					
		//참깨
		while(q_recipeOn==0) {
			System.out.println("참깨를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			sesameSA = sc.next();
			if(ch.YesNoCheck(sesameSA)) {
				if(sesameSA.equals("Y")) {
					sesameA = 1;
				}else {
					sesameA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;	
				
		//김치
		//김치김밥, 김치참치김밥
		while((menuNum==2||menuNum==4)&&(q_recipeOn==0)) {
			System.out.println("김치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			kimchiSA = sc.next();
			if(ch.YesNoCheck(kimchiSA)) {
				if(kimchiSA.equals("Y")) {
					kimchiA = 1;
				}else {
					kimchiA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;	
		
		//참치
		//참치김밥, 김치참치김밥
		while((menuNum==3||menuNum==4)&&q_recipeOn==0) {
			System.out.println("참치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			tunaSA = sc.next();
			if(ch.YesNoCheck(tunaSA)) {
				if(tunaSA.equals("Y")) {
					tunaA = 1;
				}else {
					tunaA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;	
		
		//마요
		//참치김밥, 김치참치김밥
		while((menuNum==3||menuNum==4)&&q_recipeOn==0) {
			System.out.println("마요를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			mayoSA = sc.next();
			if(ch.YesNoCheck(mayoSA)) {
				if(mayoSA.equals("Y")) {
					mayoA = 1;
				}else {
					mayoA = 0;					
				}
				q_recipeOn = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeOn = 0;
			}			
		}
		q_recipeOn = 0;	
					
		if(menuNum==1) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laverA, hamA, carrotA,
					spinachA, dakuangA, sesameoilA, vinegarA, sesameA);
		}else if(menuNum==2) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laverA, hamA, carrotA,
					spinachA, dakuangA, sesameoilA, vinegarA, sesameA, kimchiA);
		}else if(menuNum==3) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laverA, hamA, carrotA,
					spinachA, dakuangA, sesameoilA, vinegarA, sesameA, tunaA, mayoA);
		}else {
			return new Recipe(laverspecies, ricespecies, hamspecies, laverA, hamA, carrotA,
					spinachA, dakuangA, sesameoilA, vinegarA, sesameA, kimchiA, tunaA,	mayoA);
		}
	}
	public Recipe[] RecipeModifier(Recipe[] rcbefore) {
		
		int q_recipeModify = 0;
		int menuNum = 0;
		String menuName = "";
				
		Recipe[] rcafter = rcbefore.clone();
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		MasterMethods mm = new MasterMethods();
		
		while(q_recipeModify == 0) {
		System.out.println("변경할 메뉴 번호: ");
		String menuNumTemp = sc.next();
		
			if(ch.menuNumCheck(menuNumTemp)) {
				menuNum = Integer.parseInt(menuNumTemp);
				menuName = ch.orderClassification(menuNum);
				System.out.println(menuName + "의 재료 구성을 변경합니다.");
								
				if(menuNum==1) {
					rcafter[menuNum-1] = mm.RecipeMaker(menuNum);//array 사이즈 맞춰야 함.
				}else if(menuNum==2) {
					rcafter[menuNum-1] = mm.RecipeMaker(menuNum);					
				}else if(menuNum==3) {
					rcafter[menuNum-1] = mm.RecipeMaker(menuNum);					
				}else {
					rcafter[menuNum-1] = mm.RecipeMaker(menuNum);					
				}

				int q_yesOrNo=0;
				
				while(q_yesOrNo==0) {
					System.out.println("재료 구성 변경을 완료하셨습니까? Y/N" );
					String orderTablingTemp = sc.next();
					if(ch.YesNoCheck(orderTablingTemp)) {
						if(orderTablingTemp.equals("Y")) {
							q_recipeModify=1;
						}else {
							q_recipeModify=0;					
						}			
						q_yesOrNo = 1;
					}else{
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_yesOrNo=0;
					}
				}
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeModify = 0;
			}
		}		
		return rcafter;
	}
	
//	price 클래스로 옮긴다.
//	public Price PriceDataInitial() {
//		//천원 단위
//		double laverP=1; double hamP=2; double carrotP=2; double spinachP=3;
//		double dakuangP=1; double sesameoilP=0.5; double vinegarP=0.3; double sesameP=0.5;
//		double kimchiP=2; double tunaP=3; double mayoP=2;
//		
//		return new Price(laverP, hamP, carrotP, spinachP, dakuangP, sesameoilP, vinegarP, sesameP,
//				kimchiP, tunaP, mayoP) ;
//	}
//	
	public Price PriceModifier(Price pricebefore) {
		
				
		String laverSP; String hamSP; String carrotSP; String spinachSP;
		String dakuangSP; String sesameoilSP; String vinegarSP; String sesameSP;
		String kimchiSP; String tunaSP; String mayoSP;

//		double laverP=0; double hamP=0; double carrotP=0; double spinachP=0;
//		double dakuangP=0; double sesameoilP=0; double vinegarP=0; double sesameP=0;
//		double kimchiP=0; double tunaP=0; double mayoP=0;
		
		Price pricetemp = new Price(pricebefore);
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		
		
		int q_priceModifierTotal = 0;
		int q_priceModifierEach = 0;
				
		while(q_priceModifierTotal==0) {
			
			pricetemp = new Price(pricetemp);
			
			System.out.println("====================");
			System.out.println("수정코자 하는 재료를 선택해주세요.");
			System.out.println("1.김, 2.햄, 3.당근, 4.시금치, 5.단무지, 6.참기름, 7.식초");
			System.out.println("8.참깨, 9.김치, 10. 참치, 11.마요네즈, 12.변경없음");
			System.out.println("====================");
			System.out.println("");			
			
			String modiMenuNumS = sc.next();
			int modiMenuNumI = 0;
			
			int q_modiMenuNum = 0;
			while(q_modiMenuNum==0) {
				if(ch.modiNumCheck(modiMenuNumS)) {
					q_modiMenuNum = 1;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					q_modiMenuNum = 0;
				}
			}
			modiMenuNumI = Integer.parseInt(modiMenuNumS);
			//한번체크해주고
			
			//////////
			String[] ingrediant = {"김","햄","당근","시금치","단무지",
									"참기름","식초","참깨","김치","참치",
									"마요네즈"};
			String[] SP = {"laverSP","hamSP","carrotSP","spinachSP","dakuangSP",
							"sesameoilSP", "vinegarSP", "sesameSP", "kimchiSP","tunaSP",
							"mayoSP"};
			String[] P = {"laverP","hamP","carrotP","spinachP","dakuangP",
							"sesameoilP", "vinegarP", "sesameP", "kimchiP", "tunaP",
							"mayoP"};
						
			q_priceModifierEach=0;
			while(q_priceModifierEach==0) {
				System.out.println(ingrediant[modiMenuNumI-1] + "의 가격을 입력해주세요.");
				
			}		
			//////////
			
			
			
			
			
			switch(modiMenuNumS) {
			case "1":
				q_priceModifierEach=0;
//				//테스트
//				System.out.println("하하 case1에서 " + pricetemp.laverP);
				System.out.println("김의 가격을 입력해주세요.: ");
//				System.out.println("q_priceModifierEach: "+q_priceModifierEach);
				laverSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(laverSP)) {
						pricetemp.laverP = Double.parseDouble(laverSP);
//						//테스트
//						System.out.println("호호 case1에서 " + pricetemp.laverP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				//원래 여기에 q_priceModifierEach=0;이 있었는데 그러면 이후의 case 2,3,4에서 q_priceModifierEach가 1로 잡혔음.
//				//테스트
//				System.out.println("case1에서 " + pricetemp.laverP);
//				System.out.println("case1에서 " + pricetemp.hamP);
//				System.out.println("case1에서 " + pricetemp.carrotP);
				break;

			case "2":
				q_priceModifierEach=0;
//				//테스트
//				System.out.println("하하 case2에서 " + pricetemp.hamP);
				System.out.println("햄의 가격을 입력해주세요.: ");
//				System.out.println("q_priceModifierEach: "+q_priceModifierEach);
				hamSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(hamSP)) {
						pricetemp.hamP = Double.parseDouble(hamSP);
//						//테스트
//						System.out.println("호호 case2에서 " + pricetemp.hamP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
//				//테스트
//				System.out.println("case2에서 " + pricetemp.laverP);
//				System.out.println("case2에서 " + pricetemp.hamP);
//				System.out.println("case2에서 " + pricetemp.carrotP);
				break;

			case "3":	
				q_priceModifierEach=0;
//				//테스트
//				System.out.println("하하 case3에서 " + pricetemp.carrotP);
				System.out.println("당근의 가격을 입력해주세요.: ");
//				System.out.println("q_priceModifierEach: "+q_priceModifierEach);
				carrotSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(carrotSP)) {
						pricetemp.carrotP = Double.parseDouble(carrotSP);
//						//테스트
//						System.out.println("호호 case3에서 " + pricetemp.carrotP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
//				//테스트
//				System.out.println("case3에서 " + pricetemp.laverP);
//				System.out.println("case3에서 " + pricetemp.hamP);
//				System.out.println("case3에서 " + pricetemp.carrotP);
				break;

			case "4":
				q_priceModifierEach=0;
				System.out.println("시금치의 가격을 입력해주세요.: ");
				spinachSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(spinachSP)) {
						pricetemp.spinachP = Double.parseDouble(spinachSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "5":
				q_priceModifierEach=0;
				System.out.println("단무지의 가격을 입력해주세요.: ");
				dakuangSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(dakuangSP)) {
						pricetemp.dakuangP = Double.parseDouble(dakuangSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;				

			case "6":
				q_priceModifierEach=0;
				System.out.println("참기름의 가격을 입력해주세요.: ");
				sesameoilSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(sesameoilSP)) {
						pricetemp.sesameoilP = Double.parseDouble(sesameoilSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "7":
				q_priceModifierEach=0;
				System.out.println("식초의 가격을 입력해주세요.: ");
				vinegarSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(vinegarSP)) {
						pricetemp.vinegarP = Double.parseDouble(vinegarSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "8":
				q_priceModifierEach=0;
				System.out.println("참깨의 가격을 입력해주세요.: ");
				sesameSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(sesameSP)) {
						pricetemp.sesameP = Double.parseDouble(sesameSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "9":
				q_priceModifierEach=0;
				System.out.println("김치의 가격을 입력해주세요.: ");
				kimchiSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(kimchiSP)) {
						pricetemp.kimchiP = Double.parseDouble(kimchiSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;
				
			case "10":
				q_priceModifierEach=0;
				System.out.println("참치의 가격을 입력해주세요.: ");
				tunaSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(tunaSP)) {
						pricetemp.tunaP = Double.parseDouble(tunaSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "11":
				q_priceModifierEach=0;
				System.out.println("마요네즈의 가격을 입력해주세요.: ");
				mayoSP = sc.next();
				while(q_priceModifierEach==0) {
					if(ch.StringNumCheck(mayoSP)) {
						pricetemp.mayoP = Double.parseDouble(mayoSP);
						q_priceModifierEach=1;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach=0;
					}					
				}
				break;

			case "12":
				q_priceModifierTotal=1;
				break;
				
			}
				q_priceModifierEach=0;
				while((!modiMenuNumS.equals("12")) && q_priceModifierEach==0) {
					System.out.println("추가로 다른 재료의 가격 변경을 원하십니까? Y/N" );
					String yesOrNo = sc.next();
					if(ch.YesNoCheck(yesOrNo)) {
						if(yesOrNo.equals("N")) {
							q_priceModifierTotal=1;
						}else {
							q_priceModifierTotal=0;					
						}			
						q_priceModifierEach = 1;
					}else{
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						q_priceModifierEach = 0;
						q_priceModifierTotal = 0;
					}
				}					
		}
		
		return new Price(pricetemp);
	}
	

	public double[] MenuCost(Recipe[] rcbefore, Price pricebefore) {
		
		double[] menuCost = new double[4];
		
		for (int i = 0; i<4; i++) {
			double laverC = rcbefore[i].laver * pricebefore.laverP;
			double hamC = rcbefore[i].laver * pricebefore.hamP;
			double carrotC = rcbefore[i].laver * pricebefore.carrotP;
			double spinachC = rcbefore[i].laver * pricebefore.spinachP;
			double dakuangC = rcbefore[i].laver * pricebefore.dakuangP;
			double sesameoilC = rcbefore[i].laver * pricebefore.sesameoilP;
			double vinegarC = rcbefore[i].laver * pricebefore.vinegarP;
			double sesameC = rcbefore[i].laver * pricebefore.sesameP;
			double kimchiC = rcbefore[i].laver * pricebefore.kimchiP;
			double tunaC = rcbefore[i].laver * pricebefore.tunaP;
			double mayoC = rcbefore[i].laver * pricebefore.mayoP;
				
			menuCost[i] = laverC + hamC + carrotC + spinachC + dakuangC +
					sesameoilC + vinegarC + sesameC + kimchiC + tunaC + mayoC;
		}		
		return menuCost;
	}
	
	public double TotalCost(Orders[] table, double[] totalC ) {
		int i = table.length;//merge는 따로 만들어줘야
		double[] orderCost = new double[i];
		double totalcost=0;
		
		for(int j=0; j<i; j++) {
			switch(table[j].menuNum) {
			case 1:
				orderCost[j]=totalC[1]*table[j].orderNum;
				totalcost = totalcost+orderCost[j];
				break;
			case 2:
				orderCost[j]=totalC[2]*table[j].orderNum;	
				totalcost = totalcost+orderCost[j];			
				break;
			case 3:
				orderCost[j]=totalC[3]*table[j].orderNum;
				totalcost = totalcost+orderCost[j];				
				break;
			case 4:
				orderCost[j]=totalC[4]*table[j].orderNum;	
				totalcost = totalcost+orderCost[j];			
				break;
			default:
				System.out.println("오류");
				break;
			}
		}
		return totalcost;
	}
	
}



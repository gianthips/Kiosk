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
		
//		int q_menuNum = 0;
		int q_recipeNum = 0;
		int q_modifyContinueNum=0;
		
//		int menuNum=0;
//		String menuName;
		
		String laverspecies; String ricespecies; String hamspecies; 
		String laverS; String hamS; String carrotS; String spinachS;
		String dakuangS; String sesameoilS; String vinegarS; String sesameS;
		String kimchiS; String tunaS; String mayoS;
		
		int laver=0; int ham=0; int carrot=0; int spinach=0;
		int dakuang=0; int sesameoil=0; int vinegar=0; int sesame=0;
		int kimchi=0; int tuna=0; int mayo=0;
		
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
		while(q_recipeNum==0) {
			System.out.println("김을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			laverS = sc.next();
			if(ch.YesNoCheck(laverS)) {
				if(laverS.equals("Y")) {
					laver = 1;
				}else {
					laver = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//햄		
		while(q_recipeNum==0) {
			System.out.println("햄을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			hamS = sc.next();
			if(ch.YesNoCheck(hamS)) {
				if(hamS.equals("Y")) {
					ham = 1;
				}else {
					ham = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//당근	
		while(q_recipeNum==0) {
			System.out.println("당근을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			carrotS = sc.next();
			if(ch.YesNoCheck(carrotS)) {
				if(carrotS.equals("Y")) {
					carrot = 1;
				}else {
					carrot = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//시금치	
		while(q_recipeNum==0) {
			System.out.println("시금치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			spinachS = sc.next();
			if(ch.YesNoCheck(spinachS)) {
				if(spinachS.equals("Y")) {
					spinach = 1;
				}else {
					spinach = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//단무지
		while(q_recipeNum==0) {
			System.out.println("단무지를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			dakuangS = sc.next();
			if(ch.YesNoCheck(dakuangS)) {
				if(dakuangS.equals("Y")) {
					dakuang = 1;
				}else {
					dakuang = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//참기름
		while(q_recipeNum==0) {
			System.out.println("참기름을 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			sesameoilS = sc.next();
			if(ch.YesNoCheck(sesameoilS)) {
				if(sesameoilS.equals("Y")) {
					sesameoil = 1;
				}else {
					sesameoil = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;
		
		//식초
		while(q_recipeNum==0) {
			System.out.println("식초를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			vinegarS = sc.next();
			if(ch.YesNoCheck(vinegarS)) {
				if(vinegarS.equals("Y")) {
					vinegar = 1;
				}else {
					vinegar = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;		
					
		//참깨
		while(q_recipeNum==0) {
			System.out.println("참깨를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			sesameS = sc.next();
			if(ch.YesNoCheck(sesameS)) {
				if(sesameS.equals("Y")) {
					sesame = 1;
				}else {
					sesame = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;	
				
		//김치
		//김치김밥, 김치참치김밥
		while((menuNum==2||menuNum==4)&&(q_recipeNum==0)) {
			System.out.println("김치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			kimchiS = sc.next();
			if(ch.YesNoCheck(kimchiS)) {
				if(kimchiS.equals("Y")) {
					kimchi = 1;
				}else {
					kimchi = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;	
		
		//참치
		//참치김밥, 김치참치김밥
		while((menuNum==3||menuNum==4)&&q_recipeNum==0) {
			System.out.println("참치를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			tunaS = sc.next();
			if(ch.YesNoCheck(tunaS)) {
				if(tunaS.equals("Y")) {
					tuna = 1;
				}else {
					tuna = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;	
		
		//마요
		//참치김밥, 김치참치김밥
		while((menuNum==3||menuNum==4)&&q_recipeNum==0) {
			System.out.println("마요를 넣을지 여부를 Y 또는 N으로 표현해주세요.: ");
			mayoS = sc.next();
			if(ch.YesNoCheck(mayoS)) {
				if(mayoS.equals("Y")) {
					mayo = 1;
				}else {
					mayo = 0;					
				}
				q_recipeNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_recipeNum = 0;
			}			
		}
		q_recipeNum = 0;	
					
		if(menuNum==1) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laver, ham, carrot,
					spinach, dakuang, sesameoil, vinegar, sesame);
		}else if(menuNum==2) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laver, ham, carrot,
					spinach, dakuang, sesameoil, vinegar, sesame, kimchi);
		}else if(menuNum==3) {
			return new Recipe(laverspecies, ricespecies, hamspecies, laver, ham, carrot,
					spinach, dakuang, sesameoil, vinegar, sesame, tuna, mayo);
		}else {
			return new Recipe(laverspecies, ricespecies, hamspecies, laver, ham, carrot,
					spinach, dakuang, sesameoil, vinegar, sesame, kimchi, tuna,	mayo);
		}
	}
	public Recipe[] RecipeModifier(Recipe[] rcbefore) {
		
		int q_menuNum = 0;
		int menuNum = 0;
		String menuName = "";
				
		Recipe[] rcafter = rcbefore.clone();
		
		Scanner sc = new Scanner(System.in);
		Checkers ch = new Checkers();
		MasterMethods mm = new MasterMethods();
		
		while(q_menuNum == 0) {
		System.out.println("변경할 메뉴 번호: ");
		String menuNumTemp = sc.next();
		
			if(ch.menuNumCheck(menuNumTemp)) {
				menuNum = Integer.parseInt(menuNumTemp);
				menuName = ch.orderClassification(menuNum);
				System.out.println(menuName + "의 재료 구성을 변경합니다.");
								
				if(menuNum==1) {
					rcafter[menuNum] = mm.RecipeMaker(menuNum);
				}else if(menuNum==2) {
					rcafter[menuNum] = mm.RecipeMaker(menuNum);					
				}else if(menuNum==3) {
					rcafter[menuNum] = mm.RecipeMaker(menuNum);					
				}else {
					rcafter[menuNum] = mm.RecipeMaker(menuNum);					
				}							
						
				q_menuNum = 1;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				q_menuNum = 0;
			}	
		}		
		return rcafter;
	}
}

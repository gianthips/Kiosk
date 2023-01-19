import java.math.*;

public class Checkers {
/*공유*/
	public boolean menuNumCheck(String menuNum) { //메뉴 주문 번호가 제대로 들어왔는지 체크
		if(menuNum.equals("1") || menuNum.equals("2") | menuNum.equals("3") | menuNum.equals("4")) {
			return true;
		}else {return false;}		
	}
	
	public String orderClassification(int menuNum) {//입력된 메뉴 번호를 확인하여 메뉴 이름을 리턴
		String menuname;

		if(menuNum==1) {
			menuname = "야채김밥";			
		}else if(menuNum==2){
			menuname = "김치김밥";
		}else if(menuNum==3){
			menuname = "참치김밥";
		}else {
			menuname = "참치김치김밥";
		}
		return menuname;
	}
	
	public boolean YesNoCheck(String YesOrNo) {//Yes No question에 대한 체크
		//CustomerMethods에서 주문을 계속할지에 대한 입력이 제대로 들어왔는지 체크하는데 사용
		//MasterMethods에서 재료를 넣을지 말지 체크하는데 사용
		if(YesOrNo.equals("Y") || YesOrNo.equals("N")){
			return true;
		}else {return false;}
	}
	
//에러나서 그냥 본문에 녹임
// public int ContinueCheck(String qCont) {
//		Checkers ch = new Checkers();
//		if(ch.YesNoCheck(qCont)) {
//			if(qCont.equals("Y")) {
//				int cont = 0;
//			}else {
//				int cont = 1;				
//			}		
//		}else {
//			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//		}
//	}
	
/*orders*/
	
	public boolean StringNumCheck(String orderNUM) { //메뉴 주문 갯수가 제대로 들어왔는지 체크
		if(orderNUM.matches("[+-]?\\d*(\\.\\d+)?")) {
			double orderNUMDouble = Double.valueOf(orderNUM);
			
			if((orderNUMDouble>0)&&(orderNUMDouble%1==0)) {
				return true;
			}else {return false;}
		
		}else {return false;}
	}


/*masters*/
	
}
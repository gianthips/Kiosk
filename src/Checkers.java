import java.math.*;

public class Checkers {
	public boolean menuNumCheck(String menuNum) { //메뉴 주문 번호가 제대로 들어왔는지 체크
		if(menuNum.equals("1") || menuNum.equals("2") | menuNum.equals("3") | menuNum.equals("4")) {
			return true;
		}else {return false;}		
	}
	
	public boolean orderNumCheck(String orderNUM) { //메뉴 주문 갯수가 제대로 들어왔는지 체크
		if(orderNUM.matches("[+-]?\\d*(\\.\\d+)?")) {
			double orderNUMDouble = Double.valueOf(orderNUM);
			
			if((orderNUMDouble>0)&&(orderNUMDouble%1==0)) {
				return true;
			}else {return false;}
		
		}else {return false;}
	}
	
	public boolean orderContinueCheck(String orderCONT) {//주문을 계속할지에 대한 입력이 제대로 들어왔는지 체크
		if(orderCONT.equals("Y") || orderCONT.equals("N")){
			return true;
		}else {return false;}
	}
	
	public String orderClassification(int menuNum) {
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
}
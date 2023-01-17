import java.math.*;

public class Checkers {
	public boolean menuNumCheck(String menuNUM) { //메뉴 주문 번호가 제대로 들어왔는지 체크
		if(menuNUM == "1" || menuNUM == "2" | menuNUM == "3") {
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
	
	public boolean orderContinueCheck(String orderCONT) {
		if(orderCONT == "Y" || orderCONT == "N" ){
			return true;
		}else {return false;}
	}
}
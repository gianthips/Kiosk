
public class Orders {

	int menuNum;
	String menuName;
	int orderNum;
	int orderFinishNum;//주문의 끝
	
	public Orders() {
	}
	
	public Orders(int menuNum, int orderNum) {
		this.menuNum = menuNum;
		this.orderNum = orderNum; 
	}
	
	public Orders(int menuNum, int orderNum, int orderFinishNum) {
		this.menuNum = menuNum;
		this.orderNum = orderNum;		
		this.orderFinishNum = orderFinishNum; 
	}
	
	public Orders(int menuNum, String menuName, int orderNum, int orderFinishNum) {
		this.menuNum = menuNum;
		this.menuName = menuName;
		this.orderNum = orderNum;		
		this.orderFinishNum = orderFinishNum; 
	}
	
}

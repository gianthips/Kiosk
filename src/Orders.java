
public class Orders {

	int menuNum;
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

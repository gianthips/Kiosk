
public class Recipe {
	String laverspecies; 
	String ricespecies; 
	String hamspecies; 
	int laver; 
	int ham;
	int carrot;
	int spinach;
	int dakuang;
	int sesameoil;
	int vinegar;
	int sesame;
	int kimch;
	int tuna;
	int mayo;
	//11가지 재료. 야채는 8, 김치는 9, 참치는 10, 김치참치는 11
	
	public Recipe() {}
	
	//야채김밥
	public Recipe(String laverspecies, String ricespecies, String hamspecies, int laver, int ham, int carrot,
			int spinach, int dakuang, int sesameoil, int vinegar, int sesame) {
		super();
		this.laverspecies = laverspecies; this.ricespecies = ricespecies; this.hamspecies = hamspecies;
		this.laver = laver; this.ham = ham; this.carrot = carrot; this.spinach = spinach;
		this.dakuang = dakuang; this.sesameoil = sesameoil; this.vinegar = vinegar; this.sesame = sesame;
	}	
	
	//김치김밥
	public Recipe(String laverspecies, String ricespecies, String hamspecies, int laver, int ham, int carrot,
			int spinach, int dakuang, int sesameoil, int vinegar, int sesame, int kimch) {
		super();
		this.laverspecies = laverspecies; this.ricespecies = ricespecies; this.hamspecies = hamspecies;
		this.laver = laver; this.ham = ham; this.carrot = carrot; this.spinach = spinach;
		this.dakuang = dakuang; this.sesameoil = sesameoil; this.vinegar = vinegar; this.sesame = sesame;
		this.kimch = kimch;
	}	
	
	//참치김밥
	public Recipe(String laverspecies, String ricespecies, String hamspecies, int laver, int ham, int carrot,
			int spinach, int dakuang, int sesameoil, int vinegar, int sesame, int tuna, int mayo) {
		super();
		this.laverspecies = laverspecies; this.ricespecies = ricespecies; this.hamspecies = hamspecies;
		this.laver = laver; this.ham = ham; this.carrot = carrot; this.spinach = spinach;
		this.dakuang = dakuang; this.sesameoil = sesameoil; this.vinegar = vinegar; this.sesame = sesame;
		this.tuna = tuna; this.mayo = mayo;
	}	
	
	//김치참치김밥
	public Recipe(String laverspecies, String ricespecies, String hamspecies, int laver, int ham, int carrot,
			int spinach, int dakuang, int sesameoil, int vinegar, int sesame, int kimch, int tuna,
			int mayo) {
		super();
		this.laverspecies = laverspecies; this.ricespecies = ricespecies; this.hamspecies = hamspecies;
		this.laver = laver; this.ham = ham; this.carrot = carrot; this.spinach = spinach;
		this.dakuang = dakuang; this.sesameoil = sesameoil; this.vinegar = vinegar; this.sesame = sesame;
		this.kimch = kimch; this.tuna = tuna; this.mayo = mayo;
	}	
}


//"(김의 원산지나 종류를 입력해주세요.)김: " enter "(쌀의 원산지나 종류를 입력해주세요.)
//밥: " enter "(햄의 종류를 입력해주세요.)
//햄: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//김: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//밥: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//햄: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//당근: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//시금치: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//단무지: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//참기름: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//식초: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//참깨: " enter 김치김밥에 대해서는 다음의 메세지를 추가 출력한다. "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//김치: " enter 참치김밥에 대해서는 다음의 메세지를 추가 출력한다. "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//참치: " enter "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)
//마요네즈: " enter 참치김치김밥에 대해서는 다음의 메세지를 추가 출력한다. "(재료를 넣을지 여부를 1 또는 0으로(on/off) 표현해주세요.)

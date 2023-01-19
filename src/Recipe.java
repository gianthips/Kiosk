
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
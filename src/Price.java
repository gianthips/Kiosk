
public class Price {
	double laverP;
	double hamP;
	double carrotP;
	double spinachP;
	double dakuangP;
	double sesameoilP;
	double vinegarP;
	double sesameP;
	double kimchiP;
	double tunaP;
	double mayoP;
	
	public Price() {
		this.laverP = 1;
		this.hamP = 2;
		this.carrotP=2;
		this.spinachP=3;
		this.dakuangP=1; 
		this.sesameoilP=0.5;
		this.vinegarP=0.3;
		this.sesameP=0.5;
		this.kimchiP=2;
		this.tunaP=3; 
		this.mayoP=2;
	}
	
	public Price(Price p) {//복사생성자
		this.laverP = p.laverP;
		this.hamP = p.hamP;
		this.carrotP = p.carrotP;
		this.spinachP = p.spinachP;
		this.dakuangP = p.dakuangP;
		this.sesameoilP = p.sesameoilP;
		this.vinegarP = p.vinegarP;
		this.sesameP = p.sesameP;
		this.kimchiP = p.kimchiP;
		this.tunaP = p.tunaP;
		this.mayoP = p.mayoP;
	}

	public Price(double laverP, double hamP, double carrotP, double spinachP, double dakuangP, double sesameoilP, double vinegarP, double sesameP,
			double kimchP, double tunaP, double mayoP) {
		super();
		this.laverP = laverP;
		this.hamP = hamP;
		this.carrotP = carrotP;
		this.spinachP = spinachP;
		this.dakuangP = dakuangP;
		this.sesameoilP = sesameoilP;
		this.vinegarP = vinegarP;
		this.sesameP = sesameP;
		this.kimchiP = kimchP;
		this.tunaP = tunaP;
		this.mayoP = mayoP;
	}
}

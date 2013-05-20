
public abstract class Polynom {

	public double[] polynomCoeff;
	public double[] coeff;
	public static Polynom rez;
	public boolean updated;
	public static int n;
	
	
	
	
	
	//protected void setUpdated () {
		//updated = true; 
	//}
	
	//protected void unsetUpdated () {
		//updated = false;					
	//}
	

	public void getPrint() {
		for (int i = 0; i < n; i++) {
		System.out.println(coeff[i]);
		}
    }
	
	
	public Polynom subtract(Polynom b) {
		Polynom a = this;
		int power = Math.max(a.coeff.length, b.coeff.length);
		for (int i=0; i < power; i++) {
			a.coeff[i] = a.coeff[i] - b.coeff[i];
		    }
		return a;
	}	
	
	
	public Polynom summa(Polynom b) {
		Polynom a = this;
		int power = Math.max(a.coeff.length, b.coeff.length);
		for (int i=0; i < power; i++) {
			a.coeff[i] = a.coeff[i] + b.coeff[i];
		System.out.println(a.coeff[i]);
		}
		return a;
	}
	
	

	
	public boolean isNull() {
		for (int i = 0; i < n; i++) {
			if (coeff[i] != 0) 
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {

		
		

	}

}


public class Polynom {
  protected double[] coefficients;
	private int deg;
	private boolean updated;
	private final double epsilon = 1e-9;
	private int lastError;
	
	public Polynom(double a, int deg) {
		//for (int i = 0; i < deg ; i++) {
			coefficients = new double[deg];
			coefficients[deg] = a;
	     
		deg = degree();
	}
	
	public Polynom(Polynom a) {          // copy
		this(a.coefficients[a.deg], a.degree());
		for (int i = 0; i < a.degree(); i++) 
			this.coefficients[i] = a.coefficients[i];
		
		deg=a.deg;
	}
	
	protected void setUpdated () {
		updated = true; 
	}
	
	protected void unsetUpdated () {
		updated = false;					
	}									
	
	public int degree() {
		deg = 0;
		if (!updated) 
			return this.deg;
		for (int i = coefficients.length; i >= 0; --i) {
			if (Math.abs(coefficients[i]) > epsilon)
				deg = i;
		}
		this.unsetUpdated();
		return deg;
	}
	
	public Polynom summa(Polynom b) {
		Polynom a = this;
		Polynom rez = new Polynom (0, Math.max(a.degree(), b.degree()));
		for (int i=0; i < a.deg; i++) {
			rez.coefficients[i] += a.coefficients[i];
		}
		for (int i = 0; i < b.deg; i++) {
			rez.coefficients[i] += b.coefficients[i];
		}
		rez.setUpdated();
		return rez;
	}
	
	public Polynom subtract(Polynom b) {
		Polynom a = this;
		Polynom rez = new Polynom(0, Math.max(a.degree(), b.degree()));
		for (int i = 0; i < a.deg; i++) {
			rez.coefficients[i] += a.coefficients[i];
		}
		for (int i = 0; i < b.deg; i++) {
			rez.coefficients[i] -= b.coefficients[i];
		}
		rez.setUpdated();
		return rez;
	}
	
	public Polynom multiply(Polynom b) {
		Polynom a = this;
		Polynom rez = new Polynom(0, a.degree() + b.degree());
		for ( int i=0; i < a.degree(); i++) {
			for (int j = 0; j < b. degree(); j++) {
				rez.coefficients[i + j] += a.coefficients[i] * b.coefficients[j];
			}
		}
		//rez.deg=...
		rez.setUpdated();
		return rez;
	}
	
	public boolean isNull() {
		for (int i = 0; i < degree(); i++) {
			if (coefficients[i] != 0) 
				return false;
		}
		return true;
	}
	
	
	public Polynom divide(Polynom b) {
		Polynom a = new Polynom(this);

		int power = 0;
		if (a.degree() > b.degree())
			power = a.degree() - b.degree();
		Polynom rez = new Polynom (0, power);
		if (b.isNull()) {
			throw new ArithmeticException("division by zero");
			//return null;
		} 
		int i = a.degree();
		while (a.degree() > b.degree()) {
			while (a.coefficients[i] == 0) 
				i--;
			double dcoef = a.coefficients[i] / b.coefficients[b.degree()];
			int rezPolynomPower = i - b.degree();
			rez.coefficients[rezPolynomPower] = dcoef;
			Polynom sb;
			Polynom rt = new Polynom (dcoef, rezPolynomPower);
			Polynom mult;
			mult = b.multiply(rt);
			a = a.subtract(mult);
					    
		}
		return rez;
	}
	
	public getLastError (int numberOfErr) {
		System.out.println(numberOfErr);
	}
	
	public static void main(String[] args) {
		

	}

}

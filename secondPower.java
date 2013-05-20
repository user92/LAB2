public class secondPower extends Polynom {
	//public static secondPower rez;
	double x1, x2;


	public secondPower (int deg) {
		coeff = new double[deg];
		for (int i = 0; i < deg ; i++) 
			coeff[i]=0;
	}
	
	
	
	public secondPower () {
		n = 3;
		int i;
		coeff = new double[n];
		for (i = 0; i < n ; i++) 
			coeff[i]=1;
		}
	
	
	public secondPower multiply(secondPower b) {
		secondPower a = this;
		secondPower rez = new secondPower(a.coeff.length+b.coeff.length);
		for ( int i = 0; i < a.coeff.length; i++) {
			for (int j = 0; j < b.coeff.length; j++) {
				rez.coeff[i + j] += a.coeff[i] * b.coeff[j];
			}
		} 
		return rez;
	}
	
	
	/*public secondPower divide(secondPower b) throws Exception{
		int maxDegree = Math.max(this.degree(), b.degree());
		int minDegree = Math.min(this.degree(), b.degree());
		int rezDegree = maxDegree - minDegree;
		int j = minDegree;
		if (b.isNull()) {
			throw new Exception("division by zero");
			} 
		if (this.degree() < b.degree()) {
			return null; // нулевой полином
		}
		if (this.degree() > b.degree()) {
			for (int i = maxDegree; i > -1; i--) {
				for (int k = minDegree; k > -1; k--) {
					rez.coeff[k] = this.coeff[i]/b.coeff[j];
		*/			
					

	
    double GetRoot1 () throws Exception {
    	double a = coeff[2];
    	double b = coeff[1];
    	double c = coeff[0];
    	double D = Math.sqrt(b) - 4*a*c;
    	double discriminant = Math.sqrt(D);
    	if (D < 0) 
    		throw new Exception("nothing to calculate");
    	try {
    		x1 = (-b - discriminant)/(2*a);
    	} catch (Exception e) { getLastError(e); } 
  	 
    return x1;
}
    
    double GetRoot2 () {
    	double a = coeff[2];
    	double b = coeff[1];
    	double c = coeff[0];
    	double D = Math.sqrt(b) - 4*a*c;
    	double discriminant = Math.sqrt(D);
    	try {
    		x1 = (-b + discriminant)/(2*a);
    	} catch (Exception e) { getLastError(e); } 
  	 
    return x2;
}
    
	public void getPrint(){
	int i;
	for (i = 0; i < n ; i++) {
		System.out.println(coeff[i]);
		}
}
	
    public static void getLastError (Exception lastError) {
		System.out.println("last error is" + lastError.getMessage()); // return lastError; 
	}
	
	public static void main(String[] args) {
		secondPower test = new secondPower();
		secondPower test2 = new secondPower();
		test.summa(test2);	
	}

}

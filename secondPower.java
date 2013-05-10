import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;


public class secondPower extends Polynom   {
  double x1, x2;
  public secondPower (int index, String fileName) throws IOException {
	ByteBuffer buffer = ByteBuffer.allocate(4).order(ByteOrder.nativeOrder());
    File myFile = new File(fileName);
    if (!myFile) {  
      getLastError(1);
      }
    if (index > myFile.length()) 
      getLastError(2);
    try {
    	for (int i = 0; i < 3; ++i) {
    		FileReader fileReader = new FileReader(myFile.getAbsolutePath());
    		fileReader[i].read();
    		fileReader[i].close();
    	}    	
        } catch (Exception e) { }
        
        }
    	
    
      
  
    
    double GetRoot1 () {
    	double a = coefficients[2];
    	double b = coefficients[1];
    	double c = coefficients[0];
    	double D = Math.sqrt(b) - 4*a*c;
    	double discriminant = Math.sqrt(D);
    	if (D < 0) 
    		throw new MathException e;
    	try {
    		x1 = (-b - discriminant)/(2*a);
    	} catch (Exception e) { getLastError(9); } 
  	 
    return x1;
}
    
    double GetRoot2 () {
    	double a = coefficients[2];
    	double b = coefficients[1];
    	double c = coefficients[0];
    	double D = Math.sqrt(b) - 4*a*c;
    	double discriminant = Math.sqrt(D);
    	try {
    		x1 = (-b + discriminant)/(2*a);
    	} catch (Exception e) { getLastError(9); } 
  	 
    return x2;
}
    
	
	
	
	
	
	public static void main(String[] args) {
	

	}

}


import java.io.File;
import java.io.IOException;


public class SecondPower extends Polynom  {
  
	
	
	public SecondPower (int index, String fileName)  {
		File myFile = new File("myFile");
		if (!myFile) 
			throw new Exception; 
		if (index > file.length(fileName)) 
			throw new Exception;
		try {
			for (int i = index; i < 3; ++i) {
    		        FileReader fileReader[i] = new FileReader(myFile.getAbsolutePath());
    		        fileReader[i].read();
        	        fileReader[i].close();
			}
		catch Exception { 
		}
		}	
		
	double GetRoot1 () {
    	double a = coefficients[2];
    	double b = coefficients[1];
    	double c = coefficients[0];
    	double D = Math.sqrt(b) - 4*a*c;
    	double discriminant = Math.sqrt(D);
    	if (D < 0) 
    		throw new Exception e;
    	try {
    		x1 = (-b - discriminant)/(2*a);
    	} catch (Exception e) { getLastError(9); } 
  	 
    return x1;
}
		
	}
	
	
	

import java.io.BufferedReader;
import java.io.FileReader;


public class SumNumbers {

	public static void main(String[] args) {
		int Sum = 0;
		try{

		    BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		    String strLine;

		    while ((strLine = br.readLine()) != null)   {
		      Sum = Sum + Integer.parseInt(strLine); 
		    }

		    br.close();
		    }catch (Exception e){
		      System.err.println("Error: " + e.getMessage());
		    }
			System.out.println(Sum);
	}

}

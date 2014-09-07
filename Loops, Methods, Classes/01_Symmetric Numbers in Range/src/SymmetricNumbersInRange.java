import java.util.Scanner;

public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		int x =  Integer.parseInt(numbers[0]);
		int y = Integer.parseInt(numbers[1]) ;
		
		for (int i=x; i <= y; i++)
		{
		if(i <=9)
		{			
				System.out.println(i);
		}
		if (i >=10 && i <=99)
		{			
				if(i%10 == i/10)
				{
				System.out.println(i);
				}			
		}
		if (i >=100 && i <=999)
		{
				if(i%10 == i/100)
				{
				System.out.println(i);
				}
		}
		}
		scanner.close();
	}

}

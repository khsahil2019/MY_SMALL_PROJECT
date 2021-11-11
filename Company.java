import java.io.*;
class Company
{
	public static void main(String[] args) throws IOException {

		DataInputStream obj = new DataInputStream(System.in);

		System.out.println("ENTER THE SALARY : - ");
         int sal = Integer.parseInt(obj.readLine());
		System.out.println("ENTER SERVICE TIME :- ");
		
		System.out.println("ENTER YEAR :- ");
		int y = Integer.parseInt(obj.readLine());
		
		System.out.println("ENTER MONTHS :- ");
		
		int m = Integer.parseInt(obj.readLine());
        System.out.println("ENTER DAYS :- ");
		int d = Integer.parseInt(obj.readLine());
		 
		int year = d +   (m*30) +  (y*12*30); 
		
		if (year>1800) 
		{
			sal = sal + (sal *5)/100;
			System.out.println("YOUR SALARY IS :-" + sal);
		}
		else
		{
			System.out.println("YOUR SALARY IS :-" + sal);
		}		
	}
}
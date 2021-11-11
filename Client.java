import java.io.*;
class Client
{
	public static void main(String[] args) throws IOException {
	 Test obj = new Test();
	 obj.set_info();
	 obj.display(); 
		
	}
}

class Test 
{
	int reg;
	int fees;
	String name,email,city;


 void set_info() throws IOException
 {
 	DataInputStream obj = new DataInputStream(System.in);
    System.out.println("REGISTRATION NO");
    reg = Integer.parseInt(obj.readLine());
    System.out.println("FEES");
    fees = Integer.parseInt(obj.readLine());
    System.out.println("NAME");
    name = obj.readLine();
    	System.out.println("E-MAIL");
    	email = obj.readLine();
      System.out.println("CITY");
      city = obj.readLine();
 }


 void display()
 {
 	System.out.println("REGISTRATION NUMBER =  " + reg);
 	System.out.println("FEES =" + fees);
 	System.out.println("NAME = " + name);
 	System.out.println("E-MAIL = " + email);
 	System.out.println("CITY = " + city);
 }

}
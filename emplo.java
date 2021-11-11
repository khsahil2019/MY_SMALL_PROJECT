import java.io.*;
class emplo
{
	public static void main(String[] args) throws IOException {
    test k[] = new test[5];
    for (int x=0;x<5;x++)
     {
    k[x] = new test();
    k[x].setdata(); 	
     } 
 for (int x=0;x<5;x++)
  {
 k[x].display();	
 }

	}
}

class test
{
	int id,sal;
	String name;

	void setdata() throws IOException
	{
      DataInputStream obj = new DataInputStream(System.in);
    System.out.println("EMPLOYEE ID");
    id = Integer.parseInt(obj.readLine());
    System.out.println("SALARY");
    sal = Integer.parseInt(obj.readLine());
    System.out.println("EMPLOYEE NAME");
    name = obj.readLine();
    	
	}


	void display()
	{
		System.out.println("EMPLOYEE ID =" + id);
		System.out.println(" EMPLOYEE NAME = " + name);
		System.out.println("SALARY = " + sal);
	}
}


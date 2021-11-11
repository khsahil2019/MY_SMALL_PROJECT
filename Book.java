import java.io.*;
class Book
{
	public static void main(String[] args) throws IOException {

		Test k = new Test();
		k.setdetail();
		k.display();      
		
	}
}


class Test
{
	int bookid;
	int bookmrp;
	String bookname;

	void setdetail() throws IOException
	{

		DataInputStream obj =  new DataInputStream(System.in);
		System.out.println("BOOK ID ");
		bookid =Integer.parseInt(obj.readLine());
		System.out.println("BOOK NAME");
		bookname = obj.readLine();
		System.out.println("BOOK MRP");
		bookmrp =Integer.parseInt(obj.readLine());
		
	}

	void display()
	{
		System.out.println("BOOK ID =" + bookid);
		System.out.println("BOOK NAME = " + bookname);
		System.out.println("BOOK MRP = " + bookmrp);
	}
}
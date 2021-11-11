import java.io.*;
class Exam {
  public static void main(String[] args) throws IOException {

  	DataInputStream obj = new DataInputStream(System.in);

  	System.out.println("ENTER NUMBER OF CLASSES HELD :-");
  	int held = Integer.parseInt(obj.readLine());
  	System.out.println("ENTER THE NUMBER OF CLASSES ATTEND :-");
  	int attend = Integer.parseInt(obj.readLine());
  	double per = attend/held*100;
  	System.out.println("ATTENDENCE PERCENTAGE :-" + per);
  	if(per>75)
  	{
  		System.out.println("ALLOWED TO SIT IN EXAM");
  	}
  	else
  	{
  		System.out.println("NOT ALLOWED TO SIT IN EXAM");
  	}
  }
}
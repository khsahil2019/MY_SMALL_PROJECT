
import java.io.DataInputStream;
import java.io.IOException;

public class pass {
    public static void main(String[] args) throws IOException {
         






    }
}
  class passport
  {
      int pass_no;
      String name,pass_sta;

      void set_passport() throws IOException
      {
          DataInputStream obj = new DataInputStream(System.in);
          System.out.println("ENTER PASSPORT NUMBER");
          pass_no = Integer.parseInt(obj.readLine());
          System.out.println("ENTER THE NAME");
          name = obj.readLine();
          System.out.println("PASSPORT STATUS");
          pass_sta = obj.readLine();
      }

      void disp_pass()
      {
          System.out.println("PASSPORT NUMBER " + pass_no);
          System.out.println("NAME " + name);
          System.out.println("PASSPORT STATUS " + pass_sta);
      }

  }






  class  visa  extends passport
  {
      String country,day,status;
      int fees;

      void set_visa() throws IOException
      {

          DataInputStream obj1 = new DataInputStream(System.in);
          System.out.println("ENTER COUNTRY NAME");
          country = obj1.readLine();
          System.out.println("ENTER THE DAY");
          day = obj1.readLine();
          System.out.println(" ENTER THE FEES");
          fees = Integer.parseInt(obj1.readLine());
          System.out.println("ENTER THE STATUS YES OR NO");
          status = obj1.readLine();
      }
      void disp_visa()
      {
          System.out.println("COUNTRY " + country);
          System.out.println("DAY "+ day);
          System.out.println("FEES "+ fees);
          System.out.println("STATUS " + status);
      }
  }



  class ticket extends visa
  {
      int ticket_no,charges;
      String for_country;

      void purchase_ticket() throws IOException
      {
        DataInputStream obj2 = new DataInputStream(System.in);
          System.out.println("ENTER THE TICKET NUMBER");
          System.out.println("ENTER THE CHARGES");
          System.out.println("ENTER DESTINATION COUNTRY");
      }

      void disp_tic()
      {
          System.out.println("TICKET NUMBER " + ticket_no );
          System.out.println("CHARGES FOR TICKET + " + charges);
          System.out.println("DESTINATION COUNTRY " + for_country);
      }
  }



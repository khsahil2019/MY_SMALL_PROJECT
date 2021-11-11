 import java.io.*;
class bank
{
	public static void main(String[] args) throws IOException  {
test k[]= new test [5];
int flag=0,ch=0;
int  d=0, a=0,b=0;
int index = 0; 


 do
 {
     System.out.println();
     System.out.println();
 	System.out.println("************* BANKING SECTOR **************");
 	System.out.println();
 	System.out.println("##########   MENU   ############");

 	System.out.println();
 	
 
 	System.out.println("1. OPEN NEW ACCOUNT");
 	System.out.println("2. DEPOSIT");
 	System.out.println("3. WITHDRAW");
 	System.out.println("4. SEARCH RECORD");
 	System.out.println("5. CHECK BALANCE");
 	System.out.println("6. DISPLAY ALL");
 	System.out.println("7. STATEMENT ABOVE 5000");
 	System.out.println("8. STATEMENT BELOW 5000");
 	System.out.println("9. STATEMENT BETWEEN 5000 - 12000");
 	System.out.println("10. UPDATE NAME");
 	System.out.println("11. EXIT"); 
 	
 	System.out.println();
 	
 	System.out.println("ENTER YOUR CHOICE :");
 	

 	DataInputStream obj = new DataInputStream(System.in);
 	ch = Integer.parseInt(obj.readLine());

 	switch(ch)
 	{
 		case 1: 
 		k[index] = new test();
        //k[index].test();
 		System.out.println("RECORD SAVED!");            /*OPEN NEW ACCOUNT*/
        index++;
        break;

        case 2:
        flag =0;
        //int a=0,b=0;
        DataInputStream obj1 =new DataInputStream(System.in);
        System.out.println("ENTER ACCOUNT NUMBER");
        a = Integer.parseInt(obj1.readLine());                          /* DEPOSIT */
        for (int x=0;x<index;x++)
         {
        if(k[x].acc_no==a)
        {
        	flag = 1;
        	System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
        	b=Integer.parseInt(obj1.readLine());
        	k[x].bal=k[x].bal + b;
        }	
        }
        if(flag==0)
        
        	System.out.println("SORRY ENTER ACCOUNT NOT FOUND WITHIN DATABASE");
        	break;
        

       case 3: 
       flag =0;
        //int a=0,b=0;
        DataInputStream obj2 =new DataInputStream(System.in);
        System.out.println("ENTER ACCOUNT NUMBER");
        a = Integer.parseInt(obj2.readLine());
        for (int x=0;x<index;x++)
         {
        if(k[x].acc_no==a)
        {                                                                          /* WITHDRAW */
        	flag = 1;
        	System.out.println("ENTER THE AMOUNT TO BE WITHDRAW");
        	b=Integer.parseInt(obj2.readLine());
        	if(k[x].bal-b>=1000)
	     {
	          k[x].bal=k[x].bal-b;
	        System.out.println();
	        //obj2[x].display();
	     }
	        else
	      System.out.println("YOU HAVE LOW LIMIT OF MONEY $1000");
         	break;
	     }
	     }
	     if(flag==0)
	    {
	    System.out.println("SORRY ENTER ACCOUNT NOT FOUND WITHIN DATABASE");
	    }
	   break;

       case 4 :
       flag =0;
        //int a=0;
        DataInputStream obj3 =new DataInputStream(System.in);
        System.out.println("ENTER ACCOUNT NUMBER");
        a = Integer.parseInt(obj3.readLine());
        for (int x=0;x<index;x++)
         {
        if(k[x].acc_no==a)                                           /* SERACH ACCOUNT */
        {
        	flag = 1;
        	k[x].display();
        }	
        }
        if(flag==0)
           System.out.println("SORRY ENTER ACCOUNT NOT FOUND WITHIN DATABASE");
        	break;
        
       case 5:
       flag=0;
                DataInputStream obj4 = new DataInputStream(System.in);
                System.out.println("ENTER ACCOUNT NUMBER");
                a=Integer.parseInt(obj4.readLine());
                for (int y=0;y<index;y++)
                 {
                if (k[y].acc_no==a)
                 {
                flag=1;
                k[y].disp();		                        /* CHECK BALANCE */
                	}	
                }
                if(flag==0)
                
                	System.out.println("SORRY ENTER ACCOUNT NOT FOUND WITHIN DATABASE");
                	break;
                
       case 6 :
       for (int y=0;y<index;y++)
        {
       System.out.println();
       k[y].display();                                               /* DISPLAY ALL */
       System.out.println();	
       }
        break;
   
     case 7:
     for (int x=0;x<index;x++)
     {
     if(k[x].bal>5000)
     {                               /*STATEMENT ABOVE*/
     	k[x].disp();                       
     }	
     }
     break;

     case 8:
     for (int x=0;x<index;x++)
      {
     	 if(k[x].bal<5000)                         /*STATEMENT BELOW*/
     {
     	k[x].disp();
     }	
     }
     break;
      
      case 9:
       for (int x=0;x<index;x++)
       {
      	if(k[x].bal<=12000 && k[x].bal>=5000)         /* STATEMENT RANGE BETWEEN 5000 AND 12000*/
      	{
      		k[x].disp();
      	}
      }
         break;

     case 10 :
     flag=0;
     DataInputStream obj5 = new DataInputStream(System.in);
     System.out.println("ENTER THE ACCOUNT NUMBER :-");
     a= Integer.parseInt(obj5.readLine());
     for (int x=0;x<index ;x++ )
      {
     if (k[x].acc_no==a) 
     {
     flag=1;
     
     System.out.println("ENTER THE NAME TO BE UPDATE");
     k[x].name=obj5.readLine();                                 /* UPDATE NAME */
     System.out.println("ACCOUNT HOLDER NAME UPDATED !");
     System.out.println();
     k[x].display();
     }    
     }
     if(flag==0)
     
        System.out.println("SORRY ENTER ACCOUNT NOT FOUND WITHIN DATABASE");
     break;
     
     

        case 11 :
        System.exit(0);                                             /* EXIT */
    }

    System.out.println();
    System.out.println("IF YOU WANNA TO GO TO BACK MENU PRESS 1");
    d=Integer.parseInt(obj.readLine());
}while(d==1);
    		
	}
}


class test
{
int acc_no,bal;
String name;

 test() throws IOException
 {
 DataInputStream obj = new DataInputStream(System.in);

 System.out.println("ENTER ACCOUNT NUMBER :- ");
 acc_no = Integer.parseInt(obj.readLine());
 System.out.println("ENTER ACCOUNT HOLDER NAME :- ");
 name = obj.readLine();
 System.out.println("ENTER ACCOUNT BALANCE :- ");
 bal = Integer.parseInt(obj.readLine());
}

void display()
{
	System.out.println("ACCOUNT NUMBER : " + acc_no);
	System.out.println("ACCOUNT HOLDER NAME : " + name);
	System.out.println("ACCOUNT BALANCE : " + bal);

}
void disp()
	{
		System.out.println(name +" YOUR ACCOUNT BALANCE IS :  " + bal);
	}




}

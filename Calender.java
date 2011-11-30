import java.io.*;
class Calender 
{
    void disp()throws IOException
    {
        System.out.println("Welcome: This application shows the calender of: ");
        System.out.println("Entered Month of a entered year");
        System.out.println();
        
        InputStreamReader key=new InputStreamReader(System.in);
        BufferedReader b=new  BufferedReader(key);
        
        int date[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June",
                        "July","August","September","October","November","December"};
        
        System.out.print("Please enter the month: ");
        String read=b.readLine();
        read=read.trim();
        
        boolean check=month(read);
        while(check)
        {
            System.out.print("Please enter correct month: ");
            read=b.readLine();
            read=read.trim();
            check=month(read);
        }
        
        //To Check wheter the given month is a valid one
    
        int month=Integer.parseInt(read);
        
             
            System.out.print("Please enter the year: ");
            read=b.readLine();
            read=read.trim();
        
            check=year(read);
        while(check)
        {
            System.out.print("Please enter correct year: ");
            read=b.readLine();
            read=read.trim();
            check=year(read);
       }
       
    //To Check wheter the given year is a valid one
    
    int year=Integer.parseInt(read);
        
        int odd=2;
        for(int i=1;i<=year-1;i++)
        {
           
            if((i%4==0&&i%100!=0)||(i%400==0))
            odd=odd+2;
            else
            odd++;
            if(odd>7)
            odd=odd%7;
           
        }
        
        //To count the number of odd days from 0 A.D. to the year preceding the given year
        
       for(int i=1;i<=month-1;i++)
        {
           
            if(((year%4==0&&year%100!=0)||(year%400==0))&&i==2)
            odd=29%7+odd;
            else
            odd=date[i-1]%7+odd;
            if(odd>7)
            odd=odd%7;
            
                   
        }
        
        //To count the number of odd days from the starting of the given year to the month preceding the given month
        
            System.out.println('\u000c'+"Calender of ");
            System.out.println("Month: "+months[month-1]);
            System.out.println("Year: "+year);
            System.out.println();
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for(int i=1;i<=odd-1;i++)
            {
                System.out.print("    ");
            }
            for(int i=1;i<=date[month-1];i++)
            {
                if(i<=9)
                System.out.print(" "+i+"  ");
                else
                System.out.print(" "+i+" ");
                if((i+odd-1)%7==0)
                System.out.println();
            }
            
            //To print the calender
            
            if(((year%4==0&&year%100!=0)||(year%400==0))&&month==2)
            {
                System.out.print(" "+"29"+" ");
            }
                System.out.println();
            
            System.out.print("Do you want the calender of another month?");
            System.out.println("Press any key to continue.\" n \" to quit)");
            read=b.readLine();
            
            //Statement to ask the user if he wants the calender of another month
                
            if(read.trim().equalsIgnoreCase("n"))
            System.out.println('\u000c'+"Thank you");
            else
            {
                System.out.println('\u000c');
                disp();
            }
    }
    boolean year(String g)
    {
        if(g.equals(""))
        return true;
        //To check if the input is a blank String
        for(int i=0;i<=g.length()-1;i++)
        {
            char m=g.charAt(i);
            if(!(m>='0'&&m<='9'))
            return true;
        }
        //to check if the input is not a numerical
            if(Integer.parseInt(g)==0)
            {
                return true;
            }
        //to check if the input is a zero
        return false;
    }
     boolean month(String g)
     {
         if(g.equals(""))
         return true;
         //To check if the input is a blank String
        for(int i=0;i<=g.length()-1;i++)
        {
            char m=g.charAt(i);
            if(!(m>='0'&&m<='9'))
            return true;
        }
        //to check if the input is not a numerical
            if(Integer.parseInt(g)>12 || Integer.parseInt(g)<=0)
            {
                return true;
            }
            //to check if the input is not a valid month
        return false;
    }
}
        
                
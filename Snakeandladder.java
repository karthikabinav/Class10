import java.io.*;
class Snakeandladder
{
   void inp()throws IOException
   {
      InputStreamReader a=new InputStreamReader(System.in);
      BufferedReader b=new BufferedReader(a);
      System.out.println("Welcome");
      System.out.print("Please enter the number of player(maximum of 6 players) : ");
      String read =b.readLine();
      for(int i=0;i<=read.length()-1;i++)
      {
          char m=read.charAt(i);
          if(!(m>='2'&&m<='6'))
          {
              System.out.print("Please enter correct number : ");
              read=b.readLine();
              i=-1;
            }
        }
        while(read.equals(""))
        {
            System.out.print("Please Enter Correct Input : ");
            read=b.readLine();
        }
        int h=Integer.parseInt(read);
        String name[]=new String[h];
        for(int i=0;i<=h-1;i++)
        {
           System.out.print(" Please enter the name of player " + (i+1) +" : ");
           read=b.readLine();
           name[i]=read;
        }
           
        int place[]=new int[h];
        boolean x=true;
      while(x)
      {
        for(int i=0;i<=h-1;i++)
        {
            
            System.out.print(name[i]+"("+place[i]+") :- please press any key to throw the dice :");
            read=b.readLine();
            System.out.print('\u000c');
            int dice =(int)(Math.random()*10);
            if(dice>6)
            {
                dice=dice-6;
            }
            else if(dice==0)
            {
                dice=1;
            }
            System.out.println("The number on the dice = "+dice);
            place[i]=place[i]+dice;
            if(place[i]==3 || place[i]==21 || place[i]==33||place[i]==50||place[i]==67||place[i]==78||place[i]==82||place[i]==89)
            {
                System.out.println(" you found a ladder ");
                place[i]=place[i]+10;
            }
            if(place[i]==11||place[i]==25||place[i]==36||place[i]==49||place[i]==68||place[i]==98)
            {
                System.out.println(" You found a snake ");
                place[i]=place[i]-10;
            }
            System.out.println(name[i] +" is at position "+place[i]);
            if(place[i]>=100)
            {   System.out.print('\u000c');
                System.out.println(name[i]+" is the winner ");
                System.out.print(" Congragulations ");
                x=false;
                break;
            }
          
                
        }
        
    }
    System.out.print("Do you want to play again?(Y/N)");
    read=b.readLine();x=true;
    while(x)
    {
       if(read.equals("y")||read.equals("Y"))
      {
          System.out.print('\u000c');
         inp();x=false;
      }
      else if(read.equals("n")||read.equals("N"))
      {
          System.out.print('\u000c');
         System.out.println("Thank You for playing");x=false;
      }
      else
      {
          System.out.print('\u000c');
        System.out.print("please enter correct input (y\n)");
        read=b.readLine();
    }
}
}
}
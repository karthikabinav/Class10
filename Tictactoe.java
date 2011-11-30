import java.io.*;
public class Tictactoe
{
   int set,ply,start;
   boolean check=true,tour=true,tie =false;
   int cpoints=0,upoints=0,uwinno=0,cwinno=0;

 private Tictactoe()
     {
         set=0;
      
        
        
     }
   public static void main(String s[])throws IOException,InterruptedException  
   {
        InputStreamReader a= new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(a);
         
        boolean menu=true;
        
            do
            {            clearscreen();
                     System.out.println("=============================================================================================== \n \n \n \n \n");
                                      
                        System.out.println("XX                   XX                                                           OOOO                ");
                        System.out.println("   XX             XX                                                            OO    OO              ");
                        System.out.println("      XX       XX                   AAAA                                       OO      OO             ");
                        System.out.println("         XX XX                     AA   AA    NNN     N  DDD                  OO        OO            ");
                        System.out.println("         XX XX                    AA AAA AA   NN  NN  N  D  D                 OO        OO            ");
                        System.out.println("      XX       XX                AA       AA  NN    NNN  DDDD                 OO        OO            ");
                        System.out.println("   XX             XX                                                           OO      OO             ");
                        System.out.println("XX                   XX                                                          OO  OO               ");
                        
                        
                     System.out.println("\n \n \n \n =============================================================================================== \n \n \n ");
                                      
                        
                    
                        String read;int choice=0;
                        Tictactoe t=new Tictactoe();
                      
                        System.out.println("\t 1: Two player game\n \n \n");
                  
                        System.out.println("\t 2: Computer v/s user\n \n \n");
                     
                        System.out.println("\t 3: Rules of the game \n \n \n");
                       
                        System.out.println("\t X: Exit from the game \n \n \n");
                    
                        System.out.print(" \t Press the number corresponding to the game mode you want to play  : - ");
                      
                        read=b.readLine();
                        if(read.trim().equalsIgnoreCase("x"))
                        {
                            t.thankYou(1);
                            menu=false;
                    
                        }
                        while(!(read.trim().equals("1") || read.trim().equals("2") || read.trim().equals("3")||read.trim().equalsIgnoreCase("x")))
                        {
                            System.out.println("     \t Wromg choice\n \n \n");
                            System.out.print("\t Please enter correct choice :- ");
                            read=b.readLine();
                            if(read.trim().equalsIgnoreCase("x"))
                            {
                                t.thankYou(1);
                                menu=false;
                    
                            }
                        }
                        if(!(read.trim().equalsIgnoreCase("x")))
                        choice=Integer.parseInt(read);
                        switch(choice)
                        {
                            case 1:t.set=-1;t.tournmentMode();break;
                            case 2:t.set=-2;t.tournmentMode();break;
                            case 3:t.rules();break;
                        }
             }
             while(menu);
     }
        
     private void tournmentMode()throws IOException,InterruptedException 
     {
          InputStreamReader a= new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(a);
        
        clearscreen();
        System.out.print("Please enter the number of games you want to play in the tournment : ");
        
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
        String read=b.readLine();
         read=read.trim();
         if(quitGame(read))
          check=false;
                    
         while(validation1(read))
         {
             System.out.print(" \t \n \n \n Please enter number: ");
             read=b.readLine();
             read=read.trim();
             if(quitGame(read))
             check=false;
          }
                 
          int notime=Integer.parseInt(read);
         
         
         
       if(set==-1)
       {
       for(int i=1;i<=notime&&check;i++)
       {
            
           
                clearscreen();
                if(i!=1)
               { System.out.println(" \n \n \n  \n \t \t \t GET READY FOR GAME "+i);
                       
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");}
                Thread.sleep(1000);
                twoPlayer();
           
            
            if(start==0)
            ply=0;
            else
            ply=1;
           
           
           
           
        }  
        
        clearscreen();
        System.out.println("\n \n \n \n \t \t FINAL SCORE ");
        System.out.println("Player 1 : "+upoints);
        System.out.println("Player 2 : "+cpoints);
         
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
        Thread.sleep(3*1000);
        
        if(upoints>cpoints)
        {thankYou(2);Thread.sleep(3*1000);}
         
         else if(cpoints>upoints)
         { thankYou(3);
           Thread.sleep(3*1000);}
           
          else if((upoints==cpoints)    )
          {  
              clearscreen();
              System.out.println("\n \n \n \n \n \n \t \t Tie breaker match ");
                
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
              Thread.sleep(1000);
              twoPlayer();
              
              if(tie)
              {
                   clearscreen();
                   thankYou(6);
                   Thread.sleep(3*1000);
                }
              
            }  
        }
         
       else  if(set==-2)
       {    
           
           
       for(int i=1;i<=notime&&check;i++)
       {
            
           
                clearscreen();
                if(i!=1)
                System.out.println(" \n \n \n  \n \t \t \t GET READY FOR GAME "+i);
                   
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
                Thread.sleep(1000);
                onePlayer();
           
            
            if(start==0)
            start=1;
            else
            start=0;
           
           
           
           
        } 
        clearscreen();
        System.out.println("\n \n \n \n \t \t FINAL SCORE ");
        System.out.println("User     : "+upoints);
        System.out.println("Computer : "+cpoints);
          
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
        Thread.sleep(3*1000);
        
        
        if(upoints>cpoints)
        { thankYou(4);Thread.sleep(3*1000);}
         
         else if(cpoints>upoints)
         { thankYou(5);
           Thread.sleep(3*1000);}
           
          else if((upoints==cpoints)    )
          {  
              clearscreen();
              System.out.println("\n \n \n \n \n \n \t \t Tie breaker match ");
                
          System.out.println("\n \n \n \n\n\n\n\n Input area : ");
              Thread.sleep(1000);
              tour=true;
              onePlayer();
              if(tie)
              {
                   clearscreen();
                   thankYou(6);
                   Thread.sleep(3*1000);
                }
              
            }  
           
    }
}   
     
     
    
  private void twoPlayer()throws IOException,InterruptedException 
   {
          if(start==0)
          start=1;
          else
          start=0;
        InputStreamReader a= new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(a);
        
              
        System.out.println();
     
      
   Tictactoe.clearscreen(); 
        System.out.println("player 1 will be referred to as \"X\" and Player 2 will be referred to as \"O\"\n \n \n");
      
        System.out.println("You can abandon the game by pressing \" x \" at any point of the game to end the game .\n \n \n");
    
        
        String read; 
        String box[][]={{"___ ","___ ","___ "},{"___ ","___ ","___ "},{"___ ","___ ","___ "}};
        System.out.print("\t");
        for(int i=1;i<=3;i++)
        {
            
              System.out.print("   "+i);
        }
               System.out.println();
            
      for(int j=0;j<=2;j++)
      {
         System.out.print("\t"+(j+1)+" ");
          for(int i=0;i<=2;i++)
          {
                System.out.print(box[j][i]);
          }
                System.out.println();
        
      }
        
          byte end=0;
          System.out.print("\n \t Please read the instructions carefully.Press any key to continue to the game :-"); 
          read=b.readLine();
          if(quitGame(read))
          check=false;
          
         clearscreen();
          if(check)
          printStatus(box);
          
           
 main:while(end!=9&& check)
{                      
                   clearscreen();    
                  System.out.println("\t \t Current status of points \n");
                  System.out.println("\t Player 1 : "+cpoints);
                  System.out.println("\t Player 2 : "+upoints+"\n \n");
                  
                   
                     printStatus(box);
   
                        System.out.print("\r \n \n \n \t Player "+(ply+1)+" Please enter row number you want to place your mark: ");
                              System.out.println("\n \n \n Input area : ");
                        read=b.readLine();
                        read=read.trim();
                        if(quitGame(read))
                        break main;
                    
                        while(validation(read))
                        {
                           System.out.print(" \t \n \n \n Please enter correct row number: ");
                           read=b.readLine();
                           read=read.trim();
                           if(quitGame(read))
                           break main;
                        }
                 
                        int row=Integer.parseInt(read);
                    
                        System.out.print("  \t \n \n \n Player "+(ply+1)+" Please enter column number you want to place your mark: ");
                           System.out.println("\n \n \n Input area : ");
                        read=b.readLine();
                        read=read.trim();
                        if(quitGame(read))
                           break main;
                        
                        while(validation(read))
                        {
                           System.out.print(" \t \n \n \n Please enter correct column number: ");
                           read=b.readLine();
                           read=read.trim();
                           if(quitGame(read))
                           break main;
                        }
                 
                        int column=Integer.parseInt(read);
                   
                      
                
                    if(!box[row-1][column-1].equals("___ "))
                    {
                       System.out.println(" \t\n \n \n The box has aldready been filled.Press any key to give a new position :-");
                       read= b.readLine();
                        if(quitGame(read))
                           break main;
                       clearscreen();
                        printStatus(box);
                        continue main;
                    }
                    
                  System.out.print("\t \n \n \nAre you sure you want to place the mark in row :- "+row+" column :- "+column+" (press \" n \"  if you are wrong.Press any other key to continue)");  
                    System.out.println("\n \n \n Input area : ");
                  read=b.readLine();
                    if(read.trim().equalsIgnoreCase("n"))
                    {
                        clearscreen();
                        continue main;
                    }
                    
                    if(quitGame(read))
                      break main;
                     
                      clearscreen();
                    System.out.println(" \t Current status of the game is:\n \n \n");
                      System.out.println("\n \n \n Input area : ");
                          if(ply==0)
                         {
                             ply=1;
                             box[row-1][column-1]=" X  ";
                             
                         }
                                    
                          else
                          {
                              ply=0;
                              box[row-1][column-1]=" O  ";                      
                              
                          }
                                
                           printStatus(box);
                           
                          if((box[0][0].equals(box[0][1])&&box[0][1].equals(box[0][2])&&box[0][2].equals(" X  "))||(box[1][0].equals(box[1][1]) && box[1][1].equals(box[1][2])&&box[1][2].equals(" X  "))||(box[2][0].equals(box[2][1]) && box[2][1].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][0].equals(box[1][0])&&box[1][0].equals(box[2][0])&&box[2][0].equals(" X  "))||(box[0][1].equals(box[1][1])&&box[1][1].equals(box[2][1])&&box[2][1].equals(" X  "))||(box[0][2].equals(box[1][2])&&box[1][2].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][0].equals(box[1][1])&&box[1][1].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][2].equals(box[1][1])&&box[1][1].equals(box[2][0])&&box[2][0].equals(" X  ")))
                          {
                               Thread.sleep(1000);
                              uwinno++;
                              clearscreen();
                              System.out.println("Player 1 gains "+uwinno+" points and Player 2 loses 2 points ");
                            System.out.println("\n \n \n\n\n\n\n\n Input area : ");
                              Thread.sleep(2*1000);
                              upoints=upoints+uwinno;
                              cpoints=cpoints-2;
                              Thread.sleep(1000);
                              
                              break main;
                            }
                            if((box[0][0].equals(box[0][1])&&box[0][1].equals(box[0][2])&&box[0][2].equals(" O  "))||(box[1][0].equals(box[1][1]) && box[1][1].equals(box[1][2])&&box[1][2].equals(" O  "))||(box[2][0].equals(box[2][1]) && box[2][1].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][0].equals(box[1][0])&&box[1][0].equals(box[2][0])&&box[2][0].equals(" O  "))||(box[0][1].equals(box[1][1])&&box[1][1].equals(box[2][1])&&box[2][1].equals(" O  "))||(box[0][2].equals(box[1][2])&&box[1][2].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][0].equals(box[1][1])&&box[1][1].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][2].equals(box[1][1])&&box[1][1].equals(box[2][0])&&box[2][0].equals(" O  ")))
                            {
                                 Thread.sleep(1000);
                                cwinno++;
                                clearscreen();
                              System.out.println("Player 2 gains "+cwinno+" points and Player 1 loses 2 points ");
                           System.out.println("\n \n \n\n\n\n\n\n Input area : ");
                              Thread.sleep(2*1000);
                                cpoints=cpoints+cwinno;
                                upoints=upoints-2;
                                
                                Thread.sleep(1000);
                                
                                break main;
                            }
                                    end++;
                                    
                
                  
                    
}
                
                
                if(end>=9)
                {
                    tie=true;
                    clearscreen();
                     System.out.println("Player 1 gains 2 points and Player 2 gains 2 points ");
                     Thread.sleep(2*1000);
                    cpoints=cpoints+2;
                    upoints=upoints+2;
                    Thread.sleep(1000);
                    
                }
                               
                                   
 }
    
    
          
           
                
                
            
              private   void onePlayer()throws IOException,InterruptedException 
                 {
                     InputStreamReader a= new InputStreamReader(System.in);
                     BufferedReader b=new BufferedReader(a);
                      boolean attck=false;byte end=0;boolean check=true;int row=-1;int column=-1;boolean comp=true;
                      
                      clearscreen();
                         String read; 
                        String box[][]={{"___ ","___ ","___ "},{"___ ","___ ","___ "},{"___ ","___ ","___ "}};
                        
                      
                        
                        
                         if(check&&tour)
                         
                         { 
                             
                             
                             
                        System.out.println("user will be referred to as \"X\" and computer will be referred to as \"O\"\n \n \n");
                       
                        System.out.println("You can abandon the game by pressing \" x \" at any point of the game to end the game \n \n \n");
                       
                              
                        
                        System.out.print("\t");
                        for(int i=1;i<=3;i++)
                        {
            
                            System.out.print("   "+i);
                        }
                            System.out.println();
            
                            for(int j=0;j<=2;j++)
                            {
                                System.out.print("\t"+(j+1)+" ");
                                for(int i=0;i<=2;i++)
                                {
                                    System.out.print(box[j][i]);
                                }
                                    System.out.println();
        
                            }
                            
              
                        System.out.println();
                        
                     
                         
          System.out.print("\n \t Please read the instructions carefully.Press any key to continue to the game :-"); 
          read=b.readLine();
          if(quitGame(read))
          check=false;
          
          clearscreen();
          int turn;
        
             if(check)
             {
          System.out.println("This is a toss to decide who makes the first move.\n \n \n");
          System.out.println("The computer will think of a number among 1,2.\n \n \n");
          System.out.println("If the user guesses the correct number user wins the toss else computer wins\n \n \n");
          System.out.println("Please wait while computer thinks of a number........\n \n \n");
          Thread.sleep(2*1000);
          int toss=(int)(Math.random()*1000000)%2+1;
          System.out.print("\n \n Please enter the number for toss: ");
          read=b.readLine();
          read=read.trim();
          while(validation(read)||Integer.parseInt(read)==3)
          {
             System.out.print(" \t \n \n \nPlease enter number: ");
             read=b.readLine();
             read=read.trim();
             if(quitGame(read))
             check=false;
          }
          if(check)
          {
          int ustoss=Integer.parseInt(read);
          if(ustoss==toss)
          {System.out.println("\n \n \nuser wins the toss\n \n \n");ply=0;start=0;}
          else
          {ply=1;System.out.println("\n \n \ncomputer wins the toss\n \n \n");start=1;}
          Thread.sleep(2*1000);
         clearscreen();
          
        } } }
 main:while(end!=9&& check)
{                 System.out.println("\t \t Current status of points \n");
                  System.out.println("\t Computer : "+cpoints);
                  System.out.println("\t User     : "+upoints+"\n \n");

                    printStatus(box);   
                     if(ply ==0)
                     {
                        System.out.print("\r\n \n \n \t Player "+(ply+1)+" Please enter row number you want to place your mark: ");
                         System.out.println("\n \n \n Input area : ");
                        read=b.readLine();
                        read=read.trim();
                        if(quitGame(read))
                        break main;
                    
                        while(validation(read))
                        {
                           System.out.print(" \n \n \n\t Please enter correct row number: ");
                           read=b.readLine();
                           read=read.trim();
                           if(quitGame(read))
                           break main;
                        }
                 
                        row=Integer.parseInt(read);
                    
                        System.out.print(" \n \n \n \t Player "+(ply+1)+" Please enter column number you want to place your mark: ");
                           System.out.println("\n \n \n Input area : "); 
                        read=b.readLine();
                        read=read.trim();
                        if(quitGame(read))
                           break main;
                        
                        while(validation(read))
                        {
                           System.out.print(" \n \n \n\t Please enter correct column number: ");
                           read=b.readLine();
                           read=read.trim();
                           if(quitGame(read))
                           break main;
                        }
                 
                        column=Integer.parseInt(read);
                   
                      
                
                    if(!box[row-1][column-1].equals("___ "))
                    {
                       System.out.println(" \n \n \n\t The box has aldready been filled.Press any key to give a new position :-");
                       read= b.readLine();
                        if(quitGame(read))
                           break main;
                       clearscreen();
                        continue main;
                    }
                    System.out.print("\n \n \n\t Are you sure you want to place the mark in row :- "+row+" column :- "+column+" (press \" n \"  if you are wrong.Press any other key to continue)");
                      System.out.println("\n \n \n Input area : ");
                    read=b.readLine();
                    if(read.trim().equalsIgnoreCase("n"))
                    {
                       clearscreen();
                        continue main;
                    }
                    
                    if(quitGame(read))
                      break main;
                    }
                    else
                    {
                        System.out.println("\n \n \nPlease wait while the computer plans its move...\n \n \n");
                        Thread.sleep(2*1000);
                        
                      String pos=" O  ";  
                 hai: for(int co=1;co<=2&& comp;co++)   
                  {      
                        
                       for(int i=0;i<=2;i++)
                       {
                            if(box[i][0].equals(box[i][1]) && box[i][1].equals(pos)&& box[i][2].equals("___ "))
                            {row=i+1;column=3;comp=false;break;}
                            if(box[i][1].equals(box[i][2]) && box[i][2].equals(pos)&& box[i][0].equals("___ "))
                            {row=i+1;column=1;comp=false;break;}
                            if(box[i][0].equals(box[i][2])&&box[i][2].equals(pos)&&box[i][1].equals("___ "))
                            {row=i+1;column=2;comp=false;break;}
                        }
                        for(int i=0;i<=2;i++)
                       {
                            if(box[0][i].equals(box[1][i])  &&box[1][i].equals(pos)&& box[2][i].equals("___ "))
                            {row=3;column=i+1;comp=false;break;}
                            if(box[1][i].equals(box[2][i]) &&box[2][i].equals(pos)&& box[0][i].equals("___ "))
                            {row=1;column=i+1;comp=false;break;}
                            if(box[0][i].equals(box[2][i])&&box[2][i].equals(pos)&&box[1][i].equals("___ "))
                            {row=2;column=i+1;comp=false;break;}
                        }
                        if(box[0][0].equals(box[1][1])&&box[1][1].equals(pos)&&box[2][2].equals("___ "))
                        {row=3;column=3;comp=false;}
                        if(box[2][2].equals(box[1][1])&&box[1][1].equals(pos)&&box[0][0].equals("___ "))
                        {row=1;column=1;comp=false;}
                        if(box[0][0].equals(box[2][2])&&box[2][2].equals(pos)&&box[1][1].equals("___ "))
                        {row=2;column=2;comp=false;}
                        
                        if(box[2][0].equals(box[1][1]) && box[1][1].equals(pos) && box[0][2].equals("___ "))
                        {row=1;column=3;comp=false;}
                        if(box[2][0].equals(box[0][2])&&box[0][2].equals(pos)&&box[1][1].equals("___ "))
                        {row=2;column=2;comp=false;}
                        if(box[0][2].equals(box[1][1])&&box[1][1].equals(pos)&&box[2][0].equals("___ "))
                        {row=3;column=1;comp=false;}
                        if(comp)
                        pos=" X  ";
                        
                    }
                    
                   if(comp&& end==2 &&box[1][1]==" O  "&&box[1][0]==" X  ")
                    {row=1;column=1;comp=false;}
                    
                    if(comp&& end==2 &&box[1][1]==" O  "&&box[1][2]==" X  ")
                    {row=1;column=3;comp=false;}
                    
                    
                    if(comp && box[1][1].equals("___ "))
                    {
                        row=2;column=2;comp=false;
                    }
                    if(end==3 && comp && ((box[2][0].equals(" X  ")&& box[0][2].equals(" X  "))||(box[0][0].equals(" X  ")&&box[2][2].equals(" X  "))))
                    {
                        row=1;column=2;comp=false;}
                    
                    if(end==1 &&comp&& (box[0][0].equals(" X  ") || box[2][2].equals(" X  ") || box[0][2].equals(" X  ") || box[2][0].equals(" X  ")))
                    {row=1;column=2;comp=false;}
                     
                 if(comp&&box[1][1].equals(" X  "))
                 {
                                        
                    if(comp && box[0][0].equals(" O  ") &&box[2][2].equals("___ ")&&box[2][1].equals("___ ")&&box[1][2].equals("___ "))
                    {comp=false;row=3;column=3;}
                    if(comp&&box[2][2].equals(" O  ") &&box[0][0].equals("___ ")&&box[0][1].equals("___ ")&&box[1][0].equals("___ "))
                    {comp=false;row=1;column=1;}
                    if(comp&&box[0][2].equals(" O  ") &&box[2][0].equals("___ ")&&box[2][1].equals("___ ")&&box[1][0].equals("___ "))
                    {row=3;column=1;comp=false;}
                    if(comp&&box[2][0].equals(" O  ") &&box[0][2].equals("___ ")&&box[0][1].equals("___ ")&&box[1][2].equals("___ "))
                    {comp=false;row=1;column=3;}
                    
                    
                }
                else if(comp && box[0][1].equals(" X  ")&&end==2)
                  {comp=false;attck=true;row=3;column=1;}
                 else if(comp && box[1][2].equals(" X  ")&&end==2)
                  {comp=false;row=1;attck=true;column=3;}
                   else if(comp && box[2][1].equals(" X  ")&&end==2)
                   {comp=false;row=3;column=1;attck=true;}
                    else if(comp && box[1][0].equals(" X  ")&&end==2)
                    {comp=false;row=1;column=3;attck=true;}
                  
                    if(attck)
                    {
                        
                         if(comp && box[0][0].equals(" O  ") &&box[2][2].equals("___ ")&&box[2][1].equals("___ ")&&box[1][2].equals("___ "))
                    {comp=false;row=3;column=3;}
                    if(comp&&box[2][2].equals(" O  ") &&box[0][0].equals("___ ")&&box[0][1].equals("___ ")&&box[1][0].equals("___ "))
                    {comp=false;row=1;column=1;}
                    if(comp&&box[0][2].equals(" O  ") &&box[2][0].equals("___ ")&&box[2][1].equals("___ ")&&box[1][0].equals("___ "))
                    {row=3;column=1;comp=false;}
                    if(comp&&box[2][0].equals(" O  ") &&box[0][2].equals("___ ")&&box[0][1].equals("___ ")&&box[1][2].equals("___ "))
                    {comp=false;row=1;column=3;}
                    
                } 
                        
                        
                        
                        
                        
                    
                    if(comp && box[0][0].equals("___ ")) 
                    {row=1;column=1;comp=false;}
                  
                            
                    if(comp&&(box[0][0].equals(" X  ") || box[0][2].equals(" X  "))&&box[0][1].equals("___ ")&& end==2) 
                    {row=1;column=2;comp=false;}
                    else if(comp && (box[2][0].equals(" X  ") || box[2][2].equals(" X  "))&&box[2][1].equals("___ ")&& end==2)
                    {row=3;column=2;comp=false;}         
                 
                  if(comp && box[2][2].equals("___ ")) 
                  {row=3;column=3;comp=false;}
                  
                  else if(comp && box[0][2].equals("___ "))
                  {row=1;column=3;comp=false;}
                  
                   
                           
                  
                    
                        if(comp || !box[row-1][column-1].equals("___ ")) 
                        {
                            do
                            {
                                row=(int)(Math.random()*10);
                                row=row>3||row==0?row%3+1:row;
                        
                                column=(int)(Math.random()*10);
                                column=column>3||column==0?column%3+1:column;
                            }
                            while(!box[row-1][column-1].equals("___ "));
                        }
                        
                    }
                    clearscreen();
                    System.out.println(" \t Current status of the game is:\n \n \n");
                          if(ply==0)
                         {
                             ply=1;
                             box[row-1][column-1]=" X  ";
                             comp=true;
                             
                         }
                                    
                          else
                          {
                              ply=0;
                              box[row-1][column-1]=" O  "; 
                              comp=true;
                              
                          }
                                
                           printStatus(box);
                           
                          if((box[0][0].equals(box[0][1])&&box[0][1].equals(box[0][2])&&box[0][2].equals(" X  "))||(box[1][0].equals(box[1][1]) && box[1][1].equals(box[1][2])&&box[1][2].equals(" X  "))||(box[2][0].equals(box[2][1]) && box[2][1].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][0].equals(box[1][0])&&box[1][0].equals(box[2][0])&&box[2][0].equals(" X  "))||(box[0][1].equals(box[1][1])&&box[1][1].equals(box[2][1])&&box[2][1].equals(" X  "))||(box[0][2].equals(box[1][2])&&box[1][2].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][0].equals(box[1][1])&&box[1][1].equals(box[2][2])&&box[2][2].equals(" X  "))||(box[0][2].equals(box[1][1])&&box[1][1].equals(box[2][0])&&box[2][0].equals(" X  ")))
                          {
                               Thread.sleep(1000);
                              uwinno++;
                              clearscreen();
                              
                              System.out.println("User gains "+(uwinno) +" points and the computer loses 2 points ");
                              System.out.println("\n \n \n\n\n\n\n\n Input area : ");
                              Thread.sleep(2*1000);
                              upoints=upoints+uwinno;
                              cpoints=cpoints-2;
                              Thread.sleep(1000);
                          
                              
                              break main;
                              
                            }
                            if((box[0][0].equals(box[0][1])&&box[0][1].equals(box[0][2])&&box[0][2].equals(" O  "))||(box[1][0].equals(box[1][1]) && box[1][1].equals(box[1][2])&&box[1][2].equals(" O  "))||(box[2][0].equals(box[2][1]) && box[2][1].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][0].equals(box[1][0])&&box[1][0].equals(box[2][0])&&box[2][0].equals(" O  "))||(box[0][1].equals(box[1][1])&&box[1][1].equals(box[2][1])&&box[2][1].equals(" O  "))||(box[0][2].equals(box[1][2])&&box[1][2].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][0].equals(box[1][1])&&box[1][1].equals(box[2][2])&&box[2][2].equals(" O  "))||(box[0][2].equals(box[1][1])&&box[1][1].equals(box[2][0])&&box[2][0].equals(" O  ")))
                            {
                                Thread.sleep(1000);
                                cwinno++;
                                clearscreen();
                              System.out.println("Computer gains "+(cwinno)+" points and the user loses 2 points ");
                            System.out.println("\n \n \n\n\n\n\n\n Input area : ");
                              Thread.sleep(2*1000);
                                cpoints=cpoints+cwinno;
                                upoints=upoints-2;
                                Thread.sleep(1000);
                               
                                break main;
                            }
                                    end++;
                                    if(end==9)
                                    break main;
                                    
                                    tour=false;
                 
                clearscreen();
                    
                    
}

                
                
                if(end>=9)
                {
                    tie=true;
                    clearscreen();
                    System.out.println("User gains 2 points and the computer gains 2 points ");
                    Thread.sleep(2*1000);
                    cpoints=cpoints+2;
                    upoints=upoints+2;
                    Thread.sleep(1000);
                    
                }
                               
                   
                
                    
                    
 }
             private       boolean  validation(String s)throws IOException,InterruptedException 
            {
                if(s.equals(""))
                {
                    return true;
                }
                for(int i=0;i<=s.length()-1;i++)
                {
                    char m=s.charAt(i);
                    if(!(m>='0'&&m<='3')||s.length()>=20)
                        return true;
                }
                    int check=Integer.parseInt(s);
                    
                    if(!(check>=1&&check<=3))
                        return true;
                   
                        return false;
            }
             private       boolean  validation1(String s)throws IOException,InterruptedException 
            {
                if(s.equals(""))
                {
                    return true;
                }
                for(int i=0;i<=s.length()-1;i++)
                {
                    char m=s.charAt(i);
                    if(!(m>='0'&&m<='9')||s.length()>=20)
                        return true;
                }
                    int check=Integer.parseInt(s);
                    
                    if(!(check>=1&&check<=9))
                        return true;
                   
                        return false;
            }
            
            
            
          private  boolean quitGame(String s)throws IOException,InterruptedException 
                {
                    
                    InputStreamReader a= new InputStreamReader(System.in);
                    BufferedReader b=new BufferedReader(a);
                    
                        if(s.trim().equalsIgnoreCase("x"))
                        {
                            System.out.print(" \n \n \n \t Are you sure you want to quit (Press any key if you want to continue with the game.Press \" y \" if you want to quit and go to the main menu): -");
                           System.out.println("\n \n \n\n\n\n\n\n Input area : ");
                            s=b.readLine();
                            
                            if(s.trim().equalsIgnoreCase("y"))
                            {
                                         Tictactoe.clearscreen(); 
                                System.out.println("\n \n \n \t  The game \"A B A N D O N E D\"\n \n \n");
                                Thread.sleep(2*1000);
                                return true;
                            
                        }}
                                return false;
                 }
                
                 
             private     void printStatus(String a[][])throws IOException,InterruptedException 
            {
                
               
                
               
                System.out.print("\t");
                
                for(int i=1;i<=3;i++)
                {
                    System.out.print("   "+i);
                }
                    System.out.println();
            
                for(int j=0;j<=2;j++)
                {
                    System.out.print("\t"+(j+1)+" ");
                    
                    for(int i=0;i<=2;i++)
                    {
            
                        System.out.print(a[j][i]);
                    }
                        System.out.println();
        
                }
            }
            
           private void thankYou(int temp)throws IOException,InterruptedException 
            {
               clearscreen();
                System.out.println("================================================================================================================");
               
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
                switch(temp)
                {
                  case 1:  
                System.out.println("\t \t Thank You for playing \n \n \n ");break;
                
                case 2:
                System.out.println("\t \t Player 1 is the winner.\n\n");
                 System.out.println("\n \n \n \n \t \t FINAL SCORE ");
                 System.out.println("Player 1 : "+upoints);
                 System.out.println("Player 2 : "+cpoints);
                System.out.println("\n\n\nPlease wait while the menu loads........\n \n \n " );break;
                
                case 3:
                System.out.println("\t \t Player 2 is the winner.\n");
                 System.out.println("\n \n \n \n \t \t FINAL SCORE ");
                 System.out.println("Player 1 : "+upoints);
                 System.out.println("Player 2 : "+cpoints);
                System.out.println("\n\n\nPlease wait while the menu loads........ \n \n \n" );break;
                
                case 4:
                System.out.println("\t \t User is the winner.\n ");
                 System.out.println("\n \n \n \n \t \t FINAL SCORE ");
                 System.out.println("User     : "+upoints);
                 System.out.println("Computer : "+cpoints);
                System.out.println("\n\n\nPlease wait while the menu loads.......... \n \n \n" );break;
                
                case 5:
                System.out.println("\t \t computer is the winner.\n");
                 System.out.println("\n \n \n \n \t \t FINAL SCORE ");
                 System.out.println("User     : "+upoints);
                 System.out.println("Computer : "+cpoints);
                System.out.println("\n\n\n Please wait while the menu loads..........\n \n \n " );break;
                
                case 6:
                System.out.println("\t \t The game ends in a draw.\n");
                 System.out.println("\n \n \n \n \t \t FINAL SCORE ");
                 System.out.println("Player 1\\User     : "+upoints);
                 System.out.println("Player 2\\Computer : "+cpoints);
                System.out.println("\n\n\nPlease wait while the menu loads..........\n \n \n ");break;
                
               
                 
            }
                
                
                
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
                
                 System.out.println("================================================================================================================");
                } 
                
                
               private static void clearscreen()throws IOException,InterruptedException 
               {
                  
                    for(int i=0;i<=101;i++)
                    System.out.println();
                     System.out.println();
                   
                      
                    
               
                    
                    
                } 
                private static void rules()throws IOException,InterruptedException 
               {
                  
                    InputStreamReader a= new InputStreamReader(System.in);
                     BufferedReader b=new BufferedReader(a);
                   
                     clearscreen();
                     
                     System.out.println("RULES : \n \n \n "); 
                     System.out.println("It is a two player game.There is a 3x3 matrix.each player fills ' X ' and ' O' alternately ");
                     System.out.println("The first player to get a row of 3 X's or 3 O's horizontally or vertically or diagonally wins ");
                     System.out.println("A player can't place a X or a O in a box which is aldready filled.");
                     System.out.println("If no player is able to get a set of 3 x's or 3 O's and  all the 9 boxes are filled,then the game ends in a draw .");
                     System.out.println("\n \n The game is played as a tournment.The number of games in one tournment is decided by the player(s).");
                     System.out.println("The points are based on the number of wins and the current score i.e. the current number of wins is added to the current score to give the new current score. ");
                     System.out.println("\n Example : ");
                     System.out.println(" If the current score of a player is 1 and after winning the game his number of wins becomes 2 then :");
                     System.out.println("\n his new score = 1+2=3 ");
                     System.out.println("\n The player with the highest points after the set of games is declared the winner ");
                     System.out.println("However if the scores are equal then there is a tie-breaker match,the winner of which is declared winner ");
                     System.out.println("Even if the tie-breaker match ends in a draw then the match is declared draw ");
                     
                     System.out.println("\n \n \n \n \n \n \n Press any key to go back to main menu.");
                     
                     b.readLine();
                    
                    
                }    
                
          
            
                
          
   }


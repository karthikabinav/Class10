import java.io.*; 
class Number 
{
     void words()throws IOException
     {
         boolean neg=false;
         InputStreamReader a= new InputStreamReader(System.in);
         BufferedReader b= new BufferedReader(a);
         System.out.print("please enter your number: ");
         String input=b.readLine();
         while(input.length()>=10)
         {
             System.out.print("Number too large.Please enter a number less than 10 digits: ");
             input=b.readLine();
            }
              
         for(int i=0;i<=input.length()-1;i++)
         {
             char x=input.charAt(i);
             if(!(x>='0'&&x<='9')&& x!='-')
             {
                 System.out.print("Wrong input.Please enter a number: ");
                 input=b.readLine();
                 i=-1;
                }
            }
            while(input.equals(""))
            {
                System.out.print("Please enter a number: ");
                input=b.readLine();
            }
            int inp=Integer.parseInt(input);
                 
         if(input.equals("0"))
         
         System.out.println("Zero");
                 
        String units[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]={"","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String hundreds[]={"Hundred(s)","Thousand(s)","Lakh(s)","Crore(s)","Arab(s)"};
            
          String word="";
            if(inp<0)
            neg=true;
            
            inp=(int)(Math.abs(inp));
           int digit=1;
            
            if((inp%100)<=19)
            {
                word=units[inp%100]+" "+word;
                
                digit=digit+2;
                
                inp=inp/100;
            }
            
            
                                while(digit<=3)
                                {
                                    int temp=inp%10;
                                    
                                    if((digit==1) && (temp!=0))
                                    word=units[temp]+" "+word;
                                    
                                    else if((digit==2) && (temp!=0))
                                    word=tens[temp-1]+" "+word;
                                    
                                    else if((digit==3) && (temp!=0))
                                    word=units[temp]+" "+hundreds[0]+" "+word;
                   
                                    inp=inp/10;
                                    
                                    digit++;
                                }
                                
                               
                                
                                 while(inp!=0)
                                 {
                                     int temp=inp%100;
                                     
                                     if(((temp%100)<=19) && ((temp%100)!=0))
                                     word=units[temp]+" "+hundreds[digit-3]+" "+word;
                                     
                                     else if(temp!=0)
                                     word=tens[(temp/10)-1]+" "+units[temp%10]+" "+hundreds[digit-3]+" "+word;
                                     
                                     
                                     inp=inp/100;
                                     
                                     digit++;
                    
                   
                                    }
                   if(neg)
                   word="minus "+word;
               System.out.println(word);
               System.out.print("Press any key to continue / press \"x\" to quit: ");
               String choice=b.readLine();
               if(choice.equals("x"))
               {
                   System.out.println("Thank you");
                }
                else
                {
                    words();}
     }
 }
            
            
            
  
  
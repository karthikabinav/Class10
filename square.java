class square
{
    void disp(double n,int decimal)
    {
        String g=""+n;
        int te=Integer.parseInt(g.substring(0,g.indexOf('.')));
        String q=""+te;
        if(te%2!=0)
        q=""+0+te;
        te=Integer.parseInt(q);
        
        int count=0,point=0,extra=0,num=1,side=0,i;boolean check=true;
        String a[]=new String[g.length()+decimal+2];
        
       
       String ha=g.substring(g.indexOf('.')+1,g.length());
       
       if(ha.length()%2!=0)
       g=g+0;
       
       if(Integer.parseInt(g.substring(g.indexOf('.')+1,g.length()))==0)
       {
           check=false;
           extra=0;
        }
        
       while(num<=decimal+2) 
        {
                       
           for(i=0;i<=te+1;i++)
            {
                if(((side*10)+i)*i>te)
                {
                    i=i-1;
                    a[count]=""+(i);
                    count++;
                   
                    if(num==1&&decimal!=0)
                   { a[count]=".";count++;point=g.indexOf('.');}
                    break ;
                }
                
            }
            if(point>=g.length()-1&&check)
            {
                extra=0;check=false;
            }
            else if(check)
            {
                extra=Integer.parseInt(g.substring(point+1,point+3));
            }

            te=(te-((side*10)+i)*i)*100+extra;
            
           
           side=(side*10+i);
            if(num>1)
           side=side+side%10;
           else
          side=2*side;
           
             num++;
            point=point+2;
        }
        
        for(int j=0;j<=count-2;j++)
        {
            if(j!=count-2)
            System.out.print(a[j]);
            else if(Integer.parseInt(a[j+1])>=5)
            {
                System.out.print(Integer.parseInt(a[j])+1);
            }
            else
            {
                System.out.print(a[j]);
            }
        }
            
        }
            
            
                       
           

    }


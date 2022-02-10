
package algoritmos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prime2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String m1,m2,m;
        int n1=0,n2=0,n=0;
        try
        {
//input as string instead of integer because errors must be displayed only after all the values have been input

        m1=br.readLine();   //range minimum value
        m2=br.readLine();   //range max value
        m=br.readLine();    //nth value in range
        n1=Integer.parseInt(m1);
        n2=Integer.parseInt(m2);
        n=Integer.parseInt(m);
        if(n1<0||n2>1500000||n1>n2||n==0)
                throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int k=n1,count=0,count1=0;
        while(k<=n2&&count1<=n)
        {
            count=0;
            for(int i=1;i<=k;i++)
            {
                if(k%i==0)
                    count++;
            }
            if(count==2)
            {
                count1++;
            }
            k++;
        }
        if(count1==n)
        {
            System.out.println(k);
            System.exit(0);
        }
        if(count1<n)
        {
            System.out.println("No prime number is present at this index");
            System.exit(0);
        }

    }
}

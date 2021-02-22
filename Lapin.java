/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			HashMap<Character,Integer> freqLeft=new HashMap<Character,Integer>();
			HashMap<Character,Integer> freqRight=new HashMap<Character,Integer>();

			String st=sc.next();
			int len=st.length(),j=0,k=0;
            if(len%2==0)
                k=len/2-1;
            else 
                k=len/2+1;

			for(;j<len/2;j++,k++)
			{
				freqLeft.put(st.charAt(j),freqLeft.getOrDefault(st.charAt(j),0)+1);
				freqRight.put(st.charAt(k),freqRight.getOrDefault(st.charAt(k),0)+1);

			}
            for (Map.Entry<Character,Integer> entry : freqRight.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
			Boolean t=false;
			for (Character c : freqLeft.keySet()) {
				if(freqLeft.get(c).equals(freqRight.get(c))){
                System.out.println("Ran "+freqLeft.get(c)+freqLeft.get(c)+c);
					t=true;
                }
                else {
                    t=false;
                    break;
                }

					}
			if(t)
				System.out.println("YES");
			else System.out.println("NO");

		}
        sc.close();
	    
	    
	}
}
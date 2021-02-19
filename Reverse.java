import java.util.Scanner;

//package Java-practice-code;

public class Reverse {
    public static void main(String [] args){
        //double a=0;
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        String reverseString= sc.nextLine();
        char charString[] = reverseString.toCharArray();
        int len=reverseString.length();
        for(int i=0,j=len-1;i<len/2;i++,j--)
        {
            char temp=charString[i];
            charString[i]=charString[j];
            charString[j]=temp;
            //System.out.println("char i="+charString[i]+" char j="+charString[j]+" ");            
        }
        reverseString=String.valueOf(charString);
        System.out.println(reverseString);
        sc.close();


    }
    
}

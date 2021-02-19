import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
class Calculator{
        static HashMap<Integer,Double> putValue(Scanner sc){
                HashMap<Integer, Double> inputDouble = new HashMap<Integer, Double>();
                double a=0,b=0;          
                try {
                        
                        
                         a=sc.nextDouble();
                         b=sc.nextDouble();
                         sc.close();
                        
                        
                } catch (InputMismatchException e) {
                        System.out.println("enter numbers");
                        return null;

                                                
                }
                inputDouble.put(1,a);
                inputDouble.put(2,b);
                
                return inputDouble;
        }


       public static void main(String args[]){
            Calculator cal=new Calculator();
            //Scanner sc= new Scanner(System.in);
            System.out.println("Enter 2 numbers");
            HashMap<Integer, Double> newInput = new HashMap<Integer, Double>();
            Scanner sc= new Scanner(System.in);
            newInput=putValue(sc);
            while(newInput==null){
                newInput=putValue(sc);
                    
            }
            double a=newInput.get(1);
            double b=newInput.get(2);

            System.out.println("Select operation\n1:Addition\n2:subtraction\n3:multiplication\n4:division\n5:exit");
            int x=sc.nextInt();
            double result;
            switch(x){
                case 1:result=cal.addition(a,b);
                        System.out.println(result);
                        break;
                case 2:result=cal.subtraction(a,b);
                        System.out.println(result);
                        break;
                case 3:result=cal.multiplication(a,b);
                        System.out.println(result);
                        break;
                case 4:result=cal.division(a,b);
                        System.out.println(result);
                        break;
                case 5:System.exit(0);
                        break;
                default:System.out.println("Enter valid operation");    
            }
            sc.close();
           }
    double addition(double a,double b){
        return a+b;
    }
     double subtraction(double a,double b){
        return a-b;
    }
     double multiplication(double a, double b){
       return a*b;
    }
    double division(double a, double b){
        return a/b;
     }
    

}
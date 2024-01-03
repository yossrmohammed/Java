package exception;

import java.util.Scanner;

public class mainClass {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int x= input.nextInt();
        int y= input.nextInt();
         try{
            Operations op=new Operations();
            double resDivesion= op.division(x, y);
            System.out.println(resDivesion);
            double resRoot= op.root(x);
             System.out.println(resRoot);
             int resDiff=op.diffrance(x, y);
              System.out.println(resDiff);




        }catch(myException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is message from fillay part");

        }
        /*Scanner input = new Scanner(System.in);

        int x= input.nextInt();
        int y= input.nextInt();
        try{

        System.out.println(x/y);
        }
        catch(ArithmeticException ex){
            System.out.println("Can't divide by zero!!");

        }*/
    }
}

package ExerciseTwo;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
            stringChecking stringUtils= new stringChecking();
            System.out.println("Enter string : ");
            Scanner scanner= new Scanner(System.in);
            String str= scanner.nextLine();
    boolean res= stringUtils.checkString(str, (s)->{
            for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
               // System.out.println(str.charAt(i));
                return false;
            }
            
        };
        return true;
    });
    if(res==true){
        System.out.println("In the string, there are  only alphabets.");
    }
    else{
         System.out.println("In the string, there are not only alphabets.");

    }
    scanner.close();

    }
    

}

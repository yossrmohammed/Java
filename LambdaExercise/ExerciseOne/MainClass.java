package ExerciseOne;

import java.util.Scanner;

public class MainClass {
public static void main(String [] args){
    Scanner scanner= new Scanner(System.in);
    StringUtils stringutils= new StringUtils();
    System.out.println("Enter first string: ");
    String str1= scanner.nextLine();
    System.out.println("Enter second string: ");
    String str2= scanner.nextLine();
    String longer= stringutils.betterString(str1, str2, (s1,s2)->s1.length()>s2.length());
    String first =stringutils.betterString(str1, str2, (s1,s2)->true);
    System.out.println("Longer = " + longer);
    System.out.println("First= "+ first);
    scanner.close();
}
    
}
package simpleWordDictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {
    public static void menu(DictionaryClass d) throws myException {
        int option;
        do{
        System.out.println("Choose one :");
        System.out.println("1-Insert");
        System.out.println("2-PrintAll");
        System.out.println("3-Remove all");
         System.out.println("4-Remove word");
        System.out.println("5-Get words");
        System.out.println("6-Search");
        System.out.println("7-Exit");

        Scanner scanner= new Scanner(System.in);
        option=Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:{
            System.out.println("Enter words");
            String words= scanner.nextLine();
            List <String> wordsList=  new ArrayList<>();
            StringTokenizer tokenizer= new StringTokenizer(words);
            while (tokenizer.hasMoreTokens()) {
                wordsList.add(tokenizer.nextToken());
                
            }
            //List <String> wordsList= Arrays.asList(words);
                d.insert(wordsList);
                
                break;
        }
        case 2:{
            d.printAll();
            break;
        }
        case 3 :{
            d.removeAll();
            break;
        }
        case 4 :{
            System.out.println("Enter word");
            String word= scanner.next();
            d.removeWord(word);
            break;

        }
        case 5:{
            System.out.println("Enter character");
            char key= scanner.next().toLowerCase().charAt(0);
            System.out.println(d.getWords(key));
            break;
        }
        case 6 :{
            System.out.println("Enter pattren");
            String pattren= scanner.nextLine();
            System.out.println(d.search(pattren));
            break;
        }
            default:
                break;
        }}while(option!=7);
        



    }
    public static void main(String [] args){

        try { 
          DictionaryClass d= new DictionaryClass();
        List <String> words= Arrays.asList("apple", "ant", "banana", "hat");
        
        //d.insert(words);
        //d.printAll();
        // d.removeWord("lll");
        //d.printAll();
        //d.removeAll();
        //d.printAll();
        //System.out.println(d.getWords('c'));
         //System.out.println(d.search("an"));
         
           menu(d);
         
         


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    } 
}

package simpleWordDictionary;
import java.util.*;
import java.util.Map.Entry;

public class DictionaryClass {
            Map<Character, TreeSet<String>> dictionary;
           public DictionaryClass(){
                dictionary= new HashMap<Character,TreeSet<String>>();
            }
        public void insert(List<String> words){
        for(String word:words){
            char key= word.charAt(0);
            TreeSet<String> value= dictionary.get(key);
            if(value== null){
                value =new TreeSet<String>();
                dictionary.put(key, value);
            }
            value.add(word);
        }
        
     }
     public void printAll(){
        if(dictionary.isEmpty()){
            System.out.println("dictionary is empty");
        }
        for(Entry<Character, TreeSet<String>> e: dictionary.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }
        
     }
     public void removeWord(String word) throws myException{
         char key= word.charAt(0);
            Set<String> value= (Set<String>) dictionary.get(key);
            //System.out.println(value);
            if(value==null){
                throw new myException("Word is not exist");
            }
                value.remove(word);
            
     }
    public void removeAll(){
        dictionary.clear();

    }
    public Set<String> getWords(char key) throws myException{
        Set<String> value= (Set<String>) dictionary.get(key);
        if(value==null){
            throw new myException("no words with this character");
        }
        else{
            return value;
        }


    }
    public Set<String> search(String regex){

        Set<String> match= new HashSet<String>();
        for(Entry<Character, TreeSet<String>> entry: dictionary.entrySet()){
            for(String word: entry.getValue()){
                if(word.contains(regex)){
                    match.add(word);
                }
            }
        }
        return match;


    }


}
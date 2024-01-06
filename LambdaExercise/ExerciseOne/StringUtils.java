package ExerciseOne;
import java.util.function.BiPredicate;

public class StringUtils {
    public String betterString(String s1,String s2 , BiPredicate<String,String> compare){
        if(compare.test(s1, s2)){
            return s1;
        }
        return s2;
    }    
}
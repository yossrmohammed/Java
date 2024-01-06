package ExerciseTwo;

import java.util.function.Predicate;

public class stringChecking {
    public Boolean checkString(String str , Predicate<String> check){
        if(check.test(str)){
        return true;
        }
        return false;

    }
    
}

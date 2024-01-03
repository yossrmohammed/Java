package shapesExercies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List <circle> circles= new ArrayList<>();
        circles.add(new circle(10));
         circles.add(new circle(11));
        circles.add(new circle(12));
          List <rectangle> rectangle= new ArrayList<>();
          rectangle.add(new rectangle(10, 20));
          rectangle.add(new rectangle(30, 40));
          test t=new test();
          t.testFun(circles);
        t.testFun(rectangle);








    }
    
}

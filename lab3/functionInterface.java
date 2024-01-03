import java.util.function.Function;

 class TempConverter{
public static void main(String [] args){
 Function<Double, Double> converter= a -> (a *9/5)+32;
 System.out.println(converter.apply(30.0));
}
}

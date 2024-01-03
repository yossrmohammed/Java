package myPackage;
import java.util.function.Function;

interface myInterface extends Function<Double, Double>{

public Double apply(Double a);
}
 public class RootsOfEquation implements myInterface{
 double b;
 double c;
 public RootsOfEquation(double b, double c){
 this.b=b;
 this.c=c;
 }

public Double apply(Double a){

 double discriminant = (b*b)-(4* a*c);

if(discriminant>0){
double pRoot = (-b + Math.sqrt(discriminant))/(2*a);
double nRoot = (-b - Math.sqrt(discriminant))/(2*a);
System.out.println("The roots is real " +pRoot + "  " + nRoot);

}
else if(discriminant==0){
double pRoot =  (-b + Math.sqrt(discriminant));
System.out.println("The roots is real " +pRoot);
}
else{
System.out.println("The roots is not  real ");
}
return 0.0;
}
}

package ComplexExercise;

public class mainClass {
    public static void main(String [] args){
        Complex<Double,Integer> c1=new Complex<Double,Integer>(2.5,2);
        Complex<Double,Integer> c2=new Complex<Double,Integer>(1.5,2);
        Complex<Double, Integer> sum=c1.add(c2);
        System.out.println("summtion:");
        sum.print();
        Complex<Double, Integer> sub=c1.sub(c2);
        System.out.println("subtraction:");
        sub.print();
        Complex<Double, Integer> multiply=c1.multiply(c2);
        System.out.println("multiplication");
        multiply.print();
        
        



    }
    
    
}

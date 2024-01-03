package ComplexExercise;

public class Operations<A extends Number> {
    public A addNumbers(A a,A b){
        if(a instanceof  Double||b instanceof  Double){
            double res = a.doubleValue()+b.doubleValue();
            return (A) Double.valueOf(res);
        }
        else {
            int res = a.intValue()+b.intValue();
            return (A) Integer.valueOf(res);
        }

    }
        public A subtractNumbers(A a,A b){
        if(a instanceof  Double||b instanceof  Double){
            double res = a.doubleValue()-b.doubleValue();
            return (A) Double.valueOf(res);
        }
        else {
            int res = a.intValue()-b.intValue();
            return (A) Integer.valueOf(res);
        }
        

    }
        public A multiplyNumbers(A a,A b){
        if(a instanceof  Double||b instanceof  Double){
            double res = a.doubleValue()*b.doubleValue();
            return (A) Double.valueOf(res);
        }
        else {
            int res = a.intValue()*b.intValue();
            return (A) Integer.valueOf(res);
        }

    }
    


}

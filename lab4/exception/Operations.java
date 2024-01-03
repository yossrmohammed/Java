    package exception;
    public class Operations {
    public double division(double x,double y) throws myException{
        if(y==0){
            throw new myException("Division by zero is not allowed");
        }
        return (double) x/y;


    }
    public double root(double x) throws myException{
        if(x<=0){
        throw new myException("Cannot make square root on negative number");
        }
        return Math.sqrt(x);

    }
    public  int diffrance(int x,int y) throws myException{
        
        if(y<0|| x<0){
                    throw new myException("Numbers must be postive");

        }
        return x-y;

    }


}
package ComplexExercise;
public class Complex<A extends Number , B extends Number> {
    private A real;
    private B img;
    private Operations op;
    public  Complex(A real,B img){
        this.real=real;
        this.img=img;
        op=new Operations<>();
    }

    public A getReal(){
        return real;
    }
    public B getImg(){
        return img;
    }
   public <A extends Number , B extends Number> Complex<A,B> add(Complex<A,B> c){
    A realRes= (A) op.addNumbers(this.getReal(), c.getReal());
    B imgRes= (B) op.addNumbers(this.getImg(), c.getImg());

     return  new Complex<A,B>(realRes,imgRes);

    }
     public <A extends Number , B extends Number> Complex<A,B> sub(Complex<A,B> c){
    A realRes= (A) op.subtractNumbers(this.getReal(), c.getReal());
    B imgRes= (B) op.subtractNumbers(this.getImg(), c.getImg());

     return  new Complex<A,B>(realRes,imgRes);

    }

       public <A extends Number , B extends Number> Complex<A,B> multiply(Complex<A,B> c){
    A realRes= (A) op.multiplyNumbers(this.getReal(), c.getReal());
    B imgRes= (B) op.multiplyNumbers(this.getImg(), c.getImg());

     return  new Complex<A,B>(realRes,imgRes);

    }
    public void print(){
        System.out.println(real + " + " + img + "i");
    }


    

}

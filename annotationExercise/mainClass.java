import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class mainClass {
    public static void main(String [] args){
        try {
            myAnno obj = new myAnno();
            Class<?> c= obj.getClass();
            Author author=c.getAnnotation(Author.class);
            System.out.println(author.name()+" "+ author.version());
        Method m = c.getMethod("displayMessage");
         author= m.getAnnotation(Author.class);
        System.out.println(author.name()+" "+ author.version());
        Constructor constructor=c.getConstructor(null);
        author=(Author) constructor.getAnnotation(Author.class);
                System.out.println(author.name()+" "+ author.version());

    } catch (NoSuchMethodException e) {
            System.out.println("Not Found");
        }
        
    }
    
}

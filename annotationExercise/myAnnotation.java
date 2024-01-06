import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,
ElementType.METHOD,
ElementType.FIELD,
ElementType.TYPE
}
)
@interface Author{
    String name();
    int version();
}




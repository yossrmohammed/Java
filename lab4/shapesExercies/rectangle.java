package shapesExercies;

public class rectangle extends shapes {
    private int width;
    private int hight;
    rectangle(int w,int h){
        width=w;
        hight=h;

    }
    @Override
    public void draw() {
        System.out.println("Draw  rectangle with width = "+ width+ " and hight = "+ hight);
    }
    
}

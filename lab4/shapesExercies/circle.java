package shapesExercies;

public class circle extends shapes {
    private int radius;
    circle(int r){
        radius=r;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle with radius = "+ radius );
    }
}

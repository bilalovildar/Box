package Les3forbox;

public class Apple extends Fruit{
    final float weight = 1.0f;


    public Apple(int count) {
        super(count);
    }
    @Override
    public float getWeight(){
        return weight*count;
    }
}

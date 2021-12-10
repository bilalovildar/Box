package Les3forbox;

public class Orange extends Fruit{
    final float weight = 1.5f;

    public Orange(int count) {
        super(count);
    }

    @Override
    public float getWeight(){
        return weight*count;
    }
}

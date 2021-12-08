package Les3forbox;

public abstract class Fruit {
    float weight;
    int count;

    public Fruit(int count) {
        this.count = count;
    }

    public abstract float getWeight();


}

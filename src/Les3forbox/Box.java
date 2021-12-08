package Les3forbox;

public class Box<T extends Fruit> {
    T[] goods;

    public Box(T[] goods) {
        this.goods = goods;
    }

    public float showgetWeight() {
        float sum = 0;
        for (T good : goods) {
            sum += good.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> second) {
        return this.showgetWeight() == second.showgetWeight();
    }

//    public void  swap(Apple[] apples, int index1, int index2){
//        apples temp = apples[index1];
//        apples[index2]=apples[index1];
//        apples[index1]=temp;
//    }

}


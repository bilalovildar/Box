package Les3forbox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Apple apples1 = new Apple(10);
        Apple apples2 = new Apple(20);
        Apple[] apples = new Apple[]{apples1, apples2};
        Box<Apple> box1 = new Box<Apple>(apples);
        System.out.println(box1.showgetWeight());

        Orange oranges1 = new Orange(2);
        Orange oranges2 = new Orange(7);
        Orange[] oranges = new Orange[]{oranges1, oranges2};
        Box<Orange> box2 = new Box<Orange>(oranges);
        System.out.println(box2.showgetWeight());

        System.out.println(box1.compare(box2));


//        Apple apples3 = new Apple(1);
//        Apple apples4 = new Apple(2);
//        Apple[] apples5 = new Apple[]{apples3, apples4};
//        Box<Apple> box5 = new Box<Apple>(apples5);
//        Box.swap(Apple, box5, box1);




// Задача 1. Написать метод, который меняет два элемента массива местами.
        String[] arr = {"казнить", ",", "нельзя", "помиловать"};
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}


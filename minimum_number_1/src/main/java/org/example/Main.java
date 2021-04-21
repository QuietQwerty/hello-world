package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
// найти второе минимальное число в одном цикле
//написать регулярное выражение проверяющее есть ли в тексте символ переноса строки повторяющийся ровно 3 раза
// реализовать пример с поварами, сделать 4 разных класса который будет реализовывать интерфейс повара - должен получится один универсальный класс у которого будет аргумент принимающий любой из 4х
public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{8,4,7,9,1,6,8,5,4,3};
        System.out.println(Arrays.toString(arr));
        int min = 0;
        int sum = 0;
        int minIndex = 0;
        min = arr[0];
        int secondmin = 0;
        secondmin = arr[0];
        try {
            for (int x = 0; x < (Array.getLength(arr) -1); x++) {
                if (arr[x] < secondmin) {
                    secondmin = arr[x];
                }
                if ((arr[x + 1] < arr[x]) || (secondmin > min)) {
                    min = arr[x + 1];
                }
                sum = sum + arr[x];

            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        int s = 0;
        s = arr[Array.getLength(arr) - 1];
        arr[Array.getLength(arr) - 1] = arr[0];
        arr[0] = s;
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(minIndex);
        System.out.println(min);
        System.out.println(secondmin);
        System.out.print("\r\n" + "Hello World" + "\n");
        Cook1 cook1 = new Cook1();
        Cook2 cook2 = new Cook2();
        Cook3 cook3 = new Cook3();
        Cook4 cook4 = new Cook4();
        newtest(cook2);
        newtest(cook3);
        newtest(cook4);

    }
    public static void newtest(Dish cook2) {

    }
}

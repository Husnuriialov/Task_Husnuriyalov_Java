import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Задание 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int str = in.nextInt();

        if (str>7){
            System.out.println("Привет");
        }
        else {
            System.out.println("Вы вели число меньше 7");
            return;

        }
        //Задание 2
        System.out.println("Введите имя");
        String str2 = in.next();
        if (str2.equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");

        //Задание3
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(" Элементы массива " + Arrays.toString(arr));
        System.out.println("Вывод элементов кратных 3: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
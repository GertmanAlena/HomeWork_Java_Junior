package task_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //        Напишите программу, которая использует Stream API для обработки списка чисел.
    //        Программа должна вывести на экран среднее значение всех четных чисел в списке.

    public static void main(String[] args) {
          List<Integer> list = Arrays.asList(1, 10, 3, 28, 8, 10);

//        Первый вариант
        int sum = 0;
        int count = 0;
        for (Integer number : list){
            if(number % 2 == 0){
                sum += number;
                count++;
            }
        }
        System.out.println("sr = " + sum/count);

        //        Второй вариант
        int x = list.stream().filter(number -> number % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        long y = list.stream().filter(number -> number % 2 == 0).count();
        int res = (int) (x/y);
        System.out.println("res = " + res);

        //        Третий вариант
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 10, 3, 28, 8, 10));
        double average = list2.stream().filter(namber -> namber % 2 == 0)
                .mapToDouble(namber -> namber).average().orElse(Double.NaN);
        System.out.println("average = " + average);
    }
}
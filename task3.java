package DZ_java.Java_DZ_3;

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 3.Задан целочисленный список ArrayList. Найти минимальное, 
// максимальное и среднее арифметическое этого списка.

public class task3 {
    public static void main14(String [] arg ){
        List <Integer> arr=new ArrayList<>();
        rand(arr);
        calk(arr);
    }
    
    public static void rand(List <Integer> arr){
        Random random = new Random();
        for (int i =0; i<10; i++) {
            arr.add(random.nextInt(20));
        }
    }

    public static void calk(List <Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        int medium = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (min>arr.get(i)){
                min = arr.get(i);
            }
        } for (int i = 0; i < arr.size(); i++) {
            if (max<arr.get(i)){
                max = arr.get(i);
            } 
        } for (int i = 0; i < arr.size(); i++) {
            medium+=arr.get(i);
        }
        medium = medium/arr.size();
        prin(arr, min, max, medium);
    }
   

    public static void prin(List <Integer> arr, int min, int max, int medium){
        System.out.println(arr);
        System.out.print("Минимальное значение: " + min);
        System.out.print("\nМаксимальное значение: " + max);
        System.out.print("\nСреднее арифметическое значение: " + medium);
    }
}

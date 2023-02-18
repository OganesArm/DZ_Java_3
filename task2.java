package DZ_java.Java_DZ_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main12(String [] arg ) {
        int [] number = new int [10];
        rand(number);
        serch(number);
    }

    public static void rand(int [] number){
        Random random = new Random(); 
        for (int i =0; i<number.length; i++) {
            number [i]= random.nextInt(20);
        }
    }
    public static void serch(int [] number){
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            arrayList.add(number[i]);
            }
        System.out.print("Массив arrayList: ");
        System.out.println(arrayList);  
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) %2==0){
                arrayList.remove(i--);
            }
        } prin(number, arrayList);
    }
    
    public static void prin(int [] number, List<Integer> arrayList){
        System.out.println("Массив без четных чисел: "+arrayList);   
    }
}
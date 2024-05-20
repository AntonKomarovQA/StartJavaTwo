package Lesson21Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Home21 {
    List<String> abc(String... array) {
        // Преобразование массива в список
        List<String> arrayList = Arrays.asList(array);
        // Сортировка списка и удаление дубликатов
        List<String> sortUpdate = arrayList.stream().distinct().sorted().collect(Collectors.toList());
        // Вывод отсортированного списка уникальных строк
        return sortUpdate;
    }

   public ArrayList <String> abc2 (String ... array2 ){
        ArrayList<String> al = new ArrayList<>();
       // Сортировка списка и удаление дубликатов
        for (String s : array2){
            if (!al.contains(s)){
                al.add(s);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        // Вывод отсортированного списка уникальных строк
        return al ;
    }
}

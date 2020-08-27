 import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class main {
    public static void main(String[] args) {

//        Первое задание!!!!!
//        String[] words = {
//                "Пессимизм", "Злость" , "Бактерия" , "Бактерия",
//                "программирование" , "Злость" , "программирование",
//                "Бактерия" , "Птица" , "Погода", "Космос" , "Птица" ,
//                "программирование", "Осознание" , "Осознание" ,
//                "Школа", "Птица" , "Гауптвахта" , "Пессимизм",
//                "Камин" , "программирование" , "Бактерия",
//                "Школа" , "Пробел" , "Пессимизм", "Школа" ,
//                "Гауптвахта" , "Осознание", "Космос" , "программирование"
//        };
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            String oneWord = words[i];
//            Integer word = map.getOrDefault(oneWord, 0);
//            map.put(oneWord, word + 1);
//        }
//        System.out.println(map);


        new Add("Мамедов", 7008070);
        new Add("Панин", 7888778);
        new Add("Трамп", 5887851);
        new Add("Алиев", 1101010);
        new Add("Путин", 1000001);
        new Add("Лукашенко", 9989968);

        new Get("Путин");


    }
}

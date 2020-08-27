import java.util.HashMap;
import java.util.Map;

public class Add {
    String surname;
    Integer number;

    public Map<String, Integer> newNum = new HashMap<>();

    public Add(String surname, Integer number) {
        this.surname = surname;
        this.number = number;
        newNum.put(surname, number);
    }

    public Add (String surname) {
        this.surname = surname;
        System.out.println(newNum.get(surname));
    }

}

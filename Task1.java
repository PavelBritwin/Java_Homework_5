package Java_homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        phoneBook.put("Иванов Григорий", new ArrayList<String>(Arrays.asList("55-66-77", "55-67-88")));
        System.out.println("Иванов Григорий: " + phoneBook.get("Иванов Григорий"));
    }
}

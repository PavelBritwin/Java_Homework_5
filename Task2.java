package Java_homework_5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();
        employee.put("Иванов", "Иван");
        employee.put("Петрова", "Светлана");
        employee.put("Белова", "Кристина");
        employee.put("Мусина", "Анна");
        employee.put("Крутова", "Анна");
        employee.put("Юрин", "Иван");
        employee.put("Лыков", "Петр");
        employee.put("Чернов", "Павел");
        employee.put("Чернышов", "Петр");
        employee.put("Федорова", "Мария");
        employee.put("Светлова", "Марина");
        employee.put("Савина", "Мария");
        employee.put("Рыкова", "Мария");
        employee.put("Лугова", "Марина");
        employee.put("Владимирова", "Анна");
        employee.put("Мечников", "Иван");
        employee.put("Петин", "Петр");
        employee.put("Ежов", "Иван");
        System.out.println(employee);
        Map<String, Integer> names = new HashMap<>();
        for (var item : employee.entrySet())
        {
            if (names.containsKey(item.getValue()))
            {
                names.replace(item.getValue(), names.get(item.getValue()) + 1);
            }
            else
                names.put(item.getValue(), 1);
        }
        names.entrySet().
        stream().
        sorted(Map.Entry.<String, Integer>comparingByValue().
        reversed()).
        filter(x -> x.getValue() != 1).
        forEach(System.out::println);
    }
}

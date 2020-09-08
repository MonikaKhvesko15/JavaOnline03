package by.epam.student.khvesko.module3.part2;

import java.util.Arrays;
import java.util.Comparator;

//. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static void main(String[] args) {
        String s = "apple watermelon melon peach";
        Arrays.stream(s.replaceAll("\\pP", " ").split("\\s+")).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).forEach(m -> System.out.println(m));
    }
}

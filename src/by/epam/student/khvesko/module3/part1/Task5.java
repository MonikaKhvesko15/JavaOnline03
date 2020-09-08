package by.epam.student.khvesko.module3.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на
// одиночные пробелы. Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args) {
        String test = "aaa   bbb  ccc d e";
        System.out.println(test.replaceAll("[\\s+]{2,}", " "));
    }
}

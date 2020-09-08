package by.epam.student.khvesko.module3.part2;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String test = "a b  c    d       e  f";
        System.out.println(maxNumbOfSpace(test));
    }

    public static int maxNumbOfSpace(String test) {
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher(test);
        int max = 0;

        while (m.find()) {
            String test1 = m.group();
            if (test1.length() > max) {
                max = test1.length();
                test1 = null;
            }
        }
        return max;
    }
}

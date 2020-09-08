package by.epam.student.khvesko.module3.part1;

//4. В строке найти количество чисел.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String start = "12 + 24 = 36";
        int count = 0;

        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(start);

        while (m.find()) {
            count++;
        }

        System.out.println(count);
    }
}

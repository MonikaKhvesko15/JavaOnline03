package by.epam.student.khvesko.module3.part2;

import java.util.regex.Pattern;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static void main(String[] args) {
        String test = "Every man has his price";
        System.out.println(countA(test));
    }

    public static int countA(String s) {
        int count = -1;
        for (String s1 : s.split("a")
        ) {
            count++;
        }
        return count;
    }
}

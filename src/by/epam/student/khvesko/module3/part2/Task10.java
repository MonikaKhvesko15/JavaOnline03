package by.epam.student.khvesko.module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
// или вопросительным знаком. Определить количество предложений в строке X
public class Task10 {
    public static void main(String[] args) {
        String x = "Hi! How are you? My name is Monika.";
        int count = 0;
        String regex = "[\\.|\\?|\\!]";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(x);

        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}

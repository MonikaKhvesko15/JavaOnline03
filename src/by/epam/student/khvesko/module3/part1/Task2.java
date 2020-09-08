package by.epam.student.khvesko.module3.part1;

//2. Замените в строке все вхождения 'word' на 'letter'.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static final String TEXT= "A word processor is software or a device that allows users to create, edit, and print documents.  Of all computer applications, word processing is the most common.";

    public static void main(String[] args) {
        System.out.println(TEXT.replaceAll("[Ww]ord","letter"));
    }
}

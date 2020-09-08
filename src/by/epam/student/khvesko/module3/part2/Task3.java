package by.epam.student.khvesko.module3.part2;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Dad";

        System.out.println(checkWord(s1));
        System.out.println(checkWord(s2));
    }

    public static boolean checkWord(String s) {
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        boolean a = s.equalsIgnoreCase(s1.toString());

        return a;
    }
}

package by.epam.student.khvesko.module3.part2;

//. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args) {
        String s1 = "Monika";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.substring(i, i + 1) + s1.substring(i, i + 1);
            System.out.println(s2);
        }

    }
}

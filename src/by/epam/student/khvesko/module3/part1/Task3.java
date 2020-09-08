package by.epam.student.khvesko.module3.part1;

//3. В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args) {

        String s = "Test: 12 43 56 676 78";
        System.out.println(countOfNumb(s));
    }

    public static int countOfNumb(String s) {
        int count = 0;
        char[] mass = s.toCharArray();

        for (int i = 0; i < mass.length; i++) {
            if (Character.isDigit(mass[i])) {
                count++;
            }
        }

        return count;
    }
}

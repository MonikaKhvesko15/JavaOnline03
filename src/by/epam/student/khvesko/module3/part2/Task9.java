package by.epam.student.khvesko.module3.part2;

//. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы
public class Task9 {
    public static void main(String[] args) {
        String s = "AabCDef";
        int upperCase = 0;
        int lowerCase = 0;

        for (int k = 0; k < s.length(); k++) {
            if (Character.isUpperCase(s.charAt(k))) upperCase++;
            if (Character.isLowerCase(s.charAt(k))) lowerCase++;
        }
        System.out.printf("Upper case: %d \nLower case: %d", upperCase, lowerCase);
    }
}

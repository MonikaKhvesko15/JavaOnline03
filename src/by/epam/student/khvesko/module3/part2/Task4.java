package by.epam.student.khvesko.module3.part2;

//С помощью функции копирования и операции
// конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {
    public static void main(String[] args) {
        String s = "информатика";
        System.out.println(newWord(s));
    }

    public static String newWord(String s) {
        char[] arr = new char[4];
        arr[0] = s.charAt(7);
        arr[1] = s.charAt(3);
        arr[2] = s.charAt(4);
        arr[3] = s.charAt(7);

        String s1 = String.copyValueOf(arr);

        return s1;
    }
}

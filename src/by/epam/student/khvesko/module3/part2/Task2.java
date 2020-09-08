package by.epam.student.khvesko.module3.part2;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        String test = "Mather father granny dad";
        System.out.println(addA(test));
    }

    public static String addA(String test) {
        String test1 = test.replace("a", "ab");
        return test1;
    }
}

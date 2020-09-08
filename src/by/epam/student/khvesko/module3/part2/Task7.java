package by.epam.student.khvesko.module3.part2;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    public static void main(String[] args) {
        String s = "abc cde def";
        //удаление пробелов
        s = s.replaceAll("\\s", "");

        String result = new StringBuilder(s).reverse().toString();

        //удаление повт символов
        result = result.replaceAll("(.)(?=.*\\1)", "");

        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
}

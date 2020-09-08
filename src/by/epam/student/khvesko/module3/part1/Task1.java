package by.epam.student.khvesko.module3.part1;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args) {
        String start = "CAMEL_CASE";
        StringBuffer sb = new StringBuffer();
        for (String s : start.split("_")) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            if (s.length() > 1) {
                sb.append(s.substring(1, s.length()).toLowerCase());
            }
        }
        System.out.println(sb);
    }
}

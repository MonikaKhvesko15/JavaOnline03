package by.epam.student.khvesko.module3.part3.task2;

//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
// и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми
// парсерами XML для решения данной задачи нельзя.

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        String fileString = new String(Files.readAllBytes(Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaOnline03\\src\\by\\epam\\student\\khvesko\\module3\\part3\\task2\\Students.xml")));
        Pattern regex = Pattern.compile("<notes>(.*?)</notes>", Pattern.DOTALL);
        Matcher matcher = regex.matcher(fileString);
        Pattern regex2 = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
        if (matcher.find()) {
            String DataElements = matcher.group(1);
            Matcher matcher2 = regex2.matcher(DataElements);
            while (matcher2.find()) {
                System.out.println(matcher2.group(1) + "    " + matcher2.group(2));
            }
        }
    }

}

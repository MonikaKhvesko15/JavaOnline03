package by.epam.student.khvesko.module3.part3.task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
 три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
 слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного
 символа, а в случае равенства – по алфавиту.*/

public class Main {
    public static void main(String[] args) {
        String str = "\tДан текст строка. Найдите наибольшее количество подряд идущих пробелов в нем. В строке вставить после каждого символа 'a' символ 'b'.\r\n" ;

/*        String str = "\tДан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем. В строке вставить после каждого символа 'a' символ 'b'.\r\n" +
                "\tПроверить, является ли заданное слово палиндромом.С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.\r\n" +
                "\tПодсчитать, сколько раз среди символов заданной строки встречается буква “а”.Из заданной строки получить новую, повторив каждый символ дважды. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено \"abc cde def\", то должно быть выведено \"abcdef\".\r\n";
*/
        // task1_sortParagraphs(str);
        //task2_sordWords(str);
        task3_sordWords(str);

    }

    static int calculateSybolsInWord(String str, char ch){
        int counter=0;
        for(int i=0; i<str.length(); i++) {
            if (ch == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
    static void task3_sordWords(String str) {
        //Parse paragraphs
        Pattern pattern = Pattern.compile("\\r\\n|\\n\\r");
        String[] paragraphs = pattern.split(str);
        for (String paragraph : paragraphs) {
            //Parse sentences
            Pattern pattern_sentences = Pattern.compile("[.!?]");
            String[] sentences = pattern_sentences.split(paragraph);

            for (String sentence : sentences) {
                //Parse words
                Pattern pattern_words = Pattern.compile("\\s|[.;,-]");
                String[] words = pattern_words.split(sentence);

                int[][] words_array = new int[words.length][2];
                int index = 0;
                for (String word : words) {
                    words_array[index][0] = index;
                    words_array[index][1] =calculateSybolsInWord(word, 'а');
                    index++;
                }

                //Sort
                int temp_index = 0;
                int temp_count = 0;
                for (int i = 0; i < words_array.length; i++) {
                    for (int j = i; j < words_array.length; j++) {
                        if (words_array[i][1]==words_array[j][1]){
                            if (words[i].compareToIgnoreCase(words[j]) > 0) {
                                temp_count = words_array[i][1];
                                temp_index = words_array[i][0];

                                words_array[i][0] = words_array[j][0];
                                words_array[i][1] = words_array[j][1];

                                words_array[j][0] = temp_index;
                                words_array[j][1] = temp_count;
                            }
                        }
                        if (words_array[i][1] < words_array[j][1]) {
                            temp_count = words_array[i][1];
                            temp_index = words_array[i][0];

                            words_array[i][0] = words_array[j][0];
                            words_array[i][1] = words_array[j][1];

                            words_array[j][0] = temp_index;
                            words_array[j][1] = temp_count;
                        }
                    }
                }
//Print sorted sentence
                System.out.println("-------------------------------------------");
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[words_array[i][0]]);
                }

            }
        }
    }


    static void task2_sordWords(String str) {
        //Parse paragraphs
        Pattern pattern = Pattern.compile("\\r\\n|\\n\\r");
        String[] paragraphs = pattern.split(str);
        for (String paragraph : paragraphs) {
            //Parse sentences
            Pattern pattern_sentences = Pattern.compile("[.!?]");
            String[] sentences = pattern_sentences.split(paragraph);

            for (String sentence : sentences) {
                //Parse words
                Pattern pattern_words = Pattern.compile("\\s|[.;,-]");
                String[] words = pattern_words.split(sentence);

                int[][] words_array = new int[words.length][2];
                int index = 0;
                for (String word : words) {
                    words_array[index][0] = index;
                    words_array[index][1] = word.length();
                    index++;
                }

                //Sort
                int temp_index = 0;
                int temp_count = 0;
                for (int i = 0; i < words_array.length; i++) {
                    for (int j = i; j < words_array.length; j++) {
                        if (words_array[i][1] > words_array[j][1]) {
                            temp_count = words_array[i][1];
                            temp_index = words_array[i][0];

                            words_array[i][0] = words_array[j][0];
                            words_array[i][1] = words_array[j][1];

                            words_array[j][0] = temp_index;
                            words_array[j][1] = temp_count;
                        }
                    }
                }

                //Print sorted sentence
                System.out.println("-------------------------------------------");
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[words_array[i][0]]);
                }

            }
        }
    }


    static void task1_sortParagraphs(String str) {
        //Parce
        Pattern pattern = Pattern.compile("\\r\\n|\\n\\r");//(?<=(rn|r|n))([ \t]*$)+");
        //\\s\n+");
        String[] strings = pattern.split(str);

        int[][] sentences = new int[strings.length][2];

        int index = 0;
        for (String s : strings) {
            sentences[index][0] = index;
            sentences[index][1] = calculateSentencesInParagraph(s);
            index++;
        }


        //print before sorting
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(strings[sentences[i][0]]);
        }

        //Sort
        int temp_index = 0;
        int temp_count = 0;
        for (int i = 0; i < sentences.length; i++) {
            for (int j = i; j < sentences.length; j++) {
                if (sentences[i][1] > sentences[j][1]) {
                    temp_count = sentences[i][1];
                    temp_index = sentences[i][0];

                    sentences[i][0] = sentences[j][0];
                    sentences[i][1] = sentences[j][1];

                    sentences[j][0] = temp_index;
                    sentences[j][1] = temp_count;
                }
            }
        }

        //Print
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(strings[sentences[i][0]]);
        }
    }


    static int calculateSentencesInParagraph(String str) {
        Matcher matcher = Pattern.compile("[.\n]").matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    static void parseWordsInSentence(String str) {
        Pattern pattern = Pattern.compile("\\s|[.;,-]");
        String[] strings = pattern.split(str);
        for (String s : strings) {
            System.out.println(s);
        }

    }
    static int calculateWordsNumberInParagraph(String str) {

        Matcher matcher = Pattern.compile("([^.!?]+)").matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        return 0;
    }

}

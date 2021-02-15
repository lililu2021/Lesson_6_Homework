package com.itschool;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Example_1(); // как составить слово?
//        Example_2(); // єс!
//        Example_3(); // проверка на палиндромность - ?
//        Example_4(); // ?
//        Example_5();
        Example_6();
//        Example_7(); // єс!
//        Example_8();
//        Example_9();
//        Example_10();
//        Example_11();
    }

    private static void Example_1() {
/*      Вводится строка, состоящая из букв и пробелов. Составить из входящих в нее букв несколько любых их
    сочетаний (слов) любой длины. Каждую букву строки можно использовать неограниченное количество раз.*/

        String s = "Вводится строка, состоящая из букв и пробелов.";
        String w = "";
        Random random = new Random();
        //      char ls = s.charAt();
        int ls = s.length();
        int lw = w.length();
        String let = s.substring(0, lw);
        lw = 2 + random.nextInt(5);
        System.out.println(s);
        System.out.println("Длина строки = " + ls + " символов.");
        System.out.println("Длинна составляемого слова = " + lw + " символов.");
        for (int i = 0; i < 5; i++) {
            for (char j = 0; j < lw; j++) {
                if (let != " ") {
                    w = let + "";
                }
            }
        }
        System.out.println(w);
    }

    private static void Example_2() {
/*      Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской
    буквы в любом регистре или знака подчеркивания и не содержит других символов, кроме букв английского
    алфавита (в любом регистре), цифр и знака подчеркивания.*/

        final String LETTERS = "QAZXSWEDCVFRTGBNHYUJMKIOLPqazwsxedcrfvtgbyhnujmikolp_";
        String Word = "Monday";
        for (int i = 0; i < Word.length(); i++) {
            if (!LETTERS.contains("" + Word.charAt(0))) {
                System.out.println("Слово " + Word + " не являеться идентификатором");
                return;
            } else if (!LETTERS.contains("" + Word.charAt(i))) {
                System.out.println("Слово " + Word + " не являеться идентификатором");
                return;
            }
        }
        System.out.println("Слово " + Word + " являеться идентификатором");
        return;
    }

    private static void Example_3() {
/* Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом
    (перевертышем), т.е. одинаково пишется как с начала, так и с конца.*/

        String str = "  Вводится  строка. Удалить  из нее    все пробелы.   ";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
//        int l = str.length();
//        for (int i = 0; i < str.length(); i++) {
//            int j = l - 1 + i;
//            System.out.println(str.equals. (str));
//        }
    }
//        StringBuffer strReverse = new StringBuffer(str).reverse();
//        if (strReverse ==){

    private static void Example_4() {
/*      Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую
    подстроку вводит пользователь.*/

        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.nextLine();
        String str_2 = scanner.nextLine();
        String str_2_zamena = scanner.nextLine();
        str_1 = str_1.strip();
        str_2 = str_2.strip();
        str_2_zamena = str_2_zamena.strip();
        int lengthStr_1 = str_1.length();
        int lengthStr_2 = str_2.length();
        System.out.println("Длинна первой строки = " + lengthStr_1 + " символов");
        System.out.println("Длинна подстроки = " + lengthStr_2 + " символов");
        for (int i = 0; i < lengthStr_1; i++) {
            for (int j = 0; j < lengthStr_2; j++) {
                if (str_1.contains(str_2)) {
                    int firstNumber = str_1.indexOf(str_2);
                    System.out.println(firstNumber);
                    return;
//                    return str_1.str_2(firstNumber, (firstNumber ++lengthStr_2)) + str_1.substring(lengthStr_1 + 1);
                }
            }
        }
        System.out.println(str_1);
    }





    private static void Example_5() {
/*      Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все
    числа, которые встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана
    строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0.*/
    }

    private static void Example_6() {
/*      Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если
    было введено "abc cde def", то должно быть выведено "abcdef".*/

        String str = "  Вводится строка.  Требуется   удалить из нее   повторяющиеся символы и все пробелы.    ";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains(" ")) {
            str = str.replace(" ", "");
        }
        System.out.println(str);
        // повторяющиеся буквы тоже удалить?

    }

    private static void Example_7() {
/*  Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более
    одного пробела. Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между
    словами оставить только один пробел.*/

        String str = "  Вводится ненормированная    строка, у которой   могут быть  пробелы в начале, в   конце и между словами более\n" +
                "    одного пробела.  Привести     ее к    нормированному  виду.    ";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
    }

    private static void Example_8() {
/*      Вводятся строки. Определить самую длинную строку и вывести ее номер на экран. Если самых длинных строк
    несколько, то вывести номера всех таких строк.*/
    }

    private static void Example_9() {
/*      Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай,
    когда самых длинных слов может быть несколько, не обрабатывать.*/
    }

    private static void Example_10() {
/*      Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    Учитывать только английские буквы.*/
    }

    private static void Example_11() {
/*      Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в
    ней.*/
    }
}

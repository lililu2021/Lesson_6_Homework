package com.itschool;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Example_1(); // как составить слово?
//        Example_2(); // єс!
//        Example_3(); // єс!
//        Example_4(); // єс!
//        Example_5(); // 50/50
//        Example_6(); // ?
//        Example_7(); // єс!
//        Example_8(); // єс!
//        Example_9(); // єс!
//        Example_10(); // єс!
//        Example_11(); // єс!
    }

    private static void Example_1() {
/*      Вводится строка, состоящая из букв и пробелов. Составить из входящих в нее букв несколько любых их
    сочетаний (слов) любой длины. Каждую букву строки можно использовать неограниченное количество раз.*/

        String str = "Вводится строка, состоящая из букв и пробелов.";
        String symbols = "][';/., `1234567890-=*-+";
        String w = "";
        int ls = str.length();
        int lw = w.length();
        System.out.println(str);
        System.out.println("Длина строки = " + ls);
        System.out.println("Длинна составляемого слова = " + lw);
        char[] result = str.toCharArray();
        Random random = new Random();
        for (int i = 0; i < ls; i++) {
            if (!(symbols.contains(str))){
                w = w + str.charAt(i);
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

        String str = "   a  cd  d   ca   ";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains(" ")) {
            str = str.replace(" ", "");
        }
        System.out.println(str);
        Boolean strIsReverse = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i) == (str.charAt(str.length() - 1 - i)))) {
                strIsReverse = false;
            }
        }
        System.out.println(strIsReverse ? "Palindrome" : "Not palindrome");
    }


    private static void Example_4() {
/*      Найти в строке указанную подстроку и заменить ее на новую.
        Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/

        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.nextLine();
        String str_2 = scanner.nextLine();
        String str_2_zamena = scanner.nextLine();
        str_1 = str_1.strip();
        str_2 = str_2.strip();
        str_2_zamena = str_2_zamena.strip();
//        str_1 = str_1.replace(str_2, str_2_zamena);
        int indexStr_2 = str_1.indexOf(str_2, 0);
        str_1 = str_1.substring(0, indexStr_2) + str_2_zamena + str_1.substring(str_2.length() + indexStr_2);

        System.out.println(str_1);
    }

    private static void Example_5() {
/*      Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все
    числа, которые встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана
    строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0.*/

        String str = "data 48 call 9 read13 blank0a";
//        int numbers[] = new int[10];
        String numbers = " ";
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (Character.isDigit(symbol)) {
                numbers = numbers + symbol;
//                numbers [10] = numbers[10] + symbol;
            }
        }
        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
    } // в массив запихнуть числа не получается - выводит просто пустой массив. Со строкой работает.

    private static void Example_6() {
/*      Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если
    было введено "abc cde def", то должно быть выведено "abcdef".*/

        String str = "  Вводится строка.  Требуется   удалить из нее   повторяющиеся символы и все пробелы.    ";
        String newStr = "";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains(" ")) {
            str = str.replace(" ", "");
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if ((str.charAt(i) == str.charAt(j))) {
                    newStr += str.charAt(j);
                    break;
                }
            }
        }
        System.out.println(newStr);
    } // шо не так???

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

        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.nextLine();
        String str_2 = scanner.nextLine();
        String str_3 = scanner.nextLine();
        if (str_1.length() > str_2.length() && str_1.length() > str_3.length()) {
            System.out.println("str_1");
        } else if (str_2.length() > str_1.length() && str_2.length() > str_3.length()) {
            System.out.println("str_2");
        } else if (str_3.length() > str_1.length() && str_3.length() > str_2.length()) {
            System.out.println("str_3");
        }
    }

    private static void Example_9() {
/*      Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай,
    когда самых длинных слов может быть несколько, не обрабатывать.*/

        String str = "Вводится ненормированная строка, у которой могут быть пробелы в начале";
        String[] str_2 = str.split(" ");
        System.out.println(Arrays.toString(str_2));
        String word = " ";
        for (int i = 0; i < str_2.length; i++) {
            if (str_2[i].length() > word.length()) {
                word = str_2[i];
            }
        }
        System.out.println(word + " " + word.length());
    }

    private static void Example_10() {
/*      Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    Учитывать только английские буквы.*/

        String str = "   London is   The Capital   Of Great Britain. ";
        String bigLetters = "QAZWSXEDCRFVTGBYHNUJMIKOLP";
        String littleLetters = "qazwsxedcrfvtgbyhnujmikolp";
        String big = "";
        String little = "";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (bigLetters.contains("" + str.charAt(i))) {
                big = big + str.charAt(i);
            } else if (littleLetters.contains("" + str.charAt(i))) {
                little = little + str.charAt(i);
            }
        }
        System.out.println("Количество больших букв = " + big.length());
        System.out.println("Количество маленьких букв = " + little.length());
    }

    private static void Example_11() {
/*      Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в
    ней.*/

        String str = " Посчитать   количество строчных (маленьких) и   прописных (больших) букв в   введенной строке.  ";
        System.out.println(str);
        str = str.strip();
        System.out.println(str);
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
        String[] str_2 = str.split(" ");
        System.out.println(Arrays.toString(str_2));
        System.out.println("Количество слов в строке = " + str_2.length);
    }
}

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(ameba(6));
        System.out.println(summ(5, 3));
        whichNumber(-27);
        whichNumber(0);
        mass();
        mass12();
        mass20();
        massReady();
        difference();
        triangle();
        matrix();

    }

    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static int ameba(int hours) {
        int num = hours / 3;
        return (int) (Math.pow(2, num));
    }

    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int summ = 0;
        for (int i = 0; i < b; i++) {
            summ = summ + a;
        }
        return summ;
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void triangle() {
        String[][] mass = new String[4][4];
        for (int i = 0; i < mass.length; i++) {
            for (int q = 0; q < mass.length; q++) {
                mass[i][q] = "*";
            }
        }
        System.out.println("a)");
        int bordera = mass.length - 1;
        for (int i = 0; i < mass.length; i++) {
            for (int q = 0; q < mass.length; q++) {
                if (bordera <= q) {
                    System.out.print(mass[i][q]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            bordera--;
        }
        System.out.println("b)");
        int borderb = 1;
        for (int i = 0; i < mass.length; i++) {
            for (int q = 0; q < mass.length; q++) {
                if (borderb > q) {
                    System.out.print(mass[i][q]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            borderb++;
        }
        System.out.println("c)");
        int borderc = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int q = 0; q < mass.length; q++) {
                if (borderc <= q) {
                    System.out.print(mass[i][q]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            borderc++;
        }
        System.out.println("d)");
        int borderd = mass.length - 1;
        for (int i = 0; i < mass.length; i++) {
            for (int q = 0; q < mass.length; q++) {
                if (borderd >= q) {
                    System.out.print(mass[i][q]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            borderd--;
        }


    }

    //        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void whichNumber(int num) {
        String sign = null;
        String digit = String.valueOf(num);
        String[] digits = digit.split("");
        int length = digits.length;
        if (num > 0) {
            sign = " - это положительное число";
        } else if (num < 0) {
            sign = " - это отрицательное число";
            length--;
        } else {
            sign = " - это ноль";
        }
        System.out.println(num + sign + ", количество цифр = " + length);
    }

    //        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void mass() {
        int[] numbers = new int[50];
        int counter = 0;
        for (int i = 1; i < 100; i += 2) {
            numbers[counter] = i;
            System.out.print(numbers[counter] + " ");
            counter++;
        }
        System.out.println("");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");

    }


    //        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void mass12() {
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            Random random = new Random();
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");
        }
        int index = 0;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + index);

    }

    //        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void mass20() {
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            Random random = new Random();
            mass[i] = random.nextInt(20);
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < mass.length; i += 2) {
            mass[i] = 0;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
    }

    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void massReady() {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }
        }
        int element0 = mass[0];
        mass[0] = mass[maxIndex];
        mass[maxIndex] = element0;

        System.out.println(mass[0] + " " + mass[maxIndex]);
    }


    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void difference() {
        int[] mass = {0, 3, 46, 3, 2, 1, 2};
        int counter = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    if (counter == 0) {
                        System.out.print("Массив имеет повторяющиеся элементы ");
                        counter++;
                    }
                    System.out.print(mass[j] + " ");
                }
            }
        }
        if (counter == 0) {
            System.out.println("Массив не имеет повторяющихся элементов");
        }
        System.out.println("");
    }

//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void matrix() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int q = 0; q < matrix.length; q++) {
                Random random = new Random();
                matrix[i][q] = random.nextInt(50);
                System.out.print(matrix[i][q] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        int[][] matrix2 = new int[size][size];
        for (int i = 0; i < matrix2.length; i++) {
            for (int q = 0; q < matrix2.length; q++) {
                matrix2[i][q] = matrix[q][i];
                System.out.print(matrix2[i][q] + " ");
            }
            System.out.println();
        }
    }
}

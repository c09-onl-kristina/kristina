package by.teachmeskills;

import lombok.AllArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void task1() {
        System.out.println("task1");
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        List<Integer> numbersX2 = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(numbersX2);
    }

    public static void task2() {
        System.out.println("task2");
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(100));
        }
        System.out.println(set);
        System.out.println(set.stream().filter(x -> x % 2 == 0).count());

    }

    public static void task3() {
        System.out.println("task3");
        List<String> names = List.of("john", "arya", "sansa");
        System.out.println(names.stream().map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.toList()));
    }

}

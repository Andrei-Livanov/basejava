package ru.javawebinar.basejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MainStreams {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 2, 2, 8, 3, 9, 9, 5};
        System.out.println(minValue(numbers));
        System.out.println(oddOrEven(Arrays.stream(numbers).boxed().collect(Collectors.toList())));

        List<Integer> list = Arrays.asList(2, 8, 3, 3, 9, 4, 5);
        System.out.println("\n" + oddOrEven(list));
    }

    private static int minValue(int[] values) {
        return stream(values)
                .distinct()
                .sorted()
                .reduce((left, right) -> left * 10 + right).orElse(0);
    }

    private static List<Integer> oddOrEven(List<Integer> integers) {
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        return integers
                .stream()
                .filter(val -> sum % 2 != val % 2)
                .collect(Collectors.toList());
    }
}

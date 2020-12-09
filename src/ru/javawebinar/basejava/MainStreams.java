package ru.javawebinar.basejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MainStreams {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 2, 2, 8, 3, 9, 9, 5};
        System.out.println(minValue(numbers));

        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(8);
        array.add(3);
        array.add(3);
        array.add(9);
        System.out.println(oddOrEven(array));
    }


    private static int minValue(int[] values) {
        return stream(values)
                .distinct()
                .sorted()
                .reduce((left, right) -> left * 10 + right).orElse(0);
    }

    private static List<Integer> oddOrEven(List<Integer> integers) {
        int sum = 0;
        for (int number : integers) {
            sum += number;
        }
        int finalSum = sum;

        return integers
                .stream()
                .filter(val -> finalSum % 2 != val % 2)
                .collect(Collectors.toList());
    }
}

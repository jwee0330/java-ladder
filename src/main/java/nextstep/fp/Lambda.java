package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        numbers.forEach(System.out::println);
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(() -> System.out.println("Hello from thread")).start();
    }

    public static int sumAll(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumAllEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(Lambda::isEvenNumber)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return numbers.stream()
                .filter(Lambda::isOverThree)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static boolean isOverThree(int number) {
        return number > 3;
    }
}

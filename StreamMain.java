package numbers;

import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intStream.filter(x -> x > 0 && x % 2 == 0)
                .sorted()
                .forEach(System.out::println);
    }
}

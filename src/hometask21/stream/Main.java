package hometask21.stream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> digits = Stream.of(3,4,2,5,1);
        digits.skip(1).limit(3).forEach(s -> System.out.println(s*2));
    }
}

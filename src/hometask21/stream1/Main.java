package hometask21.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num_row = new ArrayList<>();
        num_row.addAll(Arrays.asList(11,20,33,45,52));

        Optional<Integer> res = num_row.stream().filter(x -> x % 4 == 0).map(x -> x * 2).reduce((x,y) -> x + y);
        System.out.println(num_row + ": " + res.get());
    }
}

package hometask20.simpledig;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isSimple = dig -> {
            if (dig <= 1 ){
                return false;
            }
            for(int i = 2; i <= dig / 2; i++) {
                if(dig % i == 0) {
                    return false;
                }
            }
            return true;

        };
        int num  = 4;
        int num1  = 17;
        System.out.println(num + " является простым числом: " + isSimple.test(num));
        System.out.println(num1 + " является простым числом: " + isSimple.test(num1));

    }
}

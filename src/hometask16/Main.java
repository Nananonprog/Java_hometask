package hometask16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String s = "my-p@ssw0rd";
        String pattern = "^[\\w-@]{6,18}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.println(matcher.find());


    }
}

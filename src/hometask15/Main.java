package hometask15;

public class Main {
    public static void main(String[] args) {
        String input = "Java";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            if (input.charAt(i) == 'a') {
                output.append('!');
            }
        }
        System.out.println("Исходная строка - " + input + "\nИзмененная строка - " + output.toString());
    }
}
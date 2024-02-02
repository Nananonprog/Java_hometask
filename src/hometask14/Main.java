package hometask14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите два слова через пробел: ");
        String stroka = input.nextLine();
        String [] new_str = stroka.split(" ");

        if(new_str.length == 2){
            String newString = new_str[1] + " " + new_str[0];
            System.out.println(newString);
        }else{
            System.out.println("Вы ввели больше 2 слов");
        }

        System.out.print("Введите строку: ");
        String slovo = input.nextLine();

        int firstInd = slovo.indexOf('о');
        int lastInd = slovo.lastIndexOf('о');

        if (firstInd != - 1 && lastInd != -1){
            String res = slovo.substring(0, firstInd + 1) + slovo.substring(firstInd  + 1, lastInd).replace('о','О') + slovo.substring(lastInd);
            System.out.println(res);
        }else{
            System.out.println("В строке нет буквы \"о\" ");
        }

    }
}

package hometask6;

public class Main {
    public static void main(String[] args) {

        int rows = 5;
        int i = 1;
        while( i <= rows)
        {
           int j = 1 ;
            while( j <= i )
            {
                if(i == 1 || i == rows || j == 1 || j == i)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++ ;
        }
    }
}
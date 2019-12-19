package Test;

import java.util.Scanner;

public class Sample {

    public long doInvert(long number){
        long invert = 0;
        while(number != 0){
            invert = (invert * 10) + (number % 10);
            number = number / 10;
        }
        return invert;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    }
}

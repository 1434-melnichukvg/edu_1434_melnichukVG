/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
        double b =(double)a/100;
        double c =b*115;
        System.out.println (c);

    }
}

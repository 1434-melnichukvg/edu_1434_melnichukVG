/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a/100;
        int c = 15;
        int d = b*(100+c);
                System.out.println(d);
    }
}
/*
какбэ не очень понял, как это можно решить при
 помощи только целых чисел, но если вводить кратное 100, то все получается :-)
 возможно нужно дальше лекции послушать */

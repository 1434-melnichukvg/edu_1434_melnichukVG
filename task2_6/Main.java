/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите
'Делится с остатком' и остаток от деления.
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числитель: " );
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println("Введите знаменатель: ");
        int b = scan.nextInt();
        System.out.println(b);
        int c = a % b;
        System.out.println(c);
        if (c == 0) {
            System.out.println("Делится без остатка");
        } else {
            System.out.println("Остаток :" + c);
        }
    }
}

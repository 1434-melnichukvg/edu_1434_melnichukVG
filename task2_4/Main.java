/*
Задание: Пользователь вводит сумму вклада и процент,
который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        int a = scanner.nextInt();
        System.out.print("Сумма вклада: " + a + " рублей.");
        System.out.println(" ");
        System.out.print("Введите процент вклада: ");
        int b = scanner.nextInt();
        System.out.println("Процент вклада: " + b + " "+'%');
        System.out.print("введите кол-во лет вклада: ");
        int d = scanner.nextInt();
        System.out.println("Кол-во лет вклада: " + d );
        double c = a/100*(b*d)+a;
        System.out.println("Сумма в конце срока: " + c) ;
        
    }
}
/* это решение верно для вклада с процентами без т.н., "капитализации". */

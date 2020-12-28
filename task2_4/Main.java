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
        int sum = scanner.nextInt();
        System.out.print("Сумма вклада: " + sum + " рублей.\n");
        System.out.print("Введите процент вклада: ");
        float persent = scanner.nextFloat()/100;
        System.out.println("Процент вклада: " + persent*100 + " "+'%');
        System.out.print("введите кол-во лет вклада: ");
        int term = scanner.nextInt();
        System.out.println("Кол-во лет вклада: " + term );
        double sumFinal = (sum*persent)*term + sum;
        System.out.println("Сумма в конце срока: " + sumFinal) ;

    }
}
/* это решение верно для вклада с процентами без т.н., "капитализации". */

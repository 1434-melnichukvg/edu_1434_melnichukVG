        /*Программа запрашивает у пользователя значение
        в градусах Цельсия. Программа должена переводить
         температуру и выводить на экран
        значение в градусах Фаренгейта.
        Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
        TF = (9 / 5) * TC + 32
        Пример:
        на вход подается значение 41.
        Пример вывода:
        105.8 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
        double q =(double)9 / 5;
        System.out.println (a*q+32);

    }
}

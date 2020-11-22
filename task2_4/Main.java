import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String deposit = "Введите сумму вклада: ";
        System.out.print (deposit);
        int a = scanner.nextInt();
        System.out.print("Сумма вклада: "+a);
        System.out.println(" ");
        String procent = "Введите процент вклада: ";
        System.out.print(procent);
        int b =scanner.nextInt();
        System.out.print("Процент вклада: "+b);
        System.out.println(" ");
        double c =(double)a/100*(100+b);
        String sum = "Сумма в конце года с процентами: ";
        System.out.println(sum+c);
        double d =(double)c/100*(100+b);
        String sum2 = "Сумма в конце 2-го года с процентами: ";
        System.out.println(sum2+d);
        double e =(double)d/100*(100+b);
        String sum3 = "Сумма в конце 3-го года с процентами: ";
        System.out.println(sum3+e);
        double f =(double)e/100*(100+b);
        String sum4 = "Сумма в конце 4-го года с процентами: ";
        System.out.println(sum4+f);
        double k =(double)f/100*(100+b);
        String sum5 = "Сумма в конце 5-го года с процентами: ";
        System.out.println(sum5+k);
    }
}
//Снаачала разместил код в 2_5 ошибочно. Переразместил в 2_4. Но все равно так и не понял, как сюда присобачить цикл, хотя он очевидно сюда просится.

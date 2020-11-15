/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String a ="Мама";
        String b = "Мыла";
        String c = "Раму";
        String d = " ";
        System.out.println(a+d+b+d+c);
        System.out.println(a+d+c+d+b);
        System.out.println(c+d+a+d+b);
        System.out.println(c+d+b+d+a);
        System.out.println(b+d+a+d+c);
        System.out.println(b+d+c+d+a);
    }
}

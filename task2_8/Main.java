/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
public class Main {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5};
        int mult = 1;
        for (int i = 0; i < 4; i++) {
            mult *= nums [i];
            System.out.println(mult);

        }
    }
}

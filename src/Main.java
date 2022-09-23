public class Main {
    public static void main(String[] args) {

        /*ДОМАШНЕЕ ЗАДАНИЕ №1*/
        /*ПЕРВОЕ ЗАДАНИЕ*/

        int salary = 100000;
        int sum = 0;
        int j = 0;

        for (int i = 0;  sum < 2_459_000; i++) {
            sum += 100_000;
            j = i;
        }
        System.out.println(j + 1);
        System.out.println();
        System.out.println();


        /*ВТОРОЕ ДОМАШНЕ ЗАДАНИЕ*/

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        while (i > 1) {
            System.out.print((i - 1) + " ");
            i--;
        }
        System.out.println();
        System.out.println();


        /*ТРЕТЬЕ ЗАДАНИЕ*/

        int yPeople = 12000000;
        i = 1;

        while (i <= 10) {
            int birth = yPeople / 1000 * 17;
            yPeople = yPeople + birth;
            i++;
        }
        System.out.println(yPeople);
        System.out.println();
        System.out.println();






        /*ДОМАШНЕЕ ЗАДАНИЕ №2*/
        /*ПЕРВОЕ ЗАДАНИЕ*/
    }
}
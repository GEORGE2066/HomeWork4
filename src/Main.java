import java.sql.SQLOutput;
import java.time.Year;

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

        int vasiliyDepoz = 15000;
        i = 0;

        while (vasiliyDepoz <= 12000000) {
            vasiliyDepoz = (int) (vasiliyDepoz + (vasiliyDepoz * 0.07));
            i++;
        }
        System.out.println(i);//наверное так
        System.out.println();


        /*ВТОРОЕ ЗАДАНИЕ*/

        vasiliyDepoz = 15000;
        i = 0;

        while (vasiliyDepoz < 12_000_000) {
            vasiliyDepoz = (int) (vasiliyDepoz + (vasiliyDepoz * 0.07));
            i++;
            if (i % 6 == 0) {
                System.out.println(i + " " + vasiliyDepoz);
            }
        }
        System.out.println();


        /*ТРЕТЬЕ ЗАДАНИЕ*/

        long vd = 15_000l;
        i = 0;
        j = 0;

        while (i <= (9 * 12)) {
            vd = (long) (vd + (vd * 0.07));
            i++;
            if (i % 6 == 0) {
                System.out.println(i + " " + vd);
            }
        }
        System.out.println();



        /*ЧЕТВЁРТОЕ ЗАДАНИЕ*/

        int firstFryday = 4;
        i = 0;

        while (i <= 31) {
            if ((i - firstFryday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
            i++;
        }
        System.out.println();



        /*ДОМАШНЕЕ ЗАДАНИЕ №3*/
        /*ПЕРВОЕ ЗАДАНИЕ*/

        int year = 2022;
        i = year - 200;
        int a = i + 79;
        while (a % 79 != 0) {
            a = a - 1;
        }
        while (a < 2022) {
            a += 79;
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println();


        /*ВТОРОЕ ЗАДАНИЕ*/

        i = 1;

        while (i <= 10) {
            System.out.println("2 * " + i + " = " + (2 * i));
            i++;
        }
    }
}
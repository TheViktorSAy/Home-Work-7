public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");

        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 2_459_000; i++) {
            total = total + salary;
            if (i < total) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
            }
        }
        System.out.println("Общая сумма " + total);

        System.out.println("Задание 2");

        int numberA = 0;
        while (numberA < 10) {
            numberA++;
            System.out.print(numberA + " ");
        }
        System.out.println();

        int numberB = 11;
        while (numberB > 1) {
            numberB--;
            System.out.print(numberB + " ");
        }
        System.out.println();

        System.out.println("Задание 3");

        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population - deathRate + birthRate;
            System.out.println("Год " + year + " численость населения составляет " + population);

        }

        System.out.println("Задание 4");


        int salary2 = 15000;
        int total2 = 15000;
        int i2 = 0;
        for (; total2 <= 12_000_000; i2++) {
            total2 = total2 + total2 / 100 * 7;
            total2 = total2 + salary2;
            if (i2 % 1 == 0) {
                System.out.println("Месяц " + i2 + " Итого " + total2);
            }
        }

        System.out.println("Задание 5");

        int salary3 = 15000;
        int total3 = 15000;
        int i3 = 0;
        for (; total3 <= 12_000_000; i3++) {

            total3 = total3 + total3 / 100 * 7;
            total3 = total3 + salary3;
            if (i3 % 6 == 0 && i3 > 0) {

                System.out.println( "Месяц " + i3 + " сумма накоплений " +total3);
            }
        }

        System.out.println("Задание 6");

        int salary4 = 15000;
        int total4 = 0;
        int allmonth = 9 * 12;
        for (int month = 1; month <= allmonth; month++) {
            total4 = total4 + total4 / 100 * 7;
            total4 = total4 + salary4;
            if (month % 6 == 0) {
                System.out.println(  month + " Месяц. Общая сумма накоплений (с учётом процентов) " + total4);
            }
        }

        System.out.println("Задание 7");


        int friday = 4;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет" );
            friday = friday + 7;
        }
        while (friday < 31);

        System.out.println("Задание 8");
        int year = 0;
        int yaerBefore = 2024 - 200;
        int yearAfter = 2024 + 100;

        for (year = yaerBefore; year < yearAfter; year ++) {
            if (year % 79 == 0){
                System.out.println(year);}
        }





    }
}
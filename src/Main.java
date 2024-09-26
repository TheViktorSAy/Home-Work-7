public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total);
        }

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

        int deposit = 15000;
        int target = 12_000_000;
        int b = 0;
        while (deposit < target) {
            deposit = deposit + deposit / 100 * 7;
            deposit = deposit + salary;
            b++;
            System.out.println("Месяц " + b + " Итого " + deposit);
        }

        System.out.println("Задание 5");

        int monthlyСontribution = 15000;
        int piggyBank = 15000;
        int a = 0;
        for (; piggyBank <= 12_000_000; a++) {

            piggyBank = piggyBank + piggyBank / 100 * 7;
            piggyBank = piggyBank + monthlyСontribution;
            if (a % 6 == 0 && a > 0) {
                System.out.println( "Месяц " + a + " сумма накоплений " +piggyBank);
            }
        }

        System.out.println("Задание 6");

        int everyMonthContribution = 15000;
        int bank = 0;
        int allmonth = 9 * 12;
        for (int month = 1; month <= allmonth; month++) {
            bank = bank + bank / 100 * 7;
            bank = bank + salary;
            if (month % 6 == 0) {
                System.out.println(  month + " Месяц. Общая сумма накоплений (с учётом процентов) " + bank);
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
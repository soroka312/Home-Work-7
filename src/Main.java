public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println(" ");
        System.out.println("Задача 1");
        System.out.println(" ");

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }

        //Task 2
        System.out.println(" ");
        System.out.println("Задача 2");
        System.out.println(" ");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }

        System.out.println(" ");

        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }

        System.out.println(" ");

        //Task 3
        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.println(" ");

        int population = 12_000_000;
        int birthRate = 17 * (population / 1000);
        int mortalityRate = 8 * (population / 1000);
        int year = 0;
        while (year < 10) {
            population = population + (birthRate - mortalityRate);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Task 4
        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println(" ");

        int salary1 = 15000;
        int total1 = 0;
        int month1 = 0;
        while (total1 < 12_000_000) {
            month1++;
            total1 = total1 + salary1;
            total1 = total1 + 7 * (total1 / 100);
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1);
        }

        //Task 5
        System.out.println(" ");
        System.out.println("Задача 5");
        System.out.println(" ");

        int salary2 = 15000;
        int total2 = 0;
        int month2 = 0;
        while (total2 < 13_000_000) {
            month2 = month2 + 1;
            total2 = total2 + salary2;
            total2 = total2 + 7 * (total2 / 100);
            if (month2 % 6 == 0)
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + total2);
        }

        //Task 6
        System.out.println(" ");
        System.out.println("Задача 6");
        System.out.println(" ");

        int salary3 = 15000;
        int total3 = 0;
        int month3 = 0;
        double year3 = 0;
        while (year3 < 9) {
            month3++;
            year3 = year3 + 0.083;
            total3 = total3 + salary3;
            total3 = total3 + 7 * (total3 / 100);
            if (month3 % 6 == 0)
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + total3);
        }

        //Task 7
        System.out.println(" ");
        System.out.println("Задача 7");
        System.out.println(" ");

        for (int friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        //Task 8
        System.out.println(" ");
        System.out.println("Задача 8");
        System.out.println(" ");


        int lastYear = 2024 - 200;
        int nextYear = 2024 + 100;
        for (int year4 = 0; year4 < nextYear; year4 = year4 + 79) {
            if (year4 > lastYear)
                System.out.println(year4);
        }
    }
}
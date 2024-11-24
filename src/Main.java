import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1 ");

        int age = 19;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("Задача 2 ");

        int temperature = 30;

        if (temperature < 5) {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        }
        if (temperature > 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки ");
        }

        int temp2 = 2;
        if (temp2 < 5) {
            System.out.println(" На улице " + temp2 + " градуса, нужно надеть шапку ");
        }

        if (temp2 > 5) {
            System.out.println(" На улице " + temp2 + " градуса, можно идти без шапки ");
        }

        System.out.println("Задача 3 ");

        int speed = 40;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " км/ч, то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + speed + " км/ч, то можно ездить спокойно ");
        }

        System.out.println("Задача 4 ");

        int year = 18;
        if (year >= 2 && year <= 6) {
            System.out.println(" Если возраст человека равен " + year + " то ему нужно ходить в детский сад ");
        }

        if (year >= 7 && year <= 17) {
            System.out.println(" Если возраст человека равен " + year + " то ему нужно ходить в школу ");
        }
        if (year >= 18 && year <= 24) {
            System.out.println(" Если возраст человека равен " + year + " то ему нужно ходить в университет ");
        }
        if (year > 24) {
            System.out.println(" Если возраст человека равен " + year + " то ему нужно ходить на работу ");
        }

        System.out.println("Задача 5 ");

        int vozrast = 16;

        if (vozrast <= 5) {
            System.out.println(" Если возраст ребенка равен  " + vozrast + " то ему нельзя кататься на аттракционе ");
        }
        if (vozrast > 5 && vozrast < 14) {
            System.out.println(" Если возраст ребенка равен  " + vozrast + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (vozrast >= 14) {
            System.out.println(" Если возраст ребенка равен  " + vozrast + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задача 6 ");

        int people = 72;

        if (people >= 0 && people <= 60) {
            System.out.println(" в вагоне есть сидячее место");
        }
        if (people > 60 && people <= 102) {
            System.out.println(" в вагоне есть только стоячие места");
        } else {
            System.out.println(" в вагоне нет мест");
        }

        System.out.println("Задача 7 ");

        int one = 1;
        int two = 2;
        int three = 3;

        if (two > one && two < three) {
            System.out.println("самое большое число " + three);
        } else {
            System.out.println("все сломалось ");
        }


    }
}
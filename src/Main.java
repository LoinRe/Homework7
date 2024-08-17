public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
// Задание 1
        int depositMonth = 15000;
        int totalMoney = 0;
        int numMonth = 0;
        while (totalMoney < 2459000) {
            totalMoney += totalMoney / 100;
            totalMoney = totalMoney + depositMonth;
            numMonth++;
        }
        System.out.println("Месяц " + numMonth + ", сумма накоплений равна " + totalMoney + " рублей");


        System.out.println("Задание 2");
// Задание 2
        int num = 0;
        while (num <= 9) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        System.out.println("");
        System.out.println("Задание 3");
// Задание 3
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int naturalIncrease = birth - death; // на тысячу
        int increaseInYear = naturalIncrease * 12_000_000 / 1000;
        int year = 2024;
        while (year < 2034) {
            population += increaseInYear;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


        System.out.println("Задание 4");
// Задание 4
        int deposit = 15000;
        int month = 0;
        while (deposit < 12000000) {
            month++;
            deposit += deposit * 7 / 100;
            System.out.println("Месяц " + month + " Итого " + deposit);
        }
        System.out.println(month + " месяцев нужно копить");


        System.out.println("Задание 5");
// Задание 5
        int deposit1 = 15000;
        int month1 = 0; // подсчет месяцев
        while (deposit1 < 12000000) {
            month1++;
            deposit1 += deposit1 * 7 / 100;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " Итого " + deposit1);
            }
        }
        System.out.println(month1 + " месяцев нужно копить");


        System.out.println("Задание 6");
// Задание 6
        int deposit2 = 15000;
        int timeToSaveMoney = 0; // 108 месяцев = 9 лет
        while (timeToSaveMoney < 108) {
            timeToSaveMoney++;
            deposit2 += deposit2 * 7 / 100;
            if (timeToSaveMoney % 6 == 0) {
                System.out.println("Месяц " + timeToSaveMoney + " Итого " + deposit2);
            }
        }


        System.out.println("Задание 7");
// Задание 7
        int numFriday = 5;
        for (int i = numFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

// Еще одно решение:
//         int monthDay = 0;
//         while (monthDay < 31) {
//             monthDay++;
//             if (monthDay % 7 == 0) {
//                 System.out.println("Сегодня пятница, " + numFriday + "-е число. Необходимо подготовить отчет");
//                 numFriday += 7;
//             }
//         }

        // Кажется, с ним что то не то, но оно работает))


        System.out.println("Задание 8");
// Задание 8
        int arrive = 79;
        int yearNow = 2000;
        int yearFuture = yearNow + 100;
        int yearPast = yearNow - 200;
        for (int i = 0; i < yearFuture; i += arrive) {    // период от нулевого года до 2100
            if (i >= yearPast && i < yearNow) {           // для последних 200 лет
                System.out.println("Комета прилетала: " + i);
            }
            if (i > yearNow && i <= yearFuture) {         // для ближайших 100 лет
                System.out.println("Комета ожидается: " + i);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
// Задание 1
        int depositMonth = 15000;
        int totalMoney = 0;
        int numMonth = 0;
        int wishSum = 2459000;
        double percent = 1D / 100;
        while (totalMoney < wishSum) {
            totalMoney = totalMoney + depositMonth;
            totalMoney = (int) (totalMoney * (1 + percent));
            numMonth++;
        }
        System.out.println("Месяц " + numMonth + ", сумма накоплений равна " + totalMoney + " рублей");


        System.out.println("Задание 2");
// Задание 2
        int num = 0;
        while (num < 10) {
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
        int increaseInYear = naturalIncrease * population / 1000;
        int year = 2024;
        while (year < 2034) {
            population += increaseInYear;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }


        System.out.println("Задание 4");
// Задание 4
        int deposit = 15000;
        int month = 0;
        percent = 7D / 100;
        wishSum = 12000000;
        while (deposit < wishSum) {
            month++;
            deposit = (int) (deposit * (1 + percent));
            System.out.println("Месяц " + month + " Итого " + deposit);
        }
        System.out.println(month + " месяцев нужно копить");


        System.out.println("Задание 5");
// Задание 5
        deposit = 15000;
        month = 0; // подсчет месяцев
        percent = 7D / 100;
        while (deposit < wishSum) {
            month++;
            deposit = (int) (deposit * (1 + percent));
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + deposit);
            }
        }
        System.out.println(month + " месяцев нужно копить");


        System.out.println("Задание 6");
// Задание 6
        deposit = 15000;
        int timeToSaveMoney = 0; // 108 месяцев = 9 лет
        while (timeToSaveMoney < 108) {
            timeToSaveMoney++;
            deposit = (int) (deposit * (1 + percent));
            if (timeToSaveMoney % 6 == 0) {
                System.out.println("Месяц " + timeToSaveMoney + " Итого " + deposit);
            }
        }


        System.out.println("Задание 7");
// Задание 7
        int numFriday = 5;
        for (int i = numFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }


        System.out.println("Задание 8");
// Задание 8
        int period = 79;
        int yearNow = 2024;
        int yearFuture = yearNow + 100;
        int yearPast = yearNow - 200;
        for (int i = 0; i < yearFuture; i += period) {    // период от нулевого года до 2100
            if (i >= yearPast && i < yearNow) {           // для последних 200 лет
                System.out.println("Комета прилетала: " + i);
            }
            if (i > yearNow && i <= yearFuture) {         // для ближайших 100 лет
                System.out.println("Комета ожидается: " + i);
            }
        }
    }
}


// У меня 79 не было магическим числом. Поменяла название с arrive на period, хотя имя вроде и так понятным было.
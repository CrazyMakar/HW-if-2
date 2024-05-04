public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        {
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        System.out.println("Задание №2");
        {
            int clientDeviceYear = 2014;
            int clientOS = 0;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        System.out.println("Задание №3");
        {
            int year = 2021;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        System.out.println();

        System.out.println("Задание №4");
        {
            int deliveryDistance = 80;
            int days = 1;
            int distance0 = 0;
            int distance1 = 20;
            int distance2 = 60;
            int distance3 = 100;
            if (deliveryDistance > distance0 && deliveryDistance <= distance1) {
                System.out.println("Потребуется дней: " + days + " срок доставки");
            } else if (deliveryDistance > distance1 && deliveryDistance <= distance2) {
                days++;
                System.out.println("Потребуется дней: " + days + " срок доставки");
            } else if (deliveryDistance > distance2 && deliveryDistance <= distance3) {
                days = days + 2;
                System.out.println("Потребуется дней: " + days + " срок доставки");
            } else if (deliveryDistance > distance3) {
                System.out.println("Доставки нет!");
            }
        }
        System.out.println();

        System.out.println("Задание №5");
        {
            int monthNumber = 12;
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Не знаем какой месяц");
            }

        }
        System.out.println();
    }
}
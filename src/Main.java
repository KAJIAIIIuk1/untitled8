public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int telefons = 0;
        if (telefons == 1) {
            System.out.println("установите приложение для андройд по ссылке");
        } else if (telefons == 0) {
            System.out.println("установите приложение для iOS по ссылке");
        }
        int clientIos = 0;
        int clientDeviceYear = 2015;
        if (clientIos == 0 && clientDeviceYear >= 2015) {
            System.out.println("установите приложение для iOS по ссылке");
        } else if (clientIos == 1 && clientDeviceYear >= 2015) {
            System.out.println("установите приложение для iOS по ссылке");
        } else if (clientIos == 0 && clientDeviceYear < 2015) {
            System.out.println("установите облегкченную версию приложения для iOS по ссылке.");
        } else if (clientIos == 1 && clientDeviceYear < 2015) {
            System.out.println("установите облегкченную версию приложения для андройд по ссылке");

        }
        int leapYear = 2029;
        if (leapYear == 2021 || leapYear == 2025 || leapYear == 2029) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }

        int road = 65;
        int time = 1;
        if (road <= 20) {
            System.out.println("доставка будет через " + time + " день");
        } else if (road > 20 && road <= 60) {
            System.out.println("доставка будет через " + (time + 1) + " дня");
        } else if (road > 60 && road <=100) {
            System.out.println("доставка будет через " + (time + 2) + " дня");
        } else if (road > 100) {
            System.out.println("доставки нет");


        }
        int month = 11;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("сень");
                break;
            default:
                System.out.println("этого месяца не существует");
        }

    }
}





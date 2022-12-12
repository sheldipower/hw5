import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию для ios  по ссылке");
        } else {
            System.out.println("Установите версию для Android  по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2018;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введены неверные параметры");
        }
    }

    public static void task3() {
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");

        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20)
            deliveryDay++;
        if (deliveryDistance > 65)
            deliveryDay++;
        System.out.println("Потребуется дней: " + deliveryDay);
    }

     public static void task5() {
         int monthNumber = 22;

         switch (monthNumber) {
             case 1:
             case 2:
             case 12:
                 System.out.println("Зима");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Весна");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Осень");
                 break;
             default:
                 System.out.println("Такого сезона не существует");
         }

     }

}


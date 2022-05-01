package newPackage;

public class HomeWork_2 {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println("Результат > " + trueFalse(15, 10));
        System.out.println("Задание 2");
        ifElse(5);
        System.out.println("Задание 3");
        System.out.println("Результат > " + trueFalse2(17));
        System.out.println("Задание 4");
        printText("Hello string", 5);
    }

    //Задание 1
    public static boolean trueFalse(int a, int b) {

        int sum = a + b;

        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 2
    public static void ifElse(int a) {
            if (a >= 0) System.out.println("Число положительное");
            else System.out.println("Число отрицательное");
    }

    //Задание 3
    public static boolean trueFalse2(int a) {
            if (a < 0) return true;
            else return false;
    }

    //Задание 4
    public static void printText(String value, int a) {
        for (int i = 1; i <= a; i++); {
            System.out.println("String #" + i + ": " + value);

        }
    }
}

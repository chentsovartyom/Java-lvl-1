package newPackage;

public class HomeWork_2 {

    public static void main(String[] args) {

        System.out.println("������� 1");
        System.out.println("��������� > " + trueFalse(15, 10));
        System.out.println("������� 2");
        ifElse(5);
        System.out.println("������� 3");
        System.out.println("��������� > " + trueFalse2(17));
        System.out.println("������� 4");
        printText("Hello string", 5);
    }

    //������� 1
    public static boolean trueFalse(int a, int b) {

        int sum = a + b;

        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    //������� 2
    public static void ifElse(int a) {
            if (a >= 0) System.out.println("����� �������������");
            else System.out.println("����� �������������");
    }

    //������� 3
    public static boolean trueFalse2(int a) {
            if (a < 0) return true;
            else return false;
    }

    //������� 4
    public static void printText(String value, int a) {
        for (int i = 1; i <= a; i++); {
            System.out.println("String #" + i + ": " + value);

        }
    }
}

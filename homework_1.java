import org.w3c.dom.ls.LSOutput;

public class homework_1 {
//задание 1
    public static void main(String[] args) {

//задание 2
        byte bt = 0;
        short st = 0;
        int it = 0;
        long lg = 0L;
        float ft = 0.0f;
        double db = 0.0;
        char cr = 'd';
        boolean bn = true;

//задание 3
        int a = 3;
        int b = 5;
        int c = 10;
        int d = 2;
        String s = "Вася";
        int age = 2020;
        System.out.println(metod1(a, b, c, d));
        System.out.println(metod2(a, b));
        System.out.println(metod3(a));
        System.out.println(metod4(a));
        System.out.println(metod5(s));
        System.out.println(metod6(age));
    }
        public static int metod1(int a, int b, int c, int d) {
           int res = (a * (b + (c / d)));
           return res;
        }

//задание 4
        public static boolean metod2(int a, int b) {
            boolean res = true;
            int temp = a + b;
            if ((temp >= 10) && (temp <= 20)) res = true;
            else res = false;
            return res;
        }
//задание 5
        public static String metod3(int a) {
        String res = "";
        if (a >= 0) {
            res = "Positive number entered";
           }
            else {
            res = "Negative number entered";
           }
        return res;
        }
//задание 6
        public static boolean metod4(int a) {
            boolean res = true;
            if (a < 0) {
                res = true;
            }
            else {
                res = false;
            }
            return res;
        }
//задание 7
        public static String metod5(String s) {
            String res = "Привет, " + s + "!";
            return res;
        }
//задание 8
    public static String metod6(int age) {
        String res = "";
        if (((age % 4 == 0) && (age % 100 != 0)) || (age % 400 == 0)) {
            res = "Високосный год";
        }
        else {
            res = "Невисокосный год";
        }
        return res;
    }
}

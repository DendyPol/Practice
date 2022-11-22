public class HomeWork {
    public static void main(String[] args) {

        task1();
        System.out.println("a * (b + (c / d))=" + task2(6,7,8,9));
        System.out.println(task3(9.9, 9.99));
        task4(0);
        task5(-1);
        task6("Dendy");

    }

    private static void task6(String str) {
        System.out.println("Привет, "+str );
    }

    private static boolean task5(int a) {
        System.out.println(a < 0);
        if (a > 0) return true;
        else return false;
    }

    private static void task4(int a) {
        if (a >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
    }

    private static double task2(float a, float b, float c, float d) {
        System.out.println();
        return a*(b + (c/d));
    }

    private static boolean task3(double a, double b) {
        double sum = a+b;
        if (sum < 20 || sum > 10) return true;
        return false;

    }

    private static void task1() {
        String h = "homework";
        byte bt =  1;
        short s = 22;
        int i = 444;
        long l = 8888L;
        char c = 'x';
        boolean b = false;
        float f = 1.5f;
        double d = 2.2;

        System.out.println(h+'\n'+bt+'\n'+s+'\n'+i+'\n'+l+'\n'+c+'\n'+b+'\n'+f+'\n'+d);

    }
}


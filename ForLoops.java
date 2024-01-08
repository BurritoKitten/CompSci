public class ForLoops {
    public int addEvens(int n) {
        int t = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                t += i;
        }
        return t;
    }

    public void printSquaresBack(int n) {
        for (; n > 0; n--) {
            System.out.print(n * n);
            if (n != 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public void sillyNumbers() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }

    public void sillyNumbers2() {
        for (int a = 0; a < 3; a++) {
            for (int b = 9; b > 0; b--) {
                for (int c = 0; c < b; c++) {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }

    public void dollarsAndStars() {
        String c;
        for (int i = 0; i < 7; i++) {
            for (int a = 0; a < i * 2; a++) {
                System.out.print("*");
            }
            for (int a = 0; a < 4; a++) {
                if (a == 0 || a == 3) {
                    c = "$";
                } else {
                    c = "*";
                }
                for (int b = 0; b < 7 - i; b++) {
                    System.out.print(c);
                }
            }
            for (int a = 0; a < i * 2; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ForLoops instance = new ForLoops();
        System.out.println(instance.addEvens(7));
        System.out.println(instance.addEvens(17));
        System.out.println(instance.addEvens(27));
        System.out.println();
        instance.printSquaresBack(7);
        instance.printSquaresBack(9);
        instance.printSquaresBack(11);
        System.out.println();
        instance.sillyNumbers();
        System.out.println();
        instance.sillyNumbers2();
        System.out.println();
        instance.dollarsAndStars();
    }
}
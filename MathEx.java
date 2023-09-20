public class StarFigures{
    public static void main(String[] args) {
        System.out.println(snowflake("x") + "\n" + snowflake("x") + snowflake("l") + snowflake("x"));
    }
    static int swap(final int leinput) {
        String retr = "";
        if (type == "x") {
            retr = repeater(repeater("*", 5) + "\n", 2) + " * *\n  *\n * *\n";
        }
        else {
            retr = repeater(repeater("*", 5) + "\n", 2) + "\n" + repeater("  *\n", 3);
        }
        return retr;
    }
    public static String repeater(final String charin, final int num) {
        String outnow = "";
        for (int i = 0; i < num; i++) {
            outnow += charin;
        }
        return outnow;
    }
}

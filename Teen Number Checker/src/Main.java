public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen(int a, int b, int c) {
        if (a < 20 && a > 12) {
            return true;
        }
        else if (b < 20 && b > 12) {
            return true;
        }
        else if (c < 20 && c > 12) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isTeen(int d) {
        if (d < 20 && d > 12) {
            return true;
        }
        else {
            return false;
        }
    }
}

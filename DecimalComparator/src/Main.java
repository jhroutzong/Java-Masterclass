public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double c;
        double d;
        if (a > 0 && b > 0) {
            c = Math.floor(a * 1000);
            d = Math.floor(b * 1000);
        }
        else {
            c = Math.ceil(a * 1000);
            d = Math.ceil(b * 1000);
        }
        if (c == d) {
            return true;
        }
        else {
            return false;
        }
    }

}

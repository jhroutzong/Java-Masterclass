public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature < 46 && temperature > 24) {
                return true;
            }
        }
        else {
            if (temperature < 36 && temperature > 24) {
                return true;
            }
        }
        return false;
    }
}

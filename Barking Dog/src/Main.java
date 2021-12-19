public class Main {

    public static void main(String[] args) {
	shouldWakeUp(true, 1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false) {
            return false;
        }
        else if (hourOfDay < 0) {
            return false;
        }
        else if (hourOfDay < 8) {
            return true;
        }
        else if (hourOfDay == 23) {
            return true;
        }
        else {
            return false;
        }
}
    }


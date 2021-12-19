public class Main {

    public static void main(String[] args) {
	System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value.";
        }
        else {
            int hours = minutes / 60;
            int minutesRemaining = minutes % 60;
            return (hours + "h " + minutesRemaining + "m " + seconds + "s");
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value.";
        }
        else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
    }
}

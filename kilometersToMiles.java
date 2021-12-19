import java.lang.Math;
public class kilometersToMiles {

    public static void main(String[] args) {
	printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            return ((long) (Math.round(kilometersPerHour * 0.6215)));
        }
        else {
            return -1;
         }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
        System.out.println("Invalid Value");
        }
        else {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) +
                " mi/h");
                }
    }
}
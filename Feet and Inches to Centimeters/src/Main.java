public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesToCentimeters(14);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0) {
            return -1;
        }
        else if (inches > 12) {
            return -1;
        }
        double newInches = (feet * 12) + inches;
        double centimeters = newInches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches are equal to " + centimeters + " centimeters.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            double feet = Math.floor(inches / 12);
            double newInches = inches % 12;
            System.out.println(inches + " inches are equal to " + feet + " feet and " + newInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, newInches);

        } else {
            return -1;
        }

    }
}

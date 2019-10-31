// Calculates confidence interval given mean and error of margin.
public class CalculateConfidenceInterval {

    public static String interval(double mean, double errorMargin) {
        double upperLimit = upperLimit(mean, errorMargin);
        double lowerLimit = lowerLimit(mean, errorMargin);
        return "(" + lowerLimit + "," + upperLimit + ")";
    }

    public static double lowerLimit(double mean, double errorMargin) {
        return mean - errorMargin;
    }

    public static double upperLimit(double mean, double errorMargin) {
        return mean + errorMargin;
    }
}

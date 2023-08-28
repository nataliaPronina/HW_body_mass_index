public class BmiService {
    public double calculate (double weight_kilograms, double height_meters) {
        double index;
        index = weight_kilograms / (height_meters * height_meters);
        return index;
    }
}

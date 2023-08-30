public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double height = 1.75;
        double index = service.calculate(weight, height);

        System.out.println(index);
    }
}
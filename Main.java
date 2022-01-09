public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 162;
        double BodyMassIndex = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.2f", BodyMassIndex);
    }
}

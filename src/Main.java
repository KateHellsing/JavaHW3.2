public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 160;
        int weight = 55;
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);

        if (bmi <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        else if (bmi > 16 &&  bmi <= 18.5) {
            System.out.println("Недостаточная (дефицит) масса тела");
        }
        else if (bmi > 18.5 &&  bmi <= 25) {
            System.out.print("Норма");
        }
        else if (bmi > 25 &&  bmi <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        }
        else if (bmi > 30 &&  bmi <= 35) {
            System.out.println("Ожирение первой степени");
        }
        else if (bmi > 35 &&  bmi <= 40) {
            System.out.println("Ожирение второй степени");
        }
        else if (bmi > 40 &&  bmi < 45) {
            System.out.println("Ожирение третьей степени (морбидное)");
        }
        else {
            System.out.println("Введены не верные значения");
        }
    }
}
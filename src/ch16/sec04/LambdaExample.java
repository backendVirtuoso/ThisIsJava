package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 리턴문 하나만 있을 경우(연산식)
        //person.action((x, y) -> {
        //	return (x + y);
        //});
        person.action((x, y) -> (x + y));
        person.action(Double::sum); // Lambda can be replaced with method reference

        // 리턴문 하나만 있을 경우(메소드 호출)
        //person.action((x, y) -> {
        //	return sum(x, y);
        //});
        person.action((x, y) -> sum(x, y));
        person.action(LambdaExample::sum);  // Lambda can be replaced with method reference
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}

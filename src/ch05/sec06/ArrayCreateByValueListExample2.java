package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        for (int score : scores) {
            sum1 += score;
        }
        System.out.println("총합: " + sum1);

        printItem(new int[] {83, 90, 87});
    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}

package ch21.sec04;

public class Java21RecordExample1 {
    private static void area(Object obj) {
        if (obj == null) {
            System.out.println("null");
        } else if (obj instanceof Rectangle(int width, int height)) {
            System.out.println("area:  " + (width * height));
        } else {
            System.out.println("unknown");
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        area(rect);
    }
}

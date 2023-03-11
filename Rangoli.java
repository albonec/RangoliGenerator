import java.util.Scanner;

public class Rangoli {

    private static void drawRangoli(int n, double angle, double angleIncrement, double lineLength, double lineLengthIncrement) {
        double x, y;
        double prevX = 0.5, prevY = 0.5;
        for (int i = 0; i < n; i++) {
            x = lineLength*Math.cos(Math.toRadians(angle));
            y = lineLength*Math.sin(Math.toRadians(angle));
            StdDraw.polygon(new double[]{prevX, x}, new double[]{prevY, y});
            lineLength += lineLengthIncrement;
            angle -= angleIncrement;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the starting line length: ");
        double lineLength = scan.nextDouble();
        System.out.printf("Enter the line length increment: ");
        double lineLengthIncrement = scan.nextDouble();
        System.out.printf("Enter the starting angle: ");
        int angle = scan.nextInt();
        System.out.printf("Enter the angle increment: ");
        int angleIncrement = scan.nextInt();
        System.out.printf("Enter the number of layers: ");
        int layers = scan.nextInt();

        drawRangoli(layers, angle, angleIncrement, lineLength, lineLengthIncrement);
    }
}

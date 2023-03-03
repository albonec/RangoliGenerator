import java.util.Scanner;

public class Rangoli {

    private static void drawTriangle(int n, double x, double y, double size) {
            if (n == 0) { // base case
                StdDraw.polygon(new double[]{x, x - size/2, x + size/2}, new double[]{y, y + size/2 * Math.sqrt(3), y + size/2 * Math.sqrt(3)});
            } else {
                drawTriangle(n-1, x, y, size/2); // top triangle
                drawTriangle(n-1, x - size/4, y - size/2 * Math.sqrt(3)/2, size/2); // bottom left triangle
                drawTriangle(n-1, x + size/4, y - size/2 * Math.sqrt(3)/2, size/2); // bottom right triangle
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = 0.5;
        double y = 0.5;
        double size = 0.5;

        System.out.printf("Enter the number of layers: ");
        int layers = scan.nextInt();

        drawTriangle(layers, x, y, size);
    }
}

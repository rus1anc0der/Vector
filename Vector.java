/*
 * Класс, который описывает вектор (в трёхмерном пространстве)
 */
import java.util.ArrayList;
import java.util.Random;

public class Vector {
    private final int x;
    private final int y;
    private final int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //    sqrt{x^2 + y^2 + z^2}
    public double lenVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //    x_1x_2 + y_1y_2 + z_1z_2
    public int sum(Vector other) {
        return (this.x * other.x + this.y * other.y + this.z * other.z);
    }

    //    (y_1z_2 - z_1y_2, z_1x_2 - x_1z_2, x_1y_2 - y_1x_2)
    public String mult(Vector other) {
        ArrayList<Integer> lstMult = new ArrayList<>();
        lstMult.add(this.y * other.z - this.z * other.y);
        lstMult.add(this.z * other.x - this.x * other.z);
        lstMult.add(this.x * other.y - this.y * other.x);
        return lstMult.toString();
    }

    //    {(a,b)}
//  {|a| * |b|}
    public float corner(Vector other) {
        int xy = this.x * other.x + this.y * other.y;
        double vecX = Math.sqrt(this.x * this.x + other.x * other.x);
        double vecY = Math.sqrt(this.y * this.y + other.y * other.y);
        return (float) (xy / (vecX * vecY));
    }

    //     (x_1 + x_2, y_1 + y_2, z_1 + z_2)
//     (x_1 - x_2, y_1 - y_2, z_1 - z_2)
    public void sumDifference(Vector other) {
        ArrayList<Integer> lstSum = new ArrayList<>();
        ArrayList<Integer> lstDifference = new ArrayList<>();
        lstSum.add(this.x + other.x);
        lstSum.add(this.y + other.y);
        lstSum.add(this.z + other.z);
        lstDifference.add(this.x - other.x);
        lstDifference.add(this.y - other.y);
        lstDifference.add(this.z - other.z);
        System.out.printf("%s , %s", lstSum, lstDifference);
    }

    public static void rnd(int n) {
        ArrayList<Vector> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array.add(new Vector(random.nextInt(10), random.nextInt(10), random.nextInt(10)));
        }
        System.out.printf("%s", array.toString());
    }

    @Override
    public String toString() {
        return "Vector{" + x + ":" + y + ":" + z + '}';
    }
}

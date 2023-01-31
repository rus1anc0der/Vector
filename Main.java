public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3, 4, 1);
        // Длинна вектора
        System.out.println(vector.lenVector());
        //скалярное произведение
        System.out.printf("%d\n", vector.sum(new Vector(4, 3, 1)));
        //векторное произведение с другим вектором
        System.out.printf(vector.mult(new Vector(4, 3, 1)));
        //вычисляющий угол между векторами (или косинус угла)
        System.out.printf("\n%f\n", vector.corner(new Vector(4, 3, 1)));
        //суммы и разности
        vector.sumDifference(new Vector(4,3,1));
        System.out.println();
        //возвращает массив случайных векторов размером N
        Vector.rnd(5);
    }

}

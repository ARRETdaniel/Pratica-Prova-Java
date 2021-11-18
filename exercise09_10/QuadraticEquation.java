public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
    }

    protected double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
    }

    protected double getDiscriminant() {
        return (b * 2) - (4 * a * c);
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


}

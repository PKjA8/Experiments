
class Figure {
    double r;

    Figure(double r) {
        this.r = r;
    }
}

class Cone extends Figure {
    double s;

    Cone(double r, double s) {
        super(r);
        this.s = s;
    }

    public void calcArea() {
        double p = 3.14159; // Correct value for Pi
        double area = (p * r * s) + (p * r * r);
        System.out.println("Calculated Area: " + area);
    }

    public void calcVolume() {
        double p = 3.14159; // Correct value for Pi
        double volume = (p * r * r * s) / 3;
        System.out.println("Calculated Volume: " + volume);
    }
}

public class ConeAreaVolume {
    public static void main(String[] args) {
        Cone c1 = new Cone(2.0, 5.0);
        c1.calcArea();
        c1.calcVolume();
    }
}


abstract class Figure {
    protected static final double pi = 3.1420;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}


class Cone extends Figure {
    private double n; 
    private double s; // slant height
    private double a; 
    private double v; 

    public Cone(double n, double s) {
        this.n = n;
        this.s = s;
    }

    @Override
    public void calcArea() {
        a = pi * n * (n + s);
    }

    @Override
    public void calcVol() {
        v = (1.0 / 3) * pi * n * n * s; 
    }

    @Override
    public void dispArea() {
        System.out.println("Cone Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Cone Volume: " + v);
    }
}

class Sphere extends Figure {
    private double n; 
    private double a;
    private double v; 

    public Sphere(double n) {
        this.n = n;
    }

    @Override
    public void calcArea() {
        a = 4 * pi * n * n;
    }

    @Override
    public void calcVol() {
        v = (4.0 / 3) * pi * n * n * n;
    }

    @Override
    public void dispArea() {
        System.out.println("Sphere Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Sphere Volume: " + v);
    }
}

class Cylinder extends Figure {
    private double n; 
    private double h; 
    private double a; 
    private double v; 

    public Cylinder(double n, double h) {
        this.n = n;
        this.h = h;
    }

    @Override
    public void calcArea() {
        a = 2 * pi * n * (n + h); 
    }

    @Override
    public void calcVol() {
        v = pi * n * n * h;
    }

    @Override
    public void dispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Cylinder Volume: " + v);
    }
}

public class CSCAreaVolume_ {
    public static void main(String[] args) {
        Cone co = new Cone(3, 5);
        Sphere sphere = new Sphere(3);
        Cylinder cylinder = new Cylinder(3, 7);
  
        co.calcArea();
        co.calcVol();
        co.dispArea();
        co.dispVol();

        sphere.calcArea();
        sphere.calcVol();
        sphere.dispArea();
        sphere.dispVol();

        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.dispArea();
        cylinder.dispVol();
    }
}

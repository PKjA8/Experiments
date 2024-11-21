class Figure{
    double r;
    double a;
    double v;

    Figure(double r, double a, double v){
        this.r = r;
        this.a = a;
        this.v = v;
    }
    public void dispArea(){
        System.out.println(a);
    }
    public void dispVolume(){
        System.out.println(v);
    }
}

class Cone extends Figure{
    double p;
    double s;

    Cone(double r, double p, double s, double a, double v){
        super(r,a,v);
        this.p = p;
        this.s = s;
    }
    public void calcArea(){
        System.out.println((p*r*s)+(p*r*s));
    }

    public void calcVolume(){
        System.out.println((p*r*s)/3);
    }
}

public class ConeAreaVolume{
    public static void main(String [] args){
        Cone c1 = new Cone(2.0,8.0,5.0,6.74, 79.0);
        c1.calcArea();
        c1.calcVolume();
        c1.dispArea();
    }
}
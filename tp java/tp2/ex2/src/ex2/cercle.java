package ex2;

public class cercle {
    double rayon;
    final double PI = 3.14;

    public cercle() {}

   
    public cercle(double rayon) {
        this.rayon = rayon;
    }

    
    public double calculSurface() {
        return PI * rayon * rayon;
    }
}


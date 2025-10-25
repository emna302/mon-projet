package ex2;

public class rectangle {
    double longueur;
    double largeur;

    public rectangle() {}

 
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculSurface() {
        return longueur * largeur;
    }
}
package app;

public class PointNom extends Point {
    int x ;
    int y;
    String nom;
    
    void setPointNom(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }
    
    void setNom(String nom) {
        this.nom = nom;
    }
    
    public void affCoord() {
        System.out.println("Coordonnees: " + 
                            x + " " + y + "nom: "+ nom);
    }
    
}

package app;

public class PointNom extends Point {
    int x ;
    int y;
    String nom;
    
    PointNom(int x, int y, String nom) {
        this.x = x ;
        this.y = y;
        this.nom = nom;
    }
    
    @Override
    public void affCoord() {
        System.out.println("Coordonnees: " + 
                            x + " " + y + " nom: "+ nom);
    }
    
    
}

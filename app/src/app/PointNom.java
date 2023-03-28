package app;

public class PointNom extends Point {
    
    String nom;
    
    PointNom(int x, int y, String nom) {
        super(x,y);
        this.nom = nom;
    }
    
    @Override
    public void affCoord() {
        super.affCoord();
        System.out.println("nom: "+ nom);
    }
    
    
}

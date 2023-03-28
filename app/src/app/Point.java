package app;

public class Point {
    int x ;
    int y ;
    
    
    public void setPoint(int x , int y) {
        this.x = x ;
        this.y = y ;
        
    }
    
    public void deplace (int dx, int dy) {
        this.x = dx;
        this.y = dy;
    
    }
    
    public void affCoord() {
        System.out.println("Coordonnees: " + 
                            x + " " + y);
    }
    
}

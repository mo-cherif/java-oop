package app;

public class Point {
    int x ;
    int y ;
    
    Point(int x , int y) {
        this.x = x ;
        this.y = y ;
    
    }
    
    
    public void affCoord() {
        System.out.println("Coordonnees: " + 
                            x + " " + y);
    }
    
}

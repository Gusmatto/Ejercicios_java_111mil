package ejerciciospoo1;
public class Distancia {

    private double x, y;
    
    public Distancia (double x, double y){
        
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaDesde(Distancia punto) {
        
        double distancia = Math.hypot(this.getX() - punto.getX(), this.getY() - punto.getY());
        return distancia;
    }
    
    public String toString(){
    return "(x= " + getX() + ", y= " + getY() + " )";
}
    public static void main(String[] args) {
         
        Distancia p1 = new Distancia(7, 6);
        Distancia p2 = new Distancia (3, 2);
        
        double distancia = p1.calcularDistanciaDesde(p2);
        System.out.println("La distancia entre los dos puntos es "+ distancia);
    }
}
    


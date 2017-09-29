package ejerciciosLunes_25;
public abstract class Vehiculos {
    
    
    private int kmRecorrido;
    private Persona chofer;
    
    public Vehiculos (int km, Persona ch){
        this.kmRecorrido=km;
        this.chofer=ch;
}
    public void asignarChofer(){
        
    }
    
    public double contarKm(){

        return kmRecorrido;
    }

    public class Persona {

    private String nombre;
    public Persona (String n) {
	this.nombre = n;{
	}
    }
}

    public static void main(String[] args) {
        
        
    }
}

/*Existen dos tipos de vechículos: las motocicletas, que llevan un chofer y
un acompañante; y los autobuses, que llevan un chofer y varios pasajeros. Los
vehículos deben conocer la cantidad de kilómetros recorridos, asignar y cambiar
chofer. Cada vehículo particular deberá poder agregar un acompañante o diversos
pasajeros respectivamente. En el caso del autobús no se puede cambiar de chofer 
si hubiera pasajeros y en el caso de la motocicleta no puede hacerlo si hubiera 
un acompañante.
*/
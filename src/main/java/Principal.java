import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

public class Principal {
    public static void main(String[] args) {
       Vehiculo vehiculo = new Vehiculo("Honda", "Civic", 2019);
       Automovil automovil = new Automovil(null, null, 0, 4, TipoCombustible.GASOLINA);
       Motocicleta motocicleta = new Motocicleta(null, null, 0, TipoMotocicleta.DEPORTIVA);

        
    }
}

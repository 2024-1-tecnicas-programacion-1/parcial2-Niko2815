package parcial2;

public class Motocicleta extends Vehiculo {
    private TipoMotocicleta  tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    public String mostrarMoto(){
        return getMarca() + getModelo() + getAño() + getTipoMotocicleta();
    }
    public TipoMotocicleta tipoMotocicleta(){
        return tipoMotocicleta;
    }
     @Override
        public void setAño(int año) {
            super.setAño(año);
    }
    @Override
        public void setMarca(String marca) {
            super.setMarca(marca);
    }
    @Override
        public void setModelo(String modelo) {
            super.setModelo(modelo);
    }
    @Override
        public int getAño() {
            return super.getAño();
    }
    @Override
        public String getMarca() {
            return super.getMarca();
    }
    @Override
        public String getModelo() {
            return super.getModelo();
    }
   public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
       this.tipoMotocicleta = tipoMotocicleta;
   }
   public TipoMotocicleta getTipoMotocicleta() {
       return tipoMotocicleta;
   }
    
}

public class Poliza {

    protected String nombreAsegurado;
    protected String tipoPoliza;
    protected String fechaInicio;
    protected String fechaFin;

    public Poliza(String nombreAsegurado, String tipoPoliza,
            String fechaInicio, String fechaFin) {

        this.nombreAsegurado = nombreAsegurado;
        this.tipoPoliza = tipoPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void mostrarVigencia() {
        System.out.println("Nombre: " + nombreAsegurado);
        System.out.println("Tipo de poliza: " + tipoPoliza);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
    }
}
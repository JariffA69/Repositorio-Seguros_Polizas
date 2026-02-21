public class GestorPolizas<T extends Poliza> {

    private T[] polizas;
    private int contador = 0;

    public GestorPolizas(T[] polizas) {
        this.polizas = polizas;
    }

    public void agregarPoliza(T poliza) {
        if (contador < polizas.length) {
            polizas[contador] = poliza;
            contador++;
            System.out.println("Poliza agregada correctamente.");
        } else {
            System.out.println("No hay espacio disponible.");
        }
    }

    public void mostrarPolizas() {
        for (int i = 0; i < contador; i++) {
            polizas[i].mostrarVigencia();
            System.out.println("--------------------");
        }
    }
}

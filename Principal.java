import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Poliza[] arreglo = new Poliza[10];
        GestorPolizas<Poliza> gestor = new GestorPolizas<>(arreglo);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("----- MENU -----");
            System.out.println("1. Alta de poliza");
            System.out.println("2. Consultar vigencias");
            System.out.println("3. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.println("Nombre del asegurado:");
                String nombre = sc.nextLine();

                System.out.println("Fecha de inicio (dd/mm/aaaa):");
                String inicio = sc.nextLine();

                System.out.println("Fecha de fin (dd/mm/aaaa):");
                String fin = sc.nextLine();

                System.out.println("Tipo:");
                System.out.println("1. Limitada");
                System.out.println("2. Daños a Terceros");
                System.out.println("3. Amplia");
                System.out.println("4. Plus");

                int tipo = sc.nextInt();
                sc.nextLine();

                Poliza nueva = null;

                if (tipo == 1) {
                    nueva = new PolizaLimitada(nombre, inicio, fin);
                } else if (tipo == 2) {
                    nueva = new PolizaTerceros(nombre, inicio, fin);
                } else if (tipo == 3) {
                    nueva = new PolizaAmplia(nombre, inicio, fin);
                } else if (tipo == 4) {
                    nueva = new PolizaPlus(nombre, inicio, fin);
                }

                if (nueva != null) {
                    gestor.agregarPoliza(nueva);
                }

            } else if (opcion == 2) {

                gestor.mostrarPolizas();

            } else if (opcion == 3) {

                System.out.println("Programa finalizado.");

            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}

import java.util.Scanner;


public class ClaseCadena {
    private String nombre;
    private String iniciales;
    private String apellido;
    public static String DevuelveIniciales(String nombre, String apellido) {

        if(nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty()) {
            return "";
        }

        String[] nombres = nombre.split(" ");
        String[] apellidos = apellido.split(" ");
        StringBuilder iniciales = new StringBuilder();

        for(String nombreActual : nombres) {
            if(!nombreActual.isEmpty()) {
                iniciales.append(nombreActual.charAt(0)).append(".");
            }
        }
        for(String apellidoActual : apellidos) {
            if(!apellidoActual.isEmpty()) {
                iniciales.append(apellidoActual.charAt(0)).append(".");
            }
        }

        return iniciales.toString().toUpperCase();
    }
    public void Menu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = sc.nextLine();
        iniciales = DevuelveIniciales(nombre, apellido);

        if(iniciales.isEmpty()) {
            System.out.println("No se ingresó un nombre completo válido.");
        } else {
            System.out.println("Las iniciales de su nombre completo son: " + iniciales);
        }

    }
}

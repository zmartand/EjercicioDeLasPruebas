import java.util.Scanner;

public class ClaseCadena {
    private String nombre;
    private String apellido;

    public ClaseCadena(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String DevuelveIniciales(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese su nombre y apellido: ");
        //String nombre = sc.nextLine();
        //String apellido = sc.nextLine();
        String[] nombreSeparado = nombre.split(" ");
        String[] apellidoSeparado = apellido.split(" ");
        String iniciales = "";
        for (int i = 0; i < nombreSeparado.length; i++) {
            iniciales += nombreSeparado[i].charAt(0) + ".";
        }
        for (int i = 0; i < apellidoSeparado.length; i++) {
            iniciales += apellidoSeparado[i].charAt(0) + ".";
        }
        return iniciales;
    }
    public static void main(String[] args) {
        ClaseCadena cc = new ClaseCadena("Andreas", "Garcia");
        System.out.println(cc.DevuelveIniciales());
    }

}


public class ClaseCadena {

    public static String DevuelveIniciales(String nombreCompleto) {

        if(nombreCompleto == null || nombreCompleto.isEmpty()) {
            return "";
        }

        String[] nombres = nombreCompleto.split(" ");
        StringBuilder iniciales = new StringBuilder();

        for(String nombre : nombres) {
            if(!nombre.isEmpty()) {
                iniciales.append(nombre.charAt(0)).append(".");
            }
        }

        return iniciales.toString().toUpperCase();
    }

}

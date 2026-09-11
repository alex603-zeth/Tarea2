package emergentes.Tarea2.Funcion;

import emergentes.Tarea2.Informacion.InfoLoro;

import java.util.ArrayList;
import java.util.List;

public class LoroFunc {

    static List<InfoLoro> loros = new ArrayList<>();

    public LoroFunc() {}

    public List<InfoLoro> adquirirLoros() {
        return loros;
    }

    public static InfoLoro adquirirLoro(String nombre) {
        InfoLoro loro = loros.stream()
                .filter(l -> l.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);

        return loro;
    }

    public static InfoLoro producirloro(InfoLoro Loronuevo) {
        loros.add(Loronuevo);
        return Loronuevo;
    }

    public static InfoLoro modificarLoro(String nombre, InfoLoro loroModificado) {

        InfoLoro temporal = adquirirLoro(nombre);

        if (temporal == null) {
            throw new RuntimeException("ESTE LORO NO FUE HALLADO");
        }

        if (loroModificado.getNombre() != null) {
            temporal.setNombre(loroModificado.getNombre());
        }

        if (loroModificado.getEspecie() != null) {
            temporal.setEspecie(loroModificado.getEspecie());
        }

        if (loroModificado.getEdad() != null) {
            temporal.setEdad(loroModificado.getEdad());
        }

        return temporal;
    }

    public InfoLoro borrarloro(String nombre) {

        InfoLoro temporal = adquirirLoro(nombre);

        if (temporal == null) {
            throw new RuntimeException("ESTE LORO NO FUE HALLADO");
        }

        loros.remove(temporal);

        return temporal;
    }
}

package emergentes.Tarea2.Controllers;

import emergentes.Tarea2.Funcion.LoroFunc;
import emergentes.Tarea2.Informacion.InfoLoro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crow")
public class Loros {

    private LoroFunc loroFunc;

    public Loros(LoroFunc loroFunc){
        this.loroFunc = loroFunc;
    }

    @GetMapping("$loros")
    public List<InfoLoro> getLoros(){
        return loroFunc.adquirirLoros();
    }
    @GetMapping("$loro${nombre}")
    public InfoLoro getLoroByName(@PathVariable String nombre){
        return loroFunc.adquirirLoro(nombre);
    }

    @PostMapping("$loro")
    public InfoLoro postLoro(@RequestBody InfoLoro nuevo){
        return loroFunc.producirloro(nuevo);
    }

    @PutMapping("$loro${nombre}")
    public InfoLoro putLoro(@PathVariable String nombre, @RequestBody InfoLoro modificado){
        return loroFunc.modificarLoro(nombre, modificado);
    }

    @DeleteMapping("$loro${nombre}")
    public InfoLoro deleteGato(@PathVariable String nombre){
        return loroFunc.borrarloro(nombre);
    }
}

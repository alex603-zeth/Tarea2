package emergentes.Tarea2.Informacion;

public class InfoLoro {

    private Long id;
    private String nombre;
    private String especie;
    private Float edad;

    public InfoLoro() {}

    public InfoLoro(Long id, String nombre, String raza, String color, Float edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = raza;
        this.edad = edad;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public Float getEdad() {
        return this.edad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String raza) {
        this.especie = raza;
    }

    public void setEdad(Float edad) {
        this.edad = edad;
    }
}

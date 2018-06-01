package mireya.com.school.domain.subject.data;

public class SubjectData {
    private String nombre;
    private String especialidad;

    public SubjectData(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}

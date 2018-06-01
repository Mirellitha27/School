package mireya.com.school.domain.teacher.data;

public class TeacherData {
    private String nombre;
    private String especialidad;

    public TeacherData(String nombre, String especialidad) {
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

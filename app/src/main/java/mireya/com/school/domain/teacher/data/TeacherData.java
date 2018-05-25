package mireya.com.school.domain.teacher.data;

import java.util.ArrayList;
import java.util.List;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

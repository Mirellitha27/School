package mireya.com.school.domain.ratings.data;

public class RatingsData {
    private String materia;
    private String parcial;

    public RatingsData(String materia, String parcial) {
        this.materia = materia;
        this.parcial = parcial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getParcial() {
        return parcial;
    }

    public void setParcial(String parcial) {
        this.parcial = parcial;
    }


}

package mireya.com.school.domain.chat_mine.data;

public class ChatMineData {
    private String mensaje;
    private String autor;
    private String  id;

    public ChatMineData(String mensaje, String autor, String id) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

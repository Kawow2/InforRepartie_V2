package models;

public class Classe {

    private Integer id;
    private String content;

    public Classe(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

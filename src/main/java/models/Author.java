package models;

public class Author {
    int authorId;
    String first_name;
    String last_name;

    public Author(){

    }

    public Author(int authorId, String first_name, String last_name) {
        this.authorId = authorId;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

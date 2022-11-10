package models;

public class Quotes {
    private int quoteId;
    private String content;
    private Author author;

    public Quotes() {
    }

    public Quotes(int quoteId, String content, Author author) {
        this.quoteId = quoteId;
        this.content = content;
        this.author = author;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

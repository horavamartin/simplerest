package net.horava.spring.guides.simplerest;

/**
 * @author Martin Horava
 */
public class GreetingResponse {

    private Long id;

    private String content;

    public Long getId() {
        return id;
    }

    public GreetingResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public GreetingResponse setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreetingResponse that = (GreetingResponse) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GreetingResponse{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}

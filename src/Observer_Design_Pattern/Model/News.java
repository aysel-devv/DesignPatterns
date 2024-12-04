package Observer_Design_Pattern.Model;

public class News {
    private String title;
    private String definition;

    public News(String title, String definition) {
        this.title = title;
        this.definition = definition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

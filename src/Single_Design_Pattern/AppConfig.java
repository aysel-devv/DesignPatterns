package Single_Design_Pattern;

public class AppConfig {
    private static AppConfig instance;

    private String language;

    private AppConfig() {
        this.language = "English";
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    public static AppConfig getInstance() {
        if(instance==null){
            instance=new AppConfig();
        }
        return instance;
    }
}

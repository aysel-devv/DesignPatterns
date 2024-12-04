package Single_Design_Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppConfig instance=AppConfig.getInstance();
        System.out.println(instance);
        System.out.println(instance.getLanguage());

        System.out.println("---------------------");

        AppConfig instance1=AppConfig.getInstance();
        instance1.setLanguage("Russian");
        System.out.println(instance1);
        System.out.println(instance1.getLanguage());
    }
}
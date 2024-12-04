package Observer_Design_Pattern;

import Observer_Design_Pattern.Model.News;

public class Main {
    public static void main(String[] args) {
        BusinessNews techNews=new TechNews();

        techNews.subscribe(new TechNewsSubscribers("Aysel Husein"));
        techNews.subscribe(new TechNewsSubscribers("Fuad Husein"));

        techNews.addNews(new News("Jaguar's new electric concept car divides opinion", "...\n"));
    }
}

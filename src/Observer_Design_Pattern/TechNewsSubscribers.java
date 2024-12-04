package Observer_Design_Pattern;

public class TechNewsSubscribers implements Subscribers{

    String username;
    public TechNewsSubscribers(String username) {
        this.username=username;
    }

    @Override
    public void update(BusinessNews businessNews) {
        System.out.printf("\nSubscriber's username: %sTitle: %s, \nDefinition: %s",
                username+"\n",
                businessNews.getNews1().getTitle(),
                businessNews.getNews1().getDefinition()
                );

    }

}

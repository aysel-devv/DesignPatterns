package Observer_Design_Pattern;

import Observer_Design_Pattern.Model.News;

import java.util.ArrayList;
import java.util.List;

public abstract class BusinessNews {
    private List<Subscribers> subscribersList = new ArrayList<Subscribers>();
    private List<News> newsList = new ArrayList<News>();

    public News getNews1() {
        return news1;
    }

    private News news1;

    public void subscribe(Subscribers s) {
        subscribersList.add(s);
    }

    public void unsubscribe(Subscribers s) {
        subscribersList.remove(s);
    }

    public void notifyChanges() {
        for (Subscribers s : subscribersList) {
            s.update(this);
        }

    }

    public void addNews(News news) {
        newsList.add(news);
        this.news1=news;
        notifyChanges();
    }

}

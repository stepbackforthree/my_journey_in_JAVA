package Advanced.day1.News;

import java.util.ArrayList;

public class NewsTest {
    public static void simplifiedTitle(News news) {
        if (news.getTitle().length() > 15) {
            news.setTitle(news.getTitle().substring(0, 14) + "...");
        }
    }

    public static void main(String[] args) {
        News news1 = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
        News news2 = new News("春节临近北京\"卖房热\"");
        ArrayList news = new ArrayList();
        news.add(news1);
        news.add(news2);
        for (int i = news.size() - 1; i >= 0; i--) {
            News n = (News) news.get(i);
            simplifiedTitle(n);
            System.out.println(n.toString());
        }
    }
}

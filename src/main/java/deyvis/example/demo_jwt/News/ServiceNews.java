package deyvis.example.demo_jwt.News;

import java.util.List;

public interface ServiceNews {
    public List<News> getAllNews();
    public News saveNews(News news);
    public News getByIdNews(int id);
    public void deleteNew(int id);
}

package deyvis.example.demo_jwt.News;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementationNews implements ServiceNews{
    @Autowired
    RepositoryNews repository;


    @Override
    public List<News> getAllNews() {
        return (repository.findAll());
    }

    @Override
    public News saveNews(News news) {
        return(repository.save(news));
    }

    @Override
    public News getByIdNews(int id) {
        return (repository.findById(id).orElse(null));
    }

    @Override
    public void deleteNew(int id) {
        repository.deleteById(id);
    }
}

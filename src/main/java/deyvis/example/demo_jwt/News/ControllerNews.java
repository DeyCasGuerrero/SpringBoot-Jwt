package deyvis.example.demo_jwt.News;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api/news")
@Validated
public class ControllerNews {

    private final ImplementationNews implementation;

    @Autowired
    public ControllerNews (ImplementationNews implementation){
        this.implementation=implementation;
    }

    @GetMapping("/all")
    public List<News> getAll(){
        return implementation.getAllNews();
    }

    @PostMapping("/save")
    public ResponseEntity<News> save(@RequestBody News news){
        News new_news=implementation.saveNews(news);
        return new ResponseEntity<>(new_news, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<News> updateNews(@PathVariable int id, @RequestBody News news){
        News updateNews = implementation.getByIdNews(id);
        updateNews.setTitular(news.getTitular());
        updateNews.setContenido(news.getContenido());
        updateNews.setLink(news.getLink());

        News updatedNews = implementation.saveNews(updateNews);
        return new ResponseEntity<>(updatedNews, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<HashMap<String, Boolean>> deleteNews(@PathVariable int id){
        this.implementation.deleteNew(id);
        HashMap<String, Boolean> newState = new HashMap<>();
        newState.put("New deleted", true);
        return ResponseEntity.ok(newState);
    }
}

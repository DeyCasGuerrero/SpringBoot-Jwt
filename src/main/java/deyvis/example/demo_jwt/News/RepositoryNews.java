package deyvis.example.demo_jwt.News;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryNews extends JpaRepository<News, Integer> {

}

package deyvis.example.demo_jwt.News;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_news;

    @Basic
    private String titular;

    @Column(length = 600)
    private String contenido;
    private String link;
}

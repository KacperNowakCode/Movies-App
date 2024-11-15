package movies_app_kacper.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comment {
    private String body;
    private String author;
    public Comment(String body, String author) {
        this.body = body;
    }

}

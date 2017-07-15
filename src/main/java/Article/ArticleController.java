package Article;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juho0 on 2017-07-14.
 */

@RestController
public class ArticleController {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Article> test() {
        List<Article> list = new ArrayList<Article>();

        for (int i=1; i<=10; i++) {
            Article article = new Article();
            article.setSeq(i);
            article.setText("Hi");
            article.setTitle("Good Title");
            article.setWriter("Juho Kim");

            list.add(article);
        }

        return list;
    }
}

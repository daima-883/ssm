import com.itheima.config.SpringConfig;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class aTest {
    @Autowired
    private BookService bookService;
    @Test
    public void findAll(){
        bookService.findAll().forEach(s-> System.out.println(s));
    }
}
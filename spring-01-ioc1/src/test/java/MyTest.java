import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMySQL;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //获取ApplicationContext：
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl impl = (UserServiceImpl) ApplicationContext.getBean("UserServiceImpl");
        impl.getUser();

    }
}

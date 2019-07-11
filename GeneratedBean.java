
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class GeneratedBean {


  public void runBean(String beanID, String fileName) throws  NoSuchMethodException,  IllegalAccessException, InvocationTargetException {
      ApplicationContext context = new ClassPathXmlApplicationContext(fileName);
      Object obj1 = context.getBean(beanID);
      Class c = obj1.getClass();
      Method methods = c.getMethod("runnable");
      methods.invoke(obj1);
  }


}


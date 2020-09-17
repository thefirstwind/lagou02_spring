import com.thefirstwind.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

	@Test
	public void testIoC(){
		// ApplicationContext 是容器的高级接口，BeanFactory（顶级容器、根容器，规范了容器的基础行为)
		// Spring应用上下文，官方称之为IoC容器，
		// 错误的认识， 准确的来说，map是ioc容器的一个成员
		// 构造方法执行，初始化方法：AbstractApplicationContext # refresh() # finishBeanFactoryInitialization(beanFactory)
		// InitializingBean的afterPropertiesSet：AbstractApplicationContext # refresh() # finishBeanFactoryInitialization(beanFactory)
		// BeanFactoryPostProcessor 构造方法：AbstractApplicationContext # refresh() # invokeBeanFactoryPostProcessors(beanFactory);
		// BeanFactoryPostProcessor postProcessBeanFactory：AbstractApplicationContext # refresh() # invokeBeanFactoryPostProcessors(beanFactory);
		// BeanPostProcessor 构造方法： AbstractApplicationContext # refresh() # registerBeanPostProcessors(beanFactory);
		// BeanPostProcessor postProcessBeforeInitialization：AbstractApplicationContext # refresh() # finishBeanFactoryInitialization(beanFactory);
		// BeanPostProcessor postProcessAfterInitialization：AbstractApplicationContext # refresh() # finishBeanFactoryInitialization(beanFactory);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean myBean = applicationContext.getBean(MyBean.class);
		System.out.println(myBean);
	}
}

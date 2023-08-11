package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		//bean pactory를 만들고 실행 특별히 호출하지 않아도 알아서 호출
		System.out.println("================================");
		System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory 실행");
	}

}

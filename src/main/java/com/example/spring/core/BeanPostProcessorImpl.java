package com.example.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

public class BeanPostProcessorImpl implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();  
		 cfg.setLocation(new FileSystemResource("C:/Users/sachin/workspace/springSample/src/databaseConfig.properties"));  
		 cfg.postProcessBeanFactory(arg0); 
		 System.out.println("Bean factory post processor is initialized");
		 }
		

}

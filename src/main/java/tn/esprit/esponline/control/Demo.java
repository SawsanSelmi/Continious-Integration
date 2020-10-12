package tn.esprit.esponline.control;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tn.esprit.esponline.config.BeansConfiguration;
public class Demo {
private static final Logger logger = Logger.getLogger(Demo.class);
private ApplicationContext context;

	public static void main(String[] args) { 
		Demo demo = new Demo(); 
		demo.verifyBeans(); }
	
	//Méthode verify Beans:
	public void verifyBeans () {
		logger.info("---- In verifyBeans() : ----");

		// Chargement du Conteneur Spring IoC : 
		context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		 
		logger.debug("Contains userControlImpl " + context.containsBeanDefinition("userControl"));
		logger.debug("Contains userServiceImpl " + context.containsBeanDefinition("userService"));
		logger.debug("Contains     userDAOImpl " + context.containsBeanDefinition("userDAO"));

		logger.info("---- Out of verifyBeans() ----");
	}
}
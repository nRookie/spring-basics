package io.datajek.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
@Configuration
public class AccessCheckAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	/* To find out which method calls have been intercepted,
	 *  we will use a join point as an argument to the method. The joinpoint contains the name of the method that is intercepted. We can use the joinpoint to print the name of the method as follows:
	 * */
	@Before("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		// logger.info("Intercepted method call");
		logger.info("Intercepted call before execution of: {}", joinPoint);
	}
}

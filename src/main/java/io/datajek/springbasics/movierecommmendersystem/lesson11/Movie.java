package io.datajek.springbasics.movierecommmendersystem.lesson11;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
	private static int instances = 0;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private int id;
	
	private String name;
	private String genre;
	private String producer;
	
	public Movie() {
		super();
		System.out.println("Movie constructor called");
	}
	
	@PostConstruct
    private void postConstruct() {
		//initialization code
		logger.info("In Movie postConstruct method");
	}

	@PreDestroy
	private void preDestroy() {
		//cleanup code
		logger.info("In Movie preDestroy method");
	}	
	
	public double movieSimilarity(int movie1, int movie2) {

		double similarity = 0.0;
		
		//if genres are same add 0.3 to similarity
		//if producers are same add 0.5 to similarity
		 
		return similarity;
	}
}

package io.datajek.springbasics.movierecommmendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommmenderSystemApplication.class, args);
		
		System.out.println("Calling getBean() on RecommenderImplementation");
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);	
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
		
	    System.out.println("Calling getBean() on RecommenderImplementation2");
	    RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class); 
		
		result = recommender2.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	}

}

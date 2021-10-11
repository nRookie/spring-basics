package io.datajek.springbasics.movierecommmendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommmenderSystemApplication.class, args);
		
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
  		System.out.println();
    	System.out.println();
		System.out.println(recommender);
   	
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
				
		//display results
		System.out.println();
    	System.out.println();
		System.out.println(Arrays.toString(result));
	}

}

package io.datajek.springbasics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommmenderSystemApplication.class, args);
		
  		System.out.println();
  		
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		
		System.out.println(recommender);
   	
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
				
		System.out.println();
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);
		
		System.out.println();
		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);
		
		System.out.println();
	}

}

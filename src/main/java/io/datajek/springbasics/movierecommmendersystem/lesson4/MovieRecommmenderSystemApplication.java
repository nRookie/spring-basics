package io.datajek.springbasics.movierecommmendersystem.lesson4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommmenderSystemApplication.class, args);
	
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	}

}

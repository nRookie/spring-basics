package io.datajek.springbasics.movierecommendersystem.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {
        RecommenderImplementation recommender = new 
RecommenderImplementation();    
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
	}

}

package io.datajek.springbasics.movierecommmendersystem.lesson6;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class RecommenderImplementation {
    //...
	@Autowired
	@Qualifier("CBF")
	private Filter filter;
	

	public String[] recommendMovies (String movie) {
		//use content based filter to find similar movies

		System.out.println("Name of the filter in use: " + filter + "\n");

		String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
	}
}

 
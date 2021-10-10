package io.datajek.springbasics.movierecommmendersystem.lesson5;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
    //...
	@Autowired
	private Filter contentBasedFilter;
	

	public String[] recommendMovies (String movie) {
		//use content based filter to find similar movies

		System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");

		String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        //return the results
        return results;
	}
}

 
package io.datajek.springbasics.movierecommmendersystem.lesson4;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
    //...
	@Autowired
	private Filter filter;
	
	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}
	public String[] recommendMovies (String movie) {
		//use content based filter to find similar movies

		System.out.println("Name of the filter in use: " + filter + "\n");

		String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
	}
}

 
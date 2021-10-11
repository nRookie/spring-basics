package io.datajek.springbasics.movierecommmendersystem.lesson9;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class RecommenderImplementation {
    //...

	private Filter filter;
	@Autowired // it is optional when using constructors
	public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
	    this.filter = filter;
	    System.out.println("Constructor invoked...");
	}
	
	public String[] recommendMovies (String movie) {
		//use content based filter to find similar movies

		System.out.println("Name of the filter in use: " + filter + "\n");

		String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
	}
}

 
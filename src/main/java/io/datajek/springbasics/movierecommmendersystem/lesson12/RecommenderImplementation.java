package io.datajek.springbasics.movierecommmendersystem.lesson12;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class RecommenderImplementation {
    //...
    @Inject
    @Qualifier("CF")
	private Filter filter;
	

	public Filter getFilter() {
		return filter;
	}
	
	public String[] recommendMovies (String movie) {
		//use content based filter to find similar movies

		System.out.println("Name of the filter in use: " + filter + "\n");

		String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
	}
}

 
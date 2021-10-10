package io.datajek.springbasics.movierecommmendersystem.lesson2;

public class RecommenderImplementation {

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



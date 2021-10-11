package io.datajek.springbasics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		
		//for keeping track of instances created

		//implement logic of content based filter
		
		//return movie recommendations
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}
	private static int instances= 0;
	
	@Autowired
	private Movie movie;
	
	public ContentBasedFilter() {
		super();
		instances++;
		System.out.println("ContentBasedFilter constructor called");
	}
	
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
}
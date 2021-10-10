package io.datajek.springbasics.movierecommmendersystem.lesson6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("CBF")
@Primary
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie) {
		
		//implement logic of content based filter
		
		//return movie recommendations
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}
}
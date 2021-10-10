package io.datajek.springbasics.movierecommmendersystem.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class CollaborativeFilter implements Filter{
	 
    public String[] getRecommendations(String movie) {
       //logic of collaborative filter
    	return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
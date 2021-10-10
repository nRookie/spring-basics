package io.datajek.springbasics.movierecommmendersystem.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter{
	 
    public String[] getRecommendations(String movie) {
       //logic of collaborative filter
    	return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
package io.datajek.springaop.movierecommenderaop;

import org.springframework.stereotype.Repository;

@Repository
public class User {
	public String getUserDetails() {
		return "user details";
	}
}

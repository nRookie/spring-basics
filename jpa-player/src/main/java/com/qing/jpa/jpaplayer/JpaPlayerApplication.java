package com.qing.jpa.jpaplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class JpaPlayerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PlayerRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpaPlayerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));

	    logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
	            new Player("Thiem", "Austria", 
	                                  new Date(System.currentTimeMillis()), 17)));	
        //update player
        logger.info("\n\n>> Updating Player with Id 3: {}\n", repo.updatePlayer(
            new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
        //get player
        logger.info("\n\n>> Player with id 3: {}\n", repo.getPlayerById(3));
        //delete player
        repo.deletePlayerById(2);
        //get all players
        logger.info("\n\n>> All Players Data: {}", repo.getAllPlayers());
	}

}

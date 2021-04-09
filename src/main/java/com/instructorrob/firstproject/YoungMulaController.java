package com.instructorrob.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class YoungMulaController {
	
	@RequestMapping("")
	public String allPlayers() {
		return "Placeholder to later show all the players";
	}
	
	@RequestMapping("/teams/")
	public String findPLayersOnATeam(@RequestParam(value="q") String searchQuery) {
        return "You searched for: " + searchQuery;
    }
//	public String showPlayersFromOneTeam(@RequestParam(value="q" String searchQuery)) {
//		return "Placeholder to show all players from the team: " + searchQuery;
//	}
	@RequestMapping("/info/")
	public String getOnePlayer(@RequestParam(value="q", required=false) String searchQuery,
			@RequestParam(value="anotha", required=false) String anotherQuery
			) {
		System.out.println(searchQuery);
		System.out.println("another query " + anotherQuery);
		if(searchQuery==null) {
			return "You searched for nobody so you just gona get info about the goat, Lebron James";
		}
		return "You searched for player: " + searchQuery;
	}
	
	
	

}

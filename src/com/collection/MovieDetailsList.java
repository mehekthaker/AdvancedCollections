package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//Creates a TreeSet of type MovieDetails and incorporates add_movie, remove_movie, remove_AllMovies
//find_movie_by_moviename, find_movie_by_genre and also sorts the movie according to the entered parameter.
public class MovieDetailsList {

	public TreeSet<MovieDetails> movies=new TreeSet<>();
	int flag=0;
	

	public void add_movie(MovieDetails movie)
	{
		movies.add(movie);
	}

	
	public void remove_movie(MovieDetails movie)
	{
		movies.remove(movie);
	}

	
	public void remove_AllMovies()
	{
		movies.removeAll(movies);
	}

	
	public void find_movie_By_mov_Name(String movieName) 
	{
		for(MovieDetails mov:movies) {
			if(mov.getMov_Name().equals(movieName)) {
				flag=1;
				System.out.println(mov);
			}	
		}
		if(flag==0)
			System.out.println("Movie with name "+movieName+" not found");
	}

	
	
	public void find_movie_By_Genre(String genre) 
	{
		for(MovieDetails mov:movies) {
			if(mov.getGenre().equals(genre)) {
				flag=1;
				System.out.println(mov);
			}
		}	
		if(flag==0)
			System.out.println("Movie with genre "+genre+" not found");
	}

	
	
	public void decide_sort(int choice) {
		ArrayList<MovieDetails> movieSetList= new ArrayList<>(movies);

		Comparator<MovieDetails> compareByMovieName = (movie1,movie2) -> movie1.getMov_Name().compareTo(movie2.getMov_Name());
		Comparator<MovieDetails> compareByLeadActor = (movie1,movie2) -> movie1.getLead_actor().compareTo(movie2.getLead_actor());
		Comparator<MovieDetails> compareByLeadActress = (movie1,movie2) -> movie1.getLead_actress().compareTo(movie2.getLead_actress());
		Comparator<MovieDetails> compareByGenre = (movie1,movie2) -> movie1.getGenre().compareTo(movie2.getGenre());

		switch(choice)
		{
		case 1: Collections.sort(movieSetList, compareByMovieName);
			    break;
		case 2: Collections.sort(movieSetList, compareByLeadActor);
				break;
		case 3: Collections.sort(movieSetList, compareByLeadActress);
				break;
		case 4: Collections.sort(movieSetList, compareByGenre);
				break;
		default:System.out.println("Invalid choice");
				break;
		}

	}

	
}

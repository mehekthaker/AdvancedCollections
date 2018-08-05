package com.collection.test;

import java.util.Scanner;

import com.collection.MovieDetails;
import com.collection.MovieDetailsList;

public class MovieDetailsTest {

	public static void main(String[] args) {
		
		//Creates instances of class and adds the movie, removes the movie from the list, also finds the movie by movie name,
		//genre and sorts the movies given a particular parameter and displays the result
		MovieDetailsList movieList=new MovieDetailsList();
		MovieDetails movie=new MovieDetails("abcc","asd","dsft","cdfr");
		MovieDetails movie1=new MovieDetails("fvsdv","tfrgt","dsft","cythdfr");
		MovieDetails movie2=new MovieDetails("htn","bvtrf","dsft","cdfuyjr");
		MovieDetails movie3=new MovieDetails("abcgbuyc","utyh","dsft","cdfujiir");
		MovieDetails movie4=new MovieDetails("abcgbuycgh","bvtrf","dsft","cdfujiir");

		movieList.add_movie(movie);
		movieList.add_movie(movie1);
		movieList.add_movie(movie2);
		movieList.add_movie(movie3);
		movieList.add_movie(movie4);

		movieList.remove_movie(movie2);

		movieList.movies.stream().forEach(System.out::println);

		movieList.find_movie_By_Genre("cdfr");
		movieList.find_movie_By_mov_Name("htn");

		System.out.println("Enter number according to choice\n1: Sort by movie name\n2: Sort by lead actor\n3: Sort by lead actress\n4: Sort by genre");
		Scanner scanner =new Scanner(System.in);
		int choice=scanner.nextInt();
		movieList.decide_sort(choice);

		movieList.movies.stream().forEach(System.out::println);
	}


}



package com.deloitte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieCount {

	public static void main(String[] args) {
		int id;
		String name, showDate, showTime, status;
		
		List<Movie> movieList = new ArrayList<>();
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of movies");
		int numberOfMovies = scan.nextInt();
		System.out.println("Please enter the following details");
		System.out.println("ID, name, showdate, showtime, status");

		for (int i = 0; i < numberOfMovies; i++) {
			
			id = scan.nextInt();
			name = scan.next();
			showDate = scan.next();
			showTime = scan.next();
			status = scan.next();
			
			movieList.add(new Movie(id, name, showDate, showTime, status));

		}
		System.out.println("Enter id of movie to get details about it");
		int searchId = scan.nextInt();
		Movie element = movieList.get(--searchId); 
		System.out.println(element);
	}}

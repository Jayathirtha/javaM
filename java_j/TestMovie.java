package java_mph;

import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Movies");

		Movie[] movies = new Movie[scan.nextInt()];

		for (int i = 0; i < movies.length; i++) {

			movies[i] = new Movie();
			System.out.println("Enter Movie name");
			movies[i].setName(scan.next());
			System.out.println("Enter Released Year");
			movies[i].setYear(scan.nextInt());
			
			System.out.println("Enter number of Actors");
			Actor[] actors = new Actor[scan.nextInt()];
			for(int j=0;j<actors.length;j++) {
				actors[j] = new Actor();
				System.out.println("Enter Actor"+(j+1)+" name");
				actors[j].setName(scan.next());
				System.out.println("Enter Role");
				actors[j].setRole(scan.next());
			}
			
			movies[i].setActors(actors);

		}
		for (Movie m : movies) {
			m.printMovies();
		}
	

	}

}
package java_mph;

public class Movie {

	private String name;
	private int year;
	private Actor[] actors;
	
	public Movie() {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Actor[] getActors() {
		return actors;
	}


	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	
	
	
	public void printMovies() {
		System.out.println("Movie Name = "+name);
		System.out.println("Released year = "+ year);
		for (Actor act: actors) {
			act.printActors();
		}
	}
}
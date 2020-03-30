package cgv.deagu.model;

import java.util.ArrayList;

public class MovieManager {
	private ArrayList<Movie> list = null;
	
	public MovieManager() {
		if(list == null) {
			list = new ArrayList<>();
		}
	}
	
	public void addMovie(Movie movie) {
		list.add(movie);
	}
	
	public ArrayList<Movie> getList(){
		return list;
	}
}

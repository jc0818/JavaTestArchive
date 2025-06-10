package MovieProgram;

import java.util.ArrayList;
import java.util.HashMap;

public class ReservationManager {
//String = 고객 이름 
	HashMap<String, ArrayList<Movie>> reservations = new HashMap<>();
	
	public void addCustmor(String name)
	{
		reservations.put(name, new ArrayList<>());
	}
	
	public void listMovieAdd(String name, String title,int duration, String geren)
	{
		ArrayList<Movie> mmoo = reservations.get(name);
		Movie m = new Movie(title, duration, geren);
		if(mmoo != null)
		{
			mmoo.add(new Movie(title, duration, geren));
		}
	}
	
	public String printAllreservations() {
	    if(reservations.isEmpty()) {
	        return "예약 내역이 없음.";
	    }
	    StringBuilder sb = new StringBuilder();
	    for(String name : reservations.keySet()) {
	        ArrayList<Movie> movies = reservations.get(name);
	        for (Movie movie : movies) {
	            sb.append(name).append(" - ").append(movie.toString()).append("\n");
	        }
	    }
	    return sb.toString();
	}

	
	public String printMoviesByGenre(String name, String genre) {
	    ArrayList<Movie> movies = reservations.get(name);
	    if (movies == null) {
	        return "고객이 존재하지 않습니다.";
	    }
	    StringBuilder sb = new StringBuilder();
	    for (Movie movie : movies) {
	        if (movie.getGenre().equalsIgnoreCase(genre)) {
	            sb.append(name).append(" - ").append(movie.toString()).append("\n");
	        }
	    }
	    if (sb.length() == 0) {
	        return "해당 장르의 영화가 없습니다.";
	    }
	    return sb.toString();
	}
   
	
}

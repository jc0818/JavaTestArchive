package MovieProgram;

public class Movie {
	private String title;
	private int duration;
	private String genre;
	
	public Movie(String title,int duration,String genre)
	{
		this.title = title;
		this.duration = duration;
		this.genre = genre;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "영화 제목 : " + title + "\n상영시간 : " + duration + "분\n장르 : " + genre;
	}
	
}

public class Movie {
    private String title;
    private String director;
    private int year;
    private String type;
    
    public Movie(String title,String director,int year,String type){
        this.title = title;
        this.director = director;
        this.year = year;
        this.type = type;
        
    }
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public String getType(){
        return type;
    }
    public String toString(){
        return ("- Title: "+title+"\n  Director: "+director+"\n  Type: "+type+"\n  Year: "+year+"\n");
    }
            
}

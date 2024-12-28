public class MovieCollection {
    private Movie[] movieCollection;
    private int numMovies;
    
    /*Constructor: Initializes the movie collection with a 
    maximum capacity (e.g., 100)*/
    public MovieCollection(){
        movieCollection = new Movie[100];
        numMovies=0;
    }
    //Method to check if the collection is empty,it will return true,otherwise false
    public boolean isEmpty(){
        return numMovies == 0;
    }
    public void addMovie(Movie movie){
        if(numMovies<movieCollection.length){
            movieCollection[numMovies]=movie;
            numMovies++;
        }
        else
            System.out.println("The movie collection is full.");
        
    }
    public void removeMovie(String title){
        boolean found = false;
        for(int i =0; i<numMovies;i++){
            if(movieCollection[i].getTitle().equalsIgnoreCase(title)){
                for(int j=1;j<numMovies-1;j++){
                    movieCollection[j]=movieCollection[j+1];
                }
                movieCollection[numMovies-1]=null;
                numMovies--;
                System.out.println("Removed movie: "+title);
                found = true;
                break;
            }}
            if(!found)
                System.out.println("Movie with title: '"+title+"'is not found.");
            
    }
    public void findmovieCollectionByDirector(String director){
        boolean found = false;
        System.out.println("Movies directed by '"+director+"':");
        for(int i =0;i<numMovies;i++){
            if(movieCollection[i].getDirector().equalsIgnoreCase(director)){
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        if(!found)
            System.out.println("no movies found for director: "+director);
    }
    public void findMovieByTitle(String title){
        for(int i=0;i<numMovies;i++){
            if(movieCollection[i].getTitle().equalsIgnoreCase(title)){
                System.out.println("Movie '"+title+"' found.");
                System.out.println(movieCollection[i]);
                return;
            }
        }
        System.out.println("Movie with the title '"+title+"' not found.");
        
    } 
    public void sortmovieCollectionByReleaseYear(){
        for(int i =0;i<numMovies-1;i++){
            for(int j =0;j<numMovies-1-i;j++){
                if(movieCollection[j].getYear()>movieCollection[j+1].getYear()){
                    Movie temp = movieCollection[j];
                    movieCollection[j]= movieCollection[j+1];
                    movieCollection[j+1]= temp;
                }
            }
        }
        
    }
    
    public void findmovieCollectionByReleaseYearRange(int startYear,int endYear){
        boolean found = false;
        System.out.println("Movie released between "+startYear+" and "+endYear);
        for(int i =0;i<numMovies;i++){
            if(movieCollection[i].getYear()>=startYear&&movieCollection[i].getYear()<=endYear){
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No movies found betweem "+startYear+" and "+ endYear);
        }
    }
    public void displayCollection(){
        if(isEmpty())
            System.out.println("The movie collection is empty");
        else{
            for(int i=0;i<numMovies;i++){
                System.out.println(movieCollection[i]);
            }
        }
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie m2 = new Movie("Hello World PG Movie", "GenSpark");
        Movie m3 = new Movie("Sample R movie", "sample studio", "R");
        Movie m4 = new Movie("Nice PG Movie", "Nice Studio");
        Movie[] mArr = {m1, m2, m3, m4};
        Movie[] pgMovies = getPG(mArr);

        for (int i = 0; i < pgMovies.length; i++) {
            System.out.println("Method 1: PG Movie is: " + pgMovies[i].getInfo() );
        }



        Movie[] pgMovies2 = getPGMovies(mArr);

        for (int i = 0; i < pgMovies2.length; i++) {
            System.out.println("Final PG Movie is: " + pgMovies2[i].getInfo() );
        }



    }

    static Movie[] getPG(Movie[] movies) {
        int count = 0;

        for (int i = 0; i < movies.length; i++) {


            System.out.println("Movies are : " + movies[i].getTitle());
            if (movies[i].getRating().equalsIgnoreCase("PG")) {
                count++;
            }
        }


        Movie[] pgList = new Movie[count];

            int j = 0;

            for (int i = 0; i < movies.length; i++) {
                System.out.println("Movies are : " + movies[i].getTitle());
                if (movies[i].getRating().equalsIgnoreCase("PG")) {
                    pgList[j] = movies[i];
                    System.out.println("PG Movies are : " + pgList[j].getTitle());
                    j++;
                }

            }
            return pgList;
    }

    static Movie[] getPGMovies(Movie[] allMovies) {
        ArrayList<Movie> pgMovies = new ArrayList<Movie>();
        //pgMovies = (ArrayList<Movie>) Arrays.asList(allMovies);
        //ArrayList<Movie> pgMovies = new ArrayList<>();
        //Collections.addAll(pgMovies, allMovies);
        for (int i = 0; i < allMovies.length; i++) {
            if (allMovies[i].getRating().equalsIgnoreCase("PG")) {
                System.out.println("PG Movie name : " + allMovies[i].getInfo());
                pgMovies.add(allMovies[i]);
            }
        }
        return pgMovies.toArray(new Movie[pgMovies.size()]);
    }
}


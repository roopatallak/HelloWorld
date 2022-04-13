public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie (String s1, String s2, String s3) {
        title = s1;
        studio = s2;
        rating = s3;
    }

    public Movie (String s1, String s2) {
        title= s1;
        studio = s2;
        rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return title + " " + "Studio: " + studio + " Rating" + rating;
    }
}

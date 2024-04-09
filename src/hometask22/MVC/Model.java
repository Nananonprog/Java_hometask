package hometask22.MVC;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Movie> movies;
    private String dbName;

    public Model() {
        this.dbName = "db.txt";
            this.movies = loadData();

    }

    public void addMovie(Map dictMovie) {
        Movie movie = new Movie(dictMovie);
        movies.put((String) dictMovie.get("название"), movie);
    }

    public Collection getAllMovies() {
        return movies.values();
    }

    public Map getSingleMovie(String userTitle) {
        Movie movie = this.movies.get(userTitle);
        Map<String, String> dictMovie = new LinkedHashMap<>();
        dictMovie.put("название", movie.getTitle());
        dictMovie.put("жанр", movie.getGenre());
        dictMovie.put("режиссер", movie.getProd());
        dictMovie.put("год выпуска", movie.getYear());
        dictMovie.put("длительность", movie.getTime());
        dictMovie.put("студия", movie.getStudio());

        return dictMovie;
    }

    public Movie removeMovie(String userTitle) {
        return movies.remove(userTitle);
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbName))) {
            oos.writeObject(this.movies);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.dbName))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex) {
            return new LinkedHashMap<>();
        }
    }
}

        class Movie implements Serializable {
            private String title;
            private String genre;
            private String prod;
            private String year;
            private String time;
            private String studio;
            private String actors;

            public Movie(Map dictMovie) {
                this.title = (String) dictMovie.get("название");
                this.genre = (String) dictMovie.get("жанр");
                this.prod = (String) dictMovie.get("режиссер");
                this.year = (String) dictMovie.get("год выпуска");
                this.time = (String) dictMovie.get("длительность");
                this.studio = (String) dictMovie.get("студия");
                this.actors = (String) dictMovie.get("актера");
            }

            public String getTitle() {
                return title;
            }

            public String getGenre() {
                return genre;
            }

            public String getProd() {
                return prod;
            }

            public String getYear() {
                return year;
            }

            public String getTime() {
                return time;
            }

            public String getStudio() {
                return studio;
            }

            public String getActors() {
                return actors;
            }

            @Override
            public String toString() {
                return this.title + "(Режиссер: " + this.prod +" Год: " + this.year + " Жанр: " + this.genre + ")";
            }
        }


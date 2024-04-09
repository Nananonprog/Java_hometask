package hometask22.MVC;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model movieModel;
    private View userInterface;

    public Controller() {
        this.movieModel = new Model();
        this.userInterface = new View();
    }

    public void run() {
        String answer = "";
        while (!answer.equals("q")) {
            answer = this.userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }

    public void checkUserAnswer(String answer) {
        if(answer.equals("1")){
            Map movies = this.userInterface.addUserMovies();
            this.movieModel.addMovie(movies);
        }else if(answer.equals("2")) {
            Collection movies = this.movieModel.getAllMovies();
            this.userInterface.showAllMovies(movies);
        }else if (answer.equals("3")){
            String movieTitle = this.userInterface.getUserMovie();
            try {
                Map movie = this.movieModel.getSingleMovie(movieTitle);
                this.userInterface.showSingleMovie(movie);
            }catch (NullPointerException npe){
                this.userInterface.showIncorrectTitleError(movieTitle);
            }
        }else if (answer.equals("4")) {
            String movieTitle = this.userInterface.getUserMovie();
            Movie title = this.movieModel.removeMovie(movieTitle);
            this.userInterface.removeSingleMovie(title);
        }else if (answer.equals("q")) {
                this.movieModel.saveData();
        }else{
            this.userInterface.showIncorrectAnswerError(answer);
        }
    }
}

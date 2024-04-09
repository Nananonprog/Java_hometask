package hometask22.MVC;

import java.util.*;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer() {
        System.out.println("============== Редактирование данных каталога фильмов ==============");
        System.out.println("Действия с фильмами:");
        System.out.println("1 - добавление фильма" +
                "\n2 - каталог фильмов"+
                "\n3 - просмотр определенного фильма" +
                "\n4 - удаление фильма" +
                "\nq - выход из программы");
        System.out.println("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("====================================================================");
        return userAnswer;

    }
    public Map addUserMovies(){
        Map<String, String> dictMovies = new LinkedHashMap<>();
        dictMovies.put("название", "");
        dictMovies.put("жанр", "");
        dictMovies.put("режиссер", "");
        dictMovies.put("год выпуска", "");
        dictMovies.put("длительность", "");
        dictMovies.put("студия", "");


        System.out.println("============== Добавление фильма  ==============");
        dictMovies.forEach((key, value) -> {
            System.out.print("Введите " + key + " фильма: ");
            dictMovies.put(key, input.nextLine());
        });
        System.out.println("================================================");
        return dictMovies;
    }
    public void showAllMovies(Collection movies) {
        System.out.println("================= Список фильмов =================");
        movies.forEach((element) -> {
            System.out.println(element);
        });
        System.out.println("==================================================");
    }

    public String getUserMovie(){
        System.out.println("============== Ввод названия фильма ==============");
        System.out.print("-> ");
        String user_movie = input.nextLine();
        System.out.println("===================================================");
        return user_movie;
    }

    public void showSingleMovie(Map movie){
        System.out.println("============== Просмотр фильма ==============");
        movie.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        System.out.println("=============================================");
    }
    public void showIncorrectTitleError(String userTitle){
        System.out.println("============== Сообщение об ошибке ==============");
        System.out.println("Фильм с названием " + userTitle + " не существует");
        System.out.println("=================================================");
    }
    public void removeSingleMovie(Movie movie){
        System.out.println("============== Удаление фильма ==============");
        System.out.println("Фильм " + movie + " - был удален");
        System.out.println("=============================================");
    }

    public void showIncorrectAnswerError(String answer){
        System.out.println("============== Сообщение об ошибке ==============");
        System.out.println("Варианта " + answer + " не существует");
        System.out.println("=================================================");
    }
}

package PACKAGE_NAME.MadNews;

import java.time.LocalDate;

public class Main {
    News<Category<String>, Author> news = new News<>("Eurovision",
            new Category<String>("music"), new Author("Emin", "Aga"),
            LocalDate.of(2024,12,13));

}

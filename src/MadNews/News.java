package PACKAGE_NAME.MadNews;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News <C extends Category,A extends Author>{
    private String name;
    private C category;
    private A author;
    private LocalDate time;


    public News(String name, C category, A author, LocalDate time) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.time = time;
    }
    public void displayInfo(){
        System.out.println("News name " + getName());
        System.out.println("News` author " + getAuthor());
        System.out.println("News` category " + getCategory());
        System.out.println("News` press time " + getFormatDate());

    }

    public String getFormatDate(){
       return time.format(DateTimeFormatter.ofPattern("dd/MMMM/yy"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        this.category = category;
    }

    public A getAuthor() {
        return author;
    }

    public void setAuthor(A author) {
        this.author = author;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

}

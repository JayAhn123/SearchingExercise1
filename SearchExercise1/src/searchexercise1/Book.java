package searchexercise1;

import java.util.Objects;

/* Jay Ahn
 * Nov 17 2025
 * Book Class
 */
public class Book {

    private int rNum;
    private String title;

    /**
     * primary constructor that instantiates and initializes the book object
     */
    public Book() {
        rNum = 0;//sets reference number to 0
        title = "";//sets title to empty string
    }

    /**
     * secondary constructor that instantiates and initializes the book object
     * from the parameter
     *
     * @param rNum - reference number of the book
     * @param title - title of the book
     */
    public Book(int rNum, String title) {
        this();
        this.rNum = rNum;
        this.title = title;
    }

    public int getrNum() {
        return rNum;
    }

    public String getTitle() {
        return title;
    }

    public void setrNum(int rNum) {
        this.rNum = rNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "rNum=" + rNum + ", title=" + title + '}';
    }

}

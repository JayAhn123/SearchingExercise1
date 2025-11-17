package searchexercise1;

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
}

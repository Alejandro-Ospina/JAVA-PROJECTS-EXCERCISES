
package Entity;


// @author new53
 
public class Book {
    private String nameAuthor, bookName;
    private int copyBookNumber, copyBookBorrowed;

    public Book() {
    }

    public Book(String nameAuthor, String bookName, int copyBookNumber, int copyBookBorrowed) {
        this.nameAuthor = nameAuthor;
        this.bookName = bookName;
        this.copyBookNumber = copyBookNumber;
        this.copyBookBorrowed = copyBookBorrowed;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCopyBookNumber() {
        return copyBookNumber;
    }

    public void setCopyBookNumber(int copyBookNumber) {
        this.copyBookNumber = copyBookNumber;
    }

    public int getCopyBookBorrowed() {
        return copyBookBorrowed;
    }

    public void setCopyBookBorrowed(int copyBookBorrowed) {
        this.copyBookBorrowed = copyBookBorrowed;
    }

    @Override
    public String toString() {
        return "\nBOOK DATA..." + "\n[" +
                "\nBook name: " + bookName + 
                "\nAuthor name: " + nameAuthor + 
                "\nNumber of copies: " + copyBookNumber + 
                "\nNumber of borrowed copies: " + copyBookBorrowed + "\n]";
    }
}
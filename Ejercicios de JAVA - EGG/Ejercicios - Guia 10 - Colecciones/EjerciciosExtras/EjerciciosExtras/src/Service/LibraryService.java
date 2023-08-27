
package Service;

import Entity.Book;
import java.util.HashSet;
import java.util.Scanner;


// @author new53
 
public class LibraryService {
    private static final HashSet<Book> bookList = new HashSet();
    private static final Scanner read = new Scanner(System.in);
    
    public static void addBookToList(){
        System.out.print("Book title: ");
        while(true){
            Book book = new Book();           
            book.setBookName(read.nextLine());
            System.out.print("Author name: ");
            book.setNameAuthor(read.nextLine());
            System.out.print("Number of copies: ");
            book.setCopyBookNumber(read.nextInt());
            read.nextLine();
            book.setCopyBookBorrowed(0); //Initialize the borrowed copies in 0
            bookList.add(book);
            System.out.print("\n¿Would you like to add another book to list? (y/n): ");
            String answer = read.nextLine();
            if(answer.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.print("\nAdd another book title: ");
            }
        }
    }
    
    public static boolean borrowBook(){
        boolean isInSet = false;
        System.out.print("Write the book you wish to borrow: ");
        String borrowedBook = read.nextLine();
        for(Book book : bookList){
            if(book.getBookName().equalsIgnoreCase(borrowedBook)){
                if(book.getCopyBookNumber() > 0){
                    book.setCopyBookNumber(book.getCopyBookNumber() - 1);
                    book.setCopyBookBorrowed(book.getCopyBookBorrowed() + 1);                   
                    isInSet = true;
                    return true;
                }else{
                    System.out.println("¡There are not more copies for the book you are looking up!");
                    return false;
                }
            }
        }
        return false;
    }
    
    public static boolean bookDevolution(){
        boolean isInSet = false;
        System.out.print("Write the book you wish to return: ");
        String returnBook = read.nextLine();
        for(Book book : bookList){
            if(book.getBookName().equalsIgnoreCase(returnBook)){               
                book.setCopyBookNumber(book.getCopyBookNumber() + 1);                                     
                isInSet = true;
                return true;              
            }
        }
        return false;
    }
    
    public static void libraryDetails(){
        System.out.println(bookList);
    }
}
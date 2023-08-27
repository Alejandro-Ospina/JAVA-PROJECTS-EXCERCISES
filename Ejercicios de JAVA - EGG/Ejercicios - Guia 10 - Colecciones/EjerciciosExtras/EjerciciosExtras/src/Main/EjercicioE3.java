
package Main;

//  @author new53

import Service.LibraryService;

public class EjercicioE3 {

    public static void main(String[] args) {
        LibraryService.addBookToList();
        LibraryService.borrowBook();
        LibraryService.bookDevolution();
        LibraryService.libraryDetails();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ac.iit.Resources;

/**
 *
 * @author melzjoanne
 */




import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import lk.ac.iit.Exceptions.BookNotFoundException;
import lk.ac.iit.Models.Book;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    // In-memory data store for books (this would typically be a database)
    private static List<Book> books = new ArrayList<>();
    private static long currentId = 1;  // Simulating auto-incremented ID for each book

    // Get all books
    @GET
    public Response getAllBooks() {
        return Response.ok(books).build();
    }

    // Get book by ID
    @GET
    @Path("/{id}")
    public Response getBook(@PathParam("id") Long id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return Response.ok(book).build();
            }
        }
        throw new BookNotFoundException("Book with ID " + id + " not found");
    }

    // Create a new book
    @POST
    public Response createBook(Book book) {
        book.setId((int) currentId++);
        books.add(book);
        return Response.status(Response.Status.CREATED)
                .entity(book)
                .build();
    }

    // Update an existing book
    @PUT
    @Path("/{id}")
    public Response updateBook(@PathParam("id") Long id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book existingBook = books.get(i);
            if (existingBook.getId() == id) {
                // Update the book information
                existingBook.setTitle(book.getTitle());
                existingBook.setAuthorId(book.getAuthorId());
                existingBook.setIsbn(book.getIsbn());
                existingBook.setPublicationYear(book.getPublicationYear());
                existingBook.setPrice(book.getPrice());
                existingBook.setStock(book.getStock());
                return Response.ok(existingBook).build();
            }
        }
        throw new BookNotFoundException("Book with ID " + id + " not found");
    }

    // Delete a book
    @DELETE
    @Path("/{id}")
    public Response deleteBook(@PathParam("id") Long id) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                books.remove(i);
                return Response.status(Response.Status.NO_CONTENT).build();
            }
        }
        throw new BookNotFoundException("Book with ID " + id + " not found");
    }
}

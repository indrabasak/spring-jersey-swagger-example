package com.basaki.controller;

import com.basaki.data.entity.Book;
import com.basaki.model.BookRequest;
import com.basaki.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * {@code BookController} exposes book API.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/28/17
 */
@Component
@Api(value = "Book API")
@Path("/books")
@Slf4j
public class BookController {

    private BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Creates a book", response = Book.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Book.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public Book create(BookRequest request) {
        return service.create(request);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    @ApiOperation(value = "Retrieves a book based on ID.", response = Book.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Book.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public Book read(@PathParam("id") UUID id) {
        return service.read(id);
    }
}
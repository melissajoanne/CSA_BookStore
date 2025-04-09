/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ac.iit.Exceptions;

/**
 *
 * @author melzjoanne
 */

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class mapper implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getClass().getSimpleName());
        error.put("message", ex.getMessage());

        int status = switch (ex.getClass().getSimpleName()) {
            case "BookNotFoundException", "AuthorNotFoundException", "CustomerNotFoundException", "CartNotFoundException" -> 404;
            case "InvalidInputException", "OutOfStockException" -> 400;
            default -> 500;
        };

        return Response.status(status).entity(error).build();
    }
}
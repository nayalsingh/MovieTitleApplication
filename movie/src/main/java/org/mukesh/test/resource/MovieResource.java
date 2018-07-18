package org.mukesh.test.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.mukesh.test.service.MovieService;

@Path("/api/movies/search")
public class MovieResource {
MovieService service=new MovieService();
    @GET
    @Produces (value={MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})//in case JSON and XML format is needed 
    public String[] getMovies(@QueryParam("Title") String title) {
    	System.out.println("title is "+title);       
        return service.getMoviesList(title);
    }
}
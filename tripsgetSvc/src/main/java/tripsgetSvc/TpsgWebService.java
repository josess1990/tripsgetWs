package tripsgetSvc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
  
@Path("/tpsgWebSvcs")
public class TpsgWebService {
  
    @GET
    @Path("getHotel/{city}")
    public Response getHotel(@PathParam("city") String city) {
  
        String output = "Welcome   : " + city;
  
        return Response.status(200).entity(output).build();
  
    }
    
    @GET
    @Path("getRestaurant/{city}")
    public Response getRestaurant(@PathParam("city") String city) {
  
        String output = "Welcome2   : " + city ;
  
        return Response.status(200).entity(output).build();
  
    }
}
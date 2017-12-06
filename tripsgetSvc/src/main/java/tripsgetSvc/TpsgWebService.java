package tripsgetSvc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.api.client.ClientResponse.Status;
  
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
    
    @GET
    @Path("getPrice")
    public Response getPrice(
    		@QueryParam("cityId") String cityId,
    		@QueryParam("travellers") String travellers,
    		@QueryParam("days") String days,
    		@QueryParam("transportLvl") String transportLvl,
    		@QueryParam("partyLvl") String partyLvl,
    		@QueryParam("foodLvl") String foodLvl,
    		@QueryParam("hotelLvl") String hotelLvl,
    		@QueryParam("startDate") String startDate,
    		@QueryParam("endDate") String endDate,
    		@QueryParam("transportBudget") String transportBudget,
    		@QueryParam("partyBudget") String partyBudget,
    		@QueryParam("foodBudget") String foodBudget,
    		@QueryParam("hotelBudget") String hotelBudget,
    		@QueryParam("entertainmentBudget") String entertainmentBudget
    		) {
        Response response = null;
        JSONObject object = null;

    	 object = new JSONObject();
    	 try {
    		 object.put("partyBudget", partyBudget);
        	 object.put("foodBudget", foodBudget);
        	 object.put("hotelBudget", hotelBudget);
        	 object.put("entertainmentBudget", entertainmentBudget);		
        	 object.put("transportBudget", transportBudget);

    	 } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	response = Response.status(Status.OK).entity(object.toString()).build();  
        return response;
    }
}
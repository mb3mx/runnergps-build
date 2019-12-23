package mx.com.mb3.runnergps.services.google;

import com.google.maps.ElevationApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.ElevationResult;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

public class ServicioGoogle {

	private static final String APIKEY = "AIzaSyAKJ4c2HJEgH4Nikrj04Tp1QDMl47LE8_Y";
	
	public static String buscarDireccion(Double lat, Double lon) {
		final GeoApiContext context = new GeoApiContext.Builder().apiKey(APIKEY).build();
		String direccion = "S/I";
	    GeocodingResult[] results;
	    try {
	    	LatLng latlng = new LatLng(lat, lon);
	        results = GeocodingApi.newRequest(context).latlng(latlng).await();
	        if(results.length > 0)
	        	direccion = results[0].formattedAddress;
	    } catch (final Exception e) {
	    }
		return direccion;
	}
	
	public static Double buscarAltitud(Double lat, Double lon) {
		final GeoApiContext context = new GeoApiContext.Builder().apiKey(APIKEY).build();
		Double altitud = 0.0;
	    ElevationResult results;
	    try {
	    	LatLng latlng = new LatLng(lat, lon);
	        results = ElevationApi.getByPoint(context, latlng).await();
	        altitud = results.elevation;
	    } catch (final Exception e) {
	    }
		return altitud;
	}
}

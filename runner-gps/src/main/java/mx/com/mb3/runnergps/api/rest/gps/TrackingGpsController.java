package mx.com.mb3.runnergps.api.rest.gps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import mx.com.mb3.runnergps.model.Evento;
import mx.com.mb3.runnergps.services.TrackingService;

@RestController
@RequestMapping("/api/v1/tracking")
@Api("Conjunto de endpoints el monitoreo de dispositivos GPS.")
public class TrackingGpsController {
	@Autowired
	private TrackingService trackingService;

	@RequestMapping(method = RequestMethod.GET,path = "/devices", produces = "application/json")
	@ApiOperation("Regresa una lista de eventos de todos los dispositivos")
	public List getAllDevices() {
		return trackingService.getAllDevices();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/devices/{imei}", produces = "application/json")
	@ApiOperation("Regresa la ultima posicion de un dispositivo en especifico por su numero de imei. 404 si se encuentra.")
	public Evento getEventoByImei(@ApiParam("Imei del dispositivo.No puede ser vacio.") @PathVariable int imei) {
		return trackingService.getDeviceByImei(imei);
	}

	 
	@RequestMapping(method = RequestMethod.POST, path = "/devices",produces = "application/json")
	@ApiOperation("Crea un evento para un dispositivo.")
	public Evento createPerson(
			@ApiParam("Informacion del evento de un dispositivo a ser creado.") @RequestBody Evento evento) {
		return trackingService.createEvent(evento);
	}

}

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
import mx.com.mb3.runnergps.persistence.events.vo.DeviceVO;
import mx.com.mb3.runnergps.persistence.dto.Device;
import mx.com.mb3.runnergps.persistence.events.vo.CurrentPositionVO;
import mx.com.mb3.runnergps.services.DeviceService;

@RestController
@RequestMapping("/api/v1/devices")
@Api("Conjunto de endpoints para crear y consultar eventos de dispositivos GPS.")
public class DevicesController {
	@Autowired
	private DeviceService deviceService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ApiOperation("Regresa una lista de todos los dispositivos")
	public List<Device> getAllDevices() {
		return deviceService.getAllDevices();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{imei}", produces = "application/json")
	@ApiOperation("Regresa informacion de un dispositivo en especifico por su numero de imei. 404 si se encuentra.")
	public DeviceVO getDeviceByImei(@ApiParam("Imei del dispositivo.No puede ser vacio.") @PathVariable long imei) {
		return deviceService.findDeviceByImei(imei);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ApiOperation("Actualiza un dispositivo del sistema por numero de imei. 404 si el identificador del dispositivo no se encuentra.")
	public DeviceVO updateDeviceByImei(@ApiParam("Imei del dispositivo a ser actualizado. No puede ser vacio.") @RequestBody DeviceVO device) {
		return deviceService.updateDeviceByImei(device);
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@ApiOperation("Crea un nuevo dispositivo")
	public DeviceVO createDevice(
			@ApiParam("Informacion del dispositivo ser creado.") @RequestBody DeviceVO device) {
		return deviceService.createDevice(device);
	}

}

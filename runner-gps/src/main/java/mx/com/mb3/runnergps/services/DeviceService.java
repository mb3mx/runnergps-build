package mx.com.mb3.runnergps.services;

import java.util.List;

import mx.com.mb3.runnergps.persistence.dto.Device;
import mx.com.mb3.runnergps.persistence.events.vo.DeviceVO;

public interface DeviceService {

	public List<Device>getAllDevices();
	public DeviceVO findDeviceByImei(long imei);

	public DeviceVO updateDeviceByImei(DeviceVO device);

	public DeviceVO createDevice(DeviceVO device);

}

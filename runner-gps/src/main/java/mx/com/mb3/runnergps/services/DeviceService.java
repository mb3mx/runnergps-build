package mx.com.mb3.runnergps.services;

import java.util.List;

import mx.com.mb3.runnergps.model.Device;

public interface DeviceService {

	public List<Device>getAllDevices();
	public Device getDeviceByImei(int imei);

	public Device updateDeviceByImei(Device device);

	public Device createDevice(Device device);

}

package mx.com.mb3.runnergps.persistence.dao;

import java.util.List;

import mx.com.mb3.runnergps.persistence.dto.Device;

public interface DeviceDAO {

	public List<Device> getAllDevices();

	public Device  findDeviceByImei(long imei);
}

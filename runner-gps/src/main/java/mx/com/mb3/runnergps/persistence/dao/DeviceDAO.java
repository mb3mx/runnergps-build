package mx.com.mb3.runnergps.persistence.dao;

import java.util.List;

import mx.com.mb3.runnergps.persistence.dao.common.BaseDAO;
import mx.com.mb3.runnergps.persistence.dto.Device;

public interface DeviceDAO extends BaseDAO<Device> {

	public List<Device> getAllDevices();

	public Device  findDeviceByImei(long imei);
}

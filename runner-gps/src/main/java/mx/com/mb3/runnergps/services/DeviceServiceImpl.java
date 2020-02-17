package mx.com.mb3.runnergps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.mb3.runnergps.persistence.dao.DeviceDAO;
import mx.com.mb3.runnergps.persistence.dto.Device;
import mx.com.mb3.runnergps.persistence.events.vo.DeviceVO;

@Service
public class DeviceServiceImpl implements DeviceService {
	@Autowired
	private DeviceDAO deviceDAO;
	
	@Override
	@Transactional
	public List<Device> getAllDevices() {
		List<Device> listDevices=deviceDAO.getAllDevices();
		return listDevices;
	}

	@Override
	public DeviceVO createDevice(DeviceVO device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public DeviceVO findDeviceByImei(long imei) {
		 
		return null;
	}

	@Override
	public DeviceVO updateDeviceByImei(DeviceVO device) {
		// TODO Auto-generated method stub
		return null;
	}

}

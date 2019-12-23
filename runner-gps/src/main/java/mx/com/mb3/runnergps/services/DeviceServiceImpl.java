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
	public List<DeviceVO> getAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceVO createDevice(DeviceVO device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public DeviceVO findDeviceByImei(long imei) {
		List<Device> dv=deviceDAO.findAll();
		Device cc = deviceDAO.findDeviceByImei(imei);
		return null;
	}

	@Override
	public DeviceVO updateDeviceByImei(DeviceVO device) {
		// TODO Auto-generated method stub
		return null;
	}

}

package mx.com.mb3.runnergps.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import mx.com.mb3.runnergps.persistence.dao.DeviceDAO;
import mx.com.mb3.runnergps.persistence.dao.common.BaseDAOImpl;
import mx.com.mb3.runnergps.persistence.dto.Device;
@Repository
public class DeviceDAOImpl extends BaseDAOImpl<Device> implements DeviceDAO  {

	@Override
	public List<Device> getAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Device  findDeviceByImei(long imei) {
		Criteria query = getCurrentSession().createCriteria(Device.class);
//		 
		query.add(Restrictions.eq("id", imei));
	 
		return (Device) query.uniqueResult();
	}

	 
 
}

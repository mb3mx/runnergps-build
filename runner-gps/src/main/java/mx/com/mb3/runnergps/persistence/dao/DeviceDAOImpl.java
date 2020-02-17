package mx.com.mb3.runnergps.persistence.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.mb3.runnergps.persistence.dto.Device;

@Repository
public class DeviceDAOImpl implements DeviceDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Device> getAllDevices() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Device> customerList = session.createQuery("from Device").list();
		return customerList;
	}

	@Override
	public Device findDeviceByImei(long imei) {
		Session session = this.sessionFactory.getCurrentSession();
		Device customer = (Device) session.get(Device.class, imei);
		return customer;

//		return null;
	}

}

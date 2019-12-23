package mx.com.mb3.runnergps.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mb3.runnergps.persistence.dao.CurrentPositionDAO;
import mx.com.mb3.runnergps.persistence.dto.CurrentPosition;
import mx.com.mb3.runnergps.persistence.events.vo.CurrentPositionVO;

@Service
public class TrackingServiceImpl implements TrackingService {

	@Autowired
	private CurrentPositionDAO currentPositionDAO;
	
	@Override
	public List<CurrentPositionVO> getAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentPositionVO getDeviceByImei(int imei) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public CurrentPositionVO createCurrenPosition(CurrentPositionVO currentPositionVO) {

		
		return null;
	}

	 
}

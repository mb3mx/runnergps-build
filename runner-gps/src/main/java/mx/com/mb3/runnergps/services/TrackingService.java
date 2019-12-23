package mx.com.mb3.runnergps.services;

import java.util.List;

import mx.com.mb3.runnergps.persistence.events.vo.DeviceVO;
import mx.com.mb3.runnergps.persistence.events.vo.CurrentPositionVO;

public interface TrackingService {

	public List<CurrentPositionVO>getAllDevices();

	public CurrentPositionVO getDeviceByImei(int imei);

	public CurrentPositionVO createCurrenPosition(CurrentPositionVO currentPositionVO);

}

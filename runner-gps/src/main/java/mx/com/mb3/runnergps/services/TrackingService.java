package mx.com.mb3.runnergps.services;

import java.util.List;

import mx.com.mb3.runnergps.model.Device;
import mx.com.mb3.runnergps.model.Evento;

public interface TrackingService {

	public List<Evento>getAllDevices();

	public Evento getDeviceByImei(int imei);

	public Evento createEvent(Evento evento);

}

package mx.com.mb3.runnergps.persistence.events.vo;

import java.io.Serializable;
import java.util.Date;

public class CurrentPositionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3097551677594756781L;

	private Long id;
	private Long deviceId;
	private Long eventId;
	private Double latitude;
	private Double longitude;
	private Double altitude;
	private Long nuImei;
	private String nuIp;
	private String fhRegistro;
	private Double accuracy;
	private Long speed;
	private String satellite;
	private String imei;
	private String ip;
	private String address;
	private Date event_date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Long getNuImei() {
		return nuImei;
	}

	public void setNuImei(Long nuImei) {
		this.nuImei = nuImei;
	}

	public String getNuIp() {
		return nuIp;
	}

	public void setNuIp(String nuIp) {
		this.nuIp = nuIp;
	}

	public String getFhRegistro() {
		return fhRegistro;
	}

	public void setFhRegistro(String fhRegistro) {
		this.fhRegistro = fhRegistro;
	}

	public Double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

}

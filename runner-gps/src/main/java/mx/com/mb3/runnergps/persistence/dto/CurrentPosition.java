package mx.com.mb3.runnergps.persistence.dto;
// Generated 20/12/2019 12:49:03 AM by Hibernate Tools 5.2.12.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CurrentPosition generated by hbm2java
 */
@Entity
@Table(name = "current_position")
public class CurrentPosition implements java.io.Serializable {

	private long id;
	private Device device;
//	private Event event;
	private BigDecimal latitude;
	private BigDecimal altitude;
	private BigDecimal longitude;
	private BigDecimal accuracy;
	private int speed;
	private Serializable theGeom;
	private int satellites;
	private long imei;
	private Serializable ip;
	private String address;
	private Date eventDate;
	private boolean enabled;
	private long modifierUser;
	private Date modified;
	private long creatorUser;
	private Date created;

	 

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "device_id", nullable = false)
	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "event_id", nullable = false)
//	public Event getEvent() {
//		return this.event;
//	}
//
//	public void setEvent(Event event) {
//		this.event = event;
//	}

	@Column(name = "latitude", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "altitude", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getAltitude() {
		return this.altitude;
	}

	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}

	@Column(name = "longitude", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "accuracy", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getAccuracy() {
		return this.accuracy;
	}

	public void setAccuracy(BigDecimal accuracy) {
		this.accuracy = accuracy;
	}

	@Column(name = "speed", nullable = false)
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Column(name = "the_geom")
	public Serializable getTheGeom() {
		return this.theGeom;
	}

	public void setTheGeom(Serializable theGeom) {
		this.theGeom = theGeom;
	}

	@Column(name = "satellites", nullable = false)
	public int getSatellites() {
		return this.satellites;
	}

	public void setSatellites(int satellites) {
		this.satellites = satellites;
	}

	@Column(name = "imei", nullable = false)
	public long getImei() {
		return this.imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	@Column(name = "ip")
	public Serializable getIp() {
		return this.ip;
	}

	public void setIp(Serializable ip) {
		this.ip = ip;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "event_date", nullable = false, length = 29)
	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "modifier_user", nullable = false)
	public long getModifierUser() {
		return this.modifierUser;
	}

	public void setModifierUser(long modifierUser) {
		this.modifierUser = modifierUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified", nullable = false, length = 29)
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Column(name = "creator_user", nullable = false)
	public long getCreatorUser() {
		return this.creatorUser;
	}

	public void setCreatorUser(long creatorUser) {
		this.creatorUser = creatorUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 29)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}

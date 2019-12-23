package mx.com.mb3.runnergps.persistence.dto;
// Generated 20/12/2019 12:49:03 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Device generated by hbm2java
 */
@Entity
@Table(name = "device")
public class Device implements java.io.Serializable {

	private long id;
	private String name;
	private String description;
	private String model;
	private String brand;
	private String osName;
	private Integer osVersion;
	private String devicePositionTable;
	private String deviceEventTable;
	private String deviceCommandTable;
	private String firebaseRegistrationToken;
	private boolean enabled;
	private String code;
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

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "model", length = 100)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "brand", length = 100)
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "os_name", length = 100)
	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	@Column(name = "os_version")
	public Integer getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(Integer osVersion) {
		this.osVersion = osVersion;
	}

	@Column(name = "device_position_table", nullable = false)
	public String getDevicePositionTable() {
		return this.devicePositionTable;
	}

	public void setDevicePositionTable(String devicePositionTable) {
		this.devicePositionTable = devicePositionTable;
	}

	@Column(name = "device_event_table", nullable = false)
	public String getDeviceEventTable() {
		return this.deviceEventTable;
	}

	public void setDeviceEventTable(String deviceEventTable) {
		this.deviceEventTable = deviceEventTable;
	}

	@Column(name = "device_command_table", nullable = false)
	public String getDeviceCommandTable() {
		return this.deviceCommandTable;
	}

	public void setDeviceCommandTable(String deviceCommandTable) {
		this.deviceCommandTable = deviceCommandTable;
	}

	@Column(name = "firebase_registration_token")
	public String getFirebaseRegistrationToken() {
		return this.firebaseRegistrationToken;
	}

	public void setFirebaseRegistrationToken(String firebaseRegistrationToken) {
		this.firebaseRegistrationToken = firebaseRegistrationToken;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "code", nullable = false, length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

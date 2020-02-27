package vitaltrend.vitaltrendbackend;
import java.util.Date;

public class VitalSet {

	private long id;
	private String username;
	private String patientName;
	private long systolic;
	private long diastolic;
	private long pulse;
	private long respirations;
	private long sp02;
	private double temperature;
	private Date timeStamp;

	public VitalSet(long id, String username, String patientName, long systolic, long diastolic, long pulse,
			long respirations, long sp02, double temperature, Date timeStamp) {
		super();
		this.id = id;
		this.username = username;
		this.patientName = patientName;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.pulse = pulse;
		this.respirations = respirations;
		this.sp02 = sp02;
		this.temperature = temperature;
		this.timeStamp = timeStamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getSystolic() {
		return systolic;
	}

	public void setSystolic(long systolic) {
		this.systolic = systolic;
	}

	public long getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(long diastolic) {
		this.diastolic = diastolic;
	}

	public long getPulse() {
		return pulse;
	}

	public void setPulse(long pulse) {
		this.pulse = pulse;
	}

	public long getRespirations() {
		return respirations;
	}

	public void setRespirations(long respirations) {
		this.respirations = respirations;
	}

	public long getSp02() {
		return sp02;
	}

	public void setSp02(long sp02) {
		this.sp02 = sp02;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}

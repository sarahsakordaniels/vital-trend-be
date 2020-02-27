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
	private long spo2;
	private double temperature;
	private Date timeStamp;
	
	public VitalSet() {
		
	}

	public VitalSet(long id, String username, String patientName, long systolic, long diastolic, long pulse,
			long respirations, long spo2, double temperature, Date timeStamp) {
		super();
		this.id = id;
		this.username = username;
		this.patientName = patientName;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.pulse = pulse;
		this.respirations = respirations;
		this.spo2 = spo2;
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

	public long getSpo2() {
		return spo2;
	}

	public void setSpo2(long spo2) {
		this.spo2 = spo2;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VitalSet other = (VitalSet) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}

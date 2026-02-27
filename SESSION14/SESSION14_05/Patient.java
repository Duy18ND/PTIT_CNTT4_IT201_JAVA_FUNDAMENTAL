package SESSION14.SESSION14_05;

public class Patient {
    private String name;
    private int severity;
    private String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeverityName() {
        switch (severity) {
            case 1: return "Nguy kịch";
            case 2: return "Nặng";
            case 3: return "Nhẹ";
            default: return "Không xác định";
        }
    }
    @Override
    public String toString() {
        return "Bệnh nhân " + name + " (Mức " + severity + " - " + getSeverityName() + ", đến lúc " + arrivalTime + ")";
    }
}

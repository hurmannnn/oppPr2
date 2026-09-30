public class DetectionEvent {
    int id;
    String detection_time;
    String location;
    String status;


    public DetectionEvent(int id, String detection_time, String location, String status) {

        this.id = id;
        this.detection_time = detection_time;
        this.location = location;
        this.status = status;
    }

    public void registerEvent() {
    }

    public void updateStatus() {
    }

    public String toString() {
        return "Подія виявлення: " +
                "id=" + id +
                ",Час виявлення='" + detection_time + '\'' +
                ",Локація='" + location + '\'' +
                ",Статус='" + status + '\'';
    }
}
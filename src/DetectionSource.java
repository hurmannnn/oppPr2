public class DetectionSource {
    public int id;
    public String name;
    public String type;
    public String location;
    public String status;

    public DetectionSource() {
        id = 1;
        name = "Перший радар";
        type = "Радар";
        location = "Жашків";
        status = "Активно";
    }

    public DetectionSource(int id, String name, String type, String location, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
    }

    public void provideInformation() {
    }

    public void updateStatus() {
    }

    public String toString() {
        return "Джерело виявлення: " +
                "id=" + id +
                ",Імʼя='" + name + '\'' +
                ",Тип='" + type + '\'' +
                ",Локація='" + location + '\'' +
                ",Статус='" + status + '\'';
    }
}

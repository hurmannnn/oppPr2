public class UnknownObject {
//объэкти класу
    int id;
    String detection_time;
    String coordinates;
    int height;
    int speed;
    String direction;
    String status;
    String detection_source;

//конструктор
    public UnknownObject(int id, String detection_time, String coordinates, int height, int speed, String direction, String status, String detection_source) {
//поля
        this.id = id;//поле=параметр
        this.detection_time = detection_time;
        this.coordinates = coordinates;
        this.height = height;
        this.speed = speed;
        this.direction = direction;
        this.status = status;
        this.detection_source = detection_source;
    }

//методи
    public void registerObject() {//публічний, нічого не повертає, назва
    }//структура класу створена, але поки пусто

    public void updateObject() {
    }

    public void changeStatus() {
    }

    //перетворення обʼєкту у текстовий вигляд
    public String toString() {
        return "Невідомий обʼєкт: " +
                "id=" + id +
                ",Час виявлення='" + detection_time + '\'' +
                ",Координати='" + coordinates + '\'' +
                ",Висота=" + height +
                ",Швидкість=" + speed +
                ",Напрямок руху='" + direction + '\'' +
                ",Статус='" + status + '\'' +
                ",Джерело виявлення='" + detection_source + '\'';
    }
}
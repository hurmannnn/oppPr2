public class Operator {
    public int id;
    public String fullName;
    public String role;
    public String login;
    public String status;

    public Operator() {
        id = 1;
        fullName = "Тетяна Глухота";
        role = "Оператор";
        login = "tanyaVSC156";
        status = "У мережі";
    }

    public Operator(int id, String fullName, String role, String login, String status) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.login = login;
        this.status = status;
    }

    public void viewObject() {
    }

    public void viewEvent() {
    }

    public void viewAlert() {
    }

    public void viewSystemStatus() {
    }

    public String toString() {
        return "Оператор: " +
                "id=" + id +
                ",Повне імʼя='" + fullName + '\'' +
                ",Роль='" + role + '\'' +
                ",Логін='" + login + '\'' +
                ",Статус='" + status + '\'';
    }
}

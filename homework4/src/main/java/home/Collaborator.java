package home;

public class Collaborator {
    Integer tabNumber;
    String phone;
    String name;
    Integer ageWork;

    public Collaborator(Integer id, String phone, String name, Integer ageWork) {
        this.tabNumber = id;
        this.phone = phone;
        this.name = name;
        this.ageWork = ageWork;
    }
    public Collaborator(Integer id) {
        this.tabNumber = id;
        this.phone = "89990000000";
        this.name = "Ivan";
        this.ageWork = 10;
    }

    public Integer getTabNumber() {
        return tabNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getAgeWork() {
        return ageWork;
    }

    public void print(){
        System.out.printf("%d: %s  Номер телефона: %s  Стаж: %d \n",tabNumber,name,phone,ageWork);
    }
}

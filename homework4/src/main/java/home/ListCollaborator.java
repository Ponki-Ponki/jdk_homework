package home;

import java.util.ArrayList;
import java.util.List;

public class ListCollaborator {
    List<Collaborator> list;

    public ListCollaborator() {
        this.list = new ArrayList<>();
    }

    public void newCollaborator(){
        Integer id = 0;
        if (!list.isEmpty()) id = list.get(list.size()-1).getTabNumber();
        Collaborator temp = new Collaborator(id);
        list.add(temp);
    }

    public List<Collaborator> findCollaboratorAge(Integer age){
        List<Collaborator> answer = new ArrayList<>();
        for (Collaborator item : list) {
            if (item.getAgeWork().equals(age)) answer.add(item);
        }
        return  answer;
    }

    public String  getPhoneNumber(String name){
        String phone = "None";
        for (Collaborator item : list) {
            if (item.getName().equals(name)) phone = item.getPhone();
        }
        return phone;
    }

    public void printNumberPhoneByName(String name){
        System.out.println(getPhoneNumber(name));
    }

    public Collaborator findCollaborator(Integer tabNumber){
        for (Collaborator item : list) {
            if (item.getTabNumber().equals(tabNumber)) return item;
        }
        return ;
    }
}

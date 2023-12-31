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
        Collaborator temp = new Collaborator(id+1);
        list.add(temp);
    }

    public void addCollaborator(Collaborator item){
        list.add(item);
    }
    public List<Collaborator> foundCollaboratorAgeWork(Integer age){
        List<Collaborator> answer = new ArrayList<>();
        for (Collaborator item : list) {
            if (item.getAgeWork().equals(age)) answer.add(item);
        }
        return  answer;
    }

    public List<Collaborator> getPhoneNumber(String name){
        List<Collaborator> answer = new ArrayList<>();
        for (Collaborator item : list) {
            if (item.getName().equals(name))  answer.add(item);
        }
        return answer;
    }

    public void printNumberPhoneByName(String name){
        System.out.println("I found it: ");
        List<Collaborator> answer = getPhoneNumber(name);
        if (!answer.isEmpty()){
            printList(getPhoneNumber(name));
        }else System.out.println("None");
    }

    public Collaborator foundCollaboratorTabNumber(Integer tabNumber) {
        for (Collaborator item : list) {
            if (item.getTabNumber().equals(tabNumber)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Collaborator not found for tab number: " + tabNumber);
    }

    public  void printList(){
        for (Collaborator item: this.list) {
            item.print();
        }
    }
    public  void printList(List<Collaborator> list){
        for (Collaborator item: list) {
            item.print();
        }
    }
}

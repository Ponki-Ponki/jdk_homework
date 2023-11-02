package home;

public class Main {
    public static void main(String[] args) {
        Collaborator collaborator1 = new Collaborator(1, "89991234567", "John", 5);
        Collaborator collaborator2 = new Collaborator(2, "89992345678", "Emily", 3);
        Collaborator collaborator3 = new Collaborator(3, "89993456789", "Michael", 8);
        Collaborator collaborator4 = new Collaborator(4, "89994567890", "Sophia", 2);
        Collaborator collaborator5 = new Collaborator(5, "89995678901", "Daniel", 6);
        Collaborator collaborator6 = new Collaborator(6, "89996789012", "Olivia", 4);
        Collaborator collaborator7 = new Collaborator(7, "89997890123", "William", 9);
        Collaborator collaborator8 = new Collaborator(8, "89998901234", "Emma", 7);
        Collaborator collaborator9 = new Collaborator(9, "89999012345", "James", 1);
        Collaborator collaborator10 = new Collaborator(10, "89990123456", "Ava", 10);

        ListCollaborator list = new ListCollaborator();
        list.addCollaborator(collaborator1);
        list.addCollaborator(collaborator2);
        list.addCollaborator(collaborator3);
        list.addCollaborator(collaborator4);
        list.addCollaborator(collaborator5);
        list.addCollaborator(collaborator6);
        list.addCollaborator(collaborator7);
        list.addCollaborator(collaborator8);
        list.addCollaborator(collaborator9);
        list.addCollaborator(collaborator10);
        list.newCollaborator();
        list.printList();


        System.out.println();
        list.printList(list.foundCollaboratorAgeWork(10));
        System.out.println();
        list.printNumberPhoneByName("Ivan");
        list.printNumberPhoneByName("Ivanф");
        try{
            System.out.println();
            list.foundCollaboratorTabNumber(1).print();
            list.foundCollaboratorTabNumber(15).print();
        } catch (IllegalArgumentException e) {
            System.out.print("I don't found: ");
            System.out.println(e.getMessage());
        }
    }
}
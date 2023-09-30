package busticketingsystem;

//Jia Xuan
public class Person {
    private String name;
    private String contact;
    private int id;
    
    public Person(){
        
    }
    
    public Person(String n, String c, int i){
        this.name = n;
        this.contact = c;
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID   : " + id + "\nName : " + name + "\nContact number : " + contact;
    }
    
}

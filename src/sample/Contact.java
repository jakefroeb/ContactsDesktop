package sample;

/**
 * Created by jakefroeb on 9/13/16.
 */
public class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name,String phoneNumber,String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s Phonenumber: %s, Email: %s",name,phoneNumber,email);
    }
}

import AnonymousInnerClass.Contact;
import AnonymousInnerClass.ContactService;
import AnonymousInnerClass.FilterCriteria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // anonymous inner class
        List<Contact> contactList = new ArrayList<>();

        contactList.add(new Contact("User1", "01709222843", 20, Contact.GENDER.MALE));
        contactList.add(new Contact("User2", "01709222843", 30, Contact.GENDER.FEMALE));
        contactList.add(new Contact("User3", "01709222843", 40, Contact.GENDER.MALE));
        contactList.add(new Contact("User4", "01709222843", 50, Contact.GENDER.FEMALE));
        contactList.add(new Contact("User5", "01709222843", 60, Contact.GENDER.MALE));


        ContactService contactService = new ContactService();

        List<Contact> contactsFemale = contactService.findContacts(contactList, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                if (contact.getGender() == Contact.GENDER.FEMALE)
                    return true;
                else return false;
            }
        });

        List<Contact> contactsAggedBetween30To50 = contactService.findContacts(contactList, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {

                if (30 <= contact.getAge() && contact.getAge() <= 50)
                    return true;

                return false;
            }
        });

        System.out.println(contactsAggedBetween30To50.size());

    }
}

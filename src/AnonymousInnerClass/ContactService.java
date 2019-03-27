package AnonymousInnerClass;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    public List<Contact> findContacts(List<Contact> contacts, FilterCriteria criteria) {

        List<Contact> matchedContact = new ArrayList<>();

        for (Contact contact : contacts) {
            if (criteria.match(contact)) {
                matchedContact.add(contact);
            }
        }

        return matchedContact;

    }

}

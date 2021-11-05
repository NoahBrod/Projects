package Sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Person.Person;

public class PeopleListCreator {
    private ArrayList<Person> personList;
    
    public PeopleListCreator(File data) {
        createList(data);
    }

    public PeopleListCreator() {

    }

    // reads data.txt puts data in correct variables then adds person to arraylist
    private ArrayList<Person> createList(File data) {
        try {
            personList = new ArrayList<>();
            Scanner dataRead = new Scanner(data);
            while(dataRead.hasNext()) {
                // finds all variables
                String line = dataRead.nextLine();
                String id = line.substring(0, line.indexOf(","));
                line = line.substring(line.indexOf(",") + 1, line.length());
                String firstname = line.substring(0, line.indexOf(","));
                line = line.substring(line.indexOf(",") + 1, line.length());
                String lastname = line.substring(0, line.indexOf(","));
                line = line.substring(line.indexOf(",") + 1, line.length());
                String phone = line.substring(0, line.indexOf(","));
                line = line.substring(line.indexOf(",") + 1, line.length());
                String email = line;
                //adds to person
                Person person = new Person();
                person.setId(Long.parseLong(id));
                person.setFirstname(firstname);
                person.setLastname(lastname);
                person.setPhone(Long.parseLong(phone));
                person.setEmail(email);
                // adds person to list
                personList.add(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }

    public ArrayList<Person> getList() {
        return personList;
    }
}

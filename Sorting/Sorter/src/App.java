import java.io.File;

import Sort.PeopleListCreator;

public class App {
    public static void main(String[] args) {
        PeopleListCreator list = new PeopleListCreator(new File("Sorting/Sorter/src/resources/data.txt"));
        System.out.println(list.getList());
    }
}

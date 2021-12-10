package Les4List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String,ArrayList<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }
    public void add(String surname, String number){
        if(book.containsKey(surname)) {
            ArrayList<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println("номер" + number + " " + " дополнен для " + surname);
            } else {
                System.out.println("такой номер существует");
            }
        }
       else {
           book.put(surname, new ArrayList<String>(Arrays.asList(number)));
                System.out.println(String.format("Телефон %s добавлен для %s", number, surname));
            }

    }

    public void get(String surname){
        ArrayList<String> phonenumberOnsurname = book.get(surname);
        System.out.println(String.format("Контакт по фамилии %s имеет номер телефона: " + phonenumberOnsurname, surname));
    }
}

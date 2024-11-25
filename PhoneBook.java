import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook{
 private Map<String, Object> phonebook;
 
 public PhoneBook(){ 
  this.phonebook = new HashMap<>(); 
 } 
 
 public void add(String surname, String phone){ 
    if (this.phonebook.containsKey(surname))
    {
        Object value = this.phonebook.get(surname);
        List<String> phones = new ArrayList<>();
        if(value instanceof String)
        {
            phones.add((String)value);
            phones.add(phone);
        }
        else if(value instanceof List){
            phones.addAll((List) value);
            phones.add(phone);
        }
        this.phonebook.put(surname,phones);
    }
    else{
        this.phonebook.put(surname,phone);
    }
 } 
 
  
 public Object get(String surname) { 
        return phonebook.get(surname);
    } 
}

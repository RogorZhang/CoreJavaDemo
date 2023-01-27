package org.example.day6;

import java.util.HashMap;
import java.util.Map;

public class PhoneFactory {
    Map<String, Phone> map;

    public PhoneFactory() {
        map = new HashMap<>();
        map.put("iphone", new Iphone());
        map.put("Sony", new Sony());
    }

    public Phone getPhone(String phoneType) {
        return map.get(phoneType);
    }


}

class Phone {}

class Iphone extends Phone{
    String type = "iphone";
    double size = 6.1;
    int id = 123;

    public Iphone() {
    }
}

class Sony extends Phone{
    String type = "Sony";
    double size = 5.5;
    int id = 345;

    public Sony() {
    }
}

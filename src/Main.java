import java.util.HashMap;

public class Main {

    public static void main (String[] args) {
        words();
        Phonebook phonebook = new Phonebook();
        phonebook.add(234553, "Ivanov");
        phonebook.add(236553, "Ivanov");
        phonebook.add(994553, "Ivanov");
        phonebook.add(994093, "Petrov");
        phonebook.add(9554093, "Petrov");
        phonebook.add(9940983, "Vasin");
        phonebook.add(1940983, "Vanon");
        phonebook.add(1940954, "Vanon");

        phonebook.get("Ivanov");
        phonebook.get("Vanon");
        phonebook.get("Savin");



    }

    public static void words(){
        HashMap<String, Integer> hm = new HashMap<>();
        String[] strings = {
                "Зима", "Снег", "Мороз", "Холод", "Зима",
                "Вьюга", "Снег", "Зима", "Гололед", "Снег",
                "Мороз", "Зима", "Холод", "Снег", "Мороз", "Холод",
                "Зима", "Снег", "Зима", "Гололед",

        };
        for (String s: strings) {
            if (hm.get(s) == null) {
                hm.put(s, 1);
            }else {
                hm.put (s, hm.get(s) + 1);
            }
        }System.out.println(hm);

    }


}

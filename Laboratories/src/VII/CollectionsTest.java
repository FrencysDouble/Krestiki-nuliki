package VII;

import java.util.ArrayList;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add ("Moscow");
        city.add ("London");
        city.add ("New York");
        city.add ("Chicago");
        city.add (2,"Los Angeles");
        System.out.println(city.get(2));
        city.set(2,"Washington");
        System.out.println("Количество элементов = " + city.size());
        for(String cit : city)
        {
            System.out.println(city);
        }
    }
}

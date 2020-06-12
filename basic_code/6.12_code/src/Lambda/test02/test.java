package Lambda.test02;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Person[] arr={
                new Person("柳岩",19),
                new Person("迪丽热巴",123),
                new Person("古力娜扎",13),
        };

     /*   Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge()-o1.getAge();
        });


        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

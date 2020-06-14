package Lambda.test02_Para_noReturn;

import java.util.Arrays;

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

        //Lambda表达式
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge()-o1.getAge();
        });


         //Lambda表达式省略
        Arrays.sort(arr,(o1,o2)->o2.getAge()-o1.getAge());


        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

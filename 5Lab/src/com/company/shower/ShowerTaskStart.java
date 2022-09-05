package com.company.shower;

import java.util.ArrayList;

public class ShowerTaskStart {

    public static void main(String[] args) {
        // write your code here

        Shower shower = new Shower(3);

        ArrayList<Thread> queue = new ArrayList<>();
        queue.add(new Person("Сергей", GenderType.MAN, 1, shower));
        queue.add(new Person("Анна", GenderType.WOMAN,1, shower));
        queue.add(new Person("Иван", GenderType.MAN,1,shower));
        queue.add(new Person("Гриша", GenderType.MAN,1, shower));
        queue.add(new Person("Казимир", GenderType.MAN,2,shower));
        queue.add(new Person("Игорь", GenderType.MAN,1,shower));
        queue.add(new Person("Лера", GenderType.WOMAN,2,shower));
        queue.add(new Person("Катя", GenderType.WOMAN,1,shower));
        queue.add(new Person("Настя", GenderType.WOMAN,1,shower));
        queue.add(new Person("Олег", GenderType.MAN,2,shower));
        queue.add(new Person("Ефим", GenderType.MAN,1,shower));
        queue.add(new Person("Вика", GenderType.WOMAN,2,shower));

        queue.sort((l,r)->{
            if(((Person)l).getHour()>((Person)r).getHour())
                return 1;
            else if(((Person)l).getHour()<((Person)r).getHour())
                return -1;
            else
                return 0;
        });

        for (var c:
                queue) {
            c.start();
        }
}
}


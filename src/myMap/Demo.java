package myMap;

import com.company.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

// 1. Trong Map thi (key) co gia tri la duy nhat nen chi nhan gia tri 1 key gan nhat;
        map.put(1, "a");
        map.put(2, "b");

// gia tri cua (b) se bi (c) ghi de;
        map.put(2, "c");

// gia tri cua key co the la (null);
        map.put(null, "d");

        System.out.println(map.get(2));
        System.out.println(map.get(null));
        System.out.println("---");

// 2. Muon (lap) phan tu trong Map, phai lay tap gia tri cua Key;
        Set<Integer> keySet = map.keySet();

        for (Integer i: keySet) {
            System.out.println(i + " " + map.get(i));
        }
        System.out.println("---");

// 3. Xoa phan tu trong Map thi truyen key vao;
        map.remove(1);
       // map.clear(); //Ham clear() xoa tat ca phan tu trong Map;

        Set<Integer> keySet2 = map.keySet();

        for (Integer i: keySet2) {
            System.out.println(i + " " + map.get(i));
        }
        System.out.println("---");

// 4. Lap kieu Entry tra ve cap (key, value);

//        for (Entry<Integer, String> s: map.entrySet()) {
//            map.getKey();
//            map.getValue();
//        }
        System.out.println("---");

// 5. Thao tac voi Obj;
        Map<String, Person> mapPerson = new HashMap<String, Person>();

        mapPerson.put("a", new Person(10));

        Person p = mapPerson.get("a");

    }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "hello hello hi hi ha ha ko ";
        String[] arr = str.split(" ");

//        for (String a : arr) {
//            System.out.print(a + "\t");
//        }

//        key: gia tri cua phan tu trong mang
//        value: so lan xuat hien cua phan tu trong mang

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                // key = arr[i] chua xuat hien trong map => value = 1;
                map.put(arr[i], 1);
            } else {
                // key = arr[i] da xuat hien truoc do => value = get(arr[i]) + 1
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) { // Map.Entry: kieu du lieu cua cac phan tru trong map
            System.out.println("tu " + entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            //entrySet() chua cac entry(key, value)
        }



  /*      Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String)i.next();
            System.out.println("từ  " + key + " xuất hiện " + map.get(key) + " lần");
        }*/
    }
}
import java.io.File;
import java.util.*;

public class Main {

    public static void bbb() {
        throw new ArithmeticException("1231");
    }

    public static void main(String[] args) {

        int x = 0;
        Integer y = 100;
        y = x;

        double d = 12;
        Double z = 12.02;
        z = d;

        char k = 'A';
        Character p = '1';

        boolean flag = true;
        Boolean fl = flag;






        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        arrayList.add(1);
        arrayList.add("String12312313");

      //  String st = (String)arrayList.get(1);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Car> arrayList2 = new ArrayList<>();
        arrayList2.add(new Car());

        String name  = arrayList2.get(0).getName();

        // Collection arrayList3 = new ArrayList();

        Comparator<Car> carComparator = new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(arrayList2,carComparator);







        Set set = new Set() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };


        List list = new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };













        File file = new File("путь к файлу");




        // null pointer exception
        // stackoverflow

        try {
            int a = 100;
            int b = 0;
            int c = a / b;
          /* try {
                int[] h = new int[4]; // 0 0 0 0
                h[10] = 5;
            } catch (Exception e) {

            }*/
        } catch (Exception e) {
            System.out.println("Ошибка: "+e.getMessage());
        } finally {
            System.out.println("Всегда!!!");
        }
        System.out.println("Что хорошее...");








        String test1 = new String("111");
        String test2 = new String("111");
        System.out.println(test1==test2); // не надо!!!

        //Литеральное
        String test0 = "444";
        String test3 = "444";
        System.out.println(test0==test3); // не надо!!!
        System.out.println(test0.equals(test3)); // !!! сравнивать только так строк

        // immutable - неизменяемые

        String str1 = "Hello";
        System.out.println(str1.hashCode());
        str1 += "test";
        System.out.println(str1.hashCode());

        // Garbage collector

        // Mutable строки
        StringBuilder stringBuilder = new StringBuilder("555");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("444");
        System.out.println(stringBuilder.hashCode());
        // StringBuffer




/*
        Car car = new Car("11",12,4);
        car.doMove();

        Car.doMove();

        Math.abs(22);

        Car car1 = new Car("22",33,4);
        car1.counter++; // 1

        Car car2 = new Car("name",555,5);
        System.out.println(car2.counter); // 0
        //Car.TTT = 444;

        Transport tt1 = new Transport();
        Transport tt2 = new Transport("11",22);
*/
        // SOLID


        // default - private package
        // private - внутри класс
        // protected - внутри и в наслед.
        // public - везде
    }
}
abstract class Transport {
    private String name;
    private int speed;

    public Transport() {

    }

    public Transport(String n, int s) {
        this.name = n;
        this.speed = s;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void doBeep() {
        System.out.println("Transport beep!");
    }
}
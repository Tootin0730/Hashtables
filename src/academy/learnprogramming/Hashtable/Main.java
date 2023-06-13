package academy.learnprogramming.Hashtable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 79);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Smith", marySmith);
        ht.put("Wilson", mikeWilson);

        //ht.printHashtable();

        System.out.println("Retrieve key Wilson " + ht.get("Wilson"));

    }
}
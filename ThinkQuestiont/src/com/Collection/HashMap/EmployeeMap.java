package com.Collection.HashMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Employee3 {
    int eid;
    String name;
    int salary;
    Dept d;

    public Employee3(int eid, String name, int salary, Dept d) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + " " + d + "]";
    }
}

class Dept {
    int did;
    String name;

    public Dept(int did, String name) {
        super();
        this.did = did;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept [did=" + did + ", name=" + name + "]";
    }
}

public class EmployeeMap {
    public static void main(String[] args) {

        TreeMap<Employee3, String> hm = new TreeMap<>(new Salarycompare());
        hm.put(new Employee3(101, "mangesh", 10000, new Dept(1, "hr")), "pune");
        hm.put(new Employee3(102, "jay", 20000, new Dept(2, "sales")), "mumbai");
        hm.put(new Employee3(103, "vedang", 15000, new Dept(3, "hr")), "pune");
        hm.put(new Employee3(104, "vedant", 70000, new Dept(4, "finanace")), "sambhajinagar");
        hm.put(new Employee3(105, "appa", 50000, new Dept(5, "sales")), "hydrabad");
        hm.put(new Employee3(106, "chaitanya", 7000, new Dept(6, "development")), "pune");

        Set<Map.Entry<Employee3, String>> set = hm.entrySet();
        Iterator<Map.Entry<Employee3, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Employee3, String> mp = it.next();
            System.out.println(mp.getKey() + " " + mp.getValue());

        }
    }
}

class Salarycompare implements Comparator<Employee3> {

    @Override
    public int compare(Employee3 o1, Employee3 o2) {
        return o2.salary-o1.salary;
    }

}

package view;

import model.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExp8 {
    public static void main(String[] args) {
        List<String> strlist = Arrays.asList("Rat", "Cat", "Lion", "", "", "Tiger", "Elephant", "Cheeta", "Rhino");
        System.out.println("List of Strings : " + strlist);
        long count = 0;
        count = strlist.stream().filter(String::isEmpty).count();
        System.out.println("COunt of empty string : " + count);
        count = strlist.stream().filter(str -> str.length() == 3).count();
        System.out.println("Count of strings with length 3 : " + count);
        List<String> strlist1 = strlist.stream().filter(str -> !str.isEmpty()).toList();
        System.out.println("Strings without empty string : " + strlist1);
        String cstr = strlist.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(" - "));
        System.out.println("Str collected : " + cstr);
        List<Double> intlist = Arrays.asList(1.3, 3.0, 8.0, 4.0, 6.0, 9.0, 7.0, 2.0);
        System.out.println("List of integers : " + intlist);
        DoubleSummaryStatistics stat = intlist.stream().mapToDouble(i -> i).summaryStatistics();
        System.out.println(" Max : " + stat.getMax());
        System.out.println(" Min : " + stat.getMin());
        System.out.println(" Sum : " + stat.getSum());
        System.out.println(" COunt : " + stat.getCount());
        System.out.println(" Avg : " + stat.getAverage());
        ArrayList<User> arr=new ArrayList<User>();
        arr.add(new User(1,"naveen","n.v@dxc.com",1000));
        arr.add(new User(2,"kumar","kumar@dxc.com",2000));
        arr.add(new User(3,"rAjA","rAjA@dxc.com",300));
        arr.add(new User(4,"rani","rani@dxc.com",4000));
        arr.add(new User(5,"mandhiri","mandhiri@dxc.com",50000));
        arr.add(new User(6,"police","police@dxc.com",10000));
        Predicate<User> p1 =(a)->a.getSalary()>1000;
        arr.stream().filter(p1).sorted(Comparator.comparing(User::getName)).forEach(System.out::print);
        System.out.println(arr.stream().filter(p1).findFirst().get());
        System.out.println("-----------------------------------------------------------");
        Map<String,List<User>> groupByDept = arr.stream() .collect(Collectors.groupingBy(User::getEmail));
        System.out.println(groupByDept);
        groupByDept.forEach((dep,empInDept)->
        { System.out.println(dep);
            /*Iterator<Employee> i = empInDept.iterator(); while(i.hasNext())
            { System.out.println(i.next()); }*/
            empInDept.forEach(System.out::println);
        });


    }
}
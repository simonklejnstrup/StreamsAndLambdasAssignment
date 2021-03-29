package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        ReadFile read = new ReadFile();
        List<String> allClass = read.returnList();


        //System.out.println(allClass);

        List<Student> students = null;

        try {
            students = Files.lines(Paths.get("Grupper_Dat20V2_2021_03_10.txt"))
                    .map(s -> s.split(";"))
                    .map(studentInfo -> new Student(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3]))
                    .collect(Collectors.toList());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------- Unsorted-------------");
        System.out.println(students);



        Collections.sort(students, (Student s1, Student s2) -> s1.getFirstName().compareToIgnoreCase(s2.getFirstName()));

        System.out.println("--------------- Sorted-------------");
        System.out.println(students);







    }


}

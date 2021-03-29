package demo;

import java.util.Comparator;

public class Student{
    private String group;
    private String eMail;
    private String firstName;
    private String lastName;

    public Student(String group, String eMail, String firstName, String lastName) {
        this.group = group;
        this.eMail = eMail;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Group: " + group + "\n";
    }


    public int compareTo(Student s) {
        return this.getFirstName().compareTo(s.getFirstName());
    }

    class StudentNameComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    }
}

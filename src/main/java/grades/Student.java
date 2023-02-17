package grades;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // accessors
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double avg = 0;

        for (Integer grade : grades) {
            avg += grade;
        }
        avg /= grades.size();

        return avg;
    }

    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                "\nCurrent Average: " + this.getGradeAverage();
    }
}

package chapterFour;

public class Student {

    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average > 0)
            if(average <= 100)
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average > 0)
            if(average <= 100)
        this.average = average;
    }
    public String getLetterGrade(){
        String letterGrade = "";
        if (average >= 90)
            letterGrade = "A";
        else if(average >= 80)
            letterGrade = "B";
        else if (average >= 70)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "Failed";
        return letterGrade;
    }

    public static void main(String[] args) {

        Student myStudent = new Student("George Wale", 93.9);
        Student myStudent2 = new Student("Wale Sukomi", 45);

        System.out.println("The grade for " + myStudent.getName()+ " is: " + myStudent.getLetterGrade());
        System.out.println("The grade for " + myStudent2.getName() + " is: " + myStudent2.getLetterGrade());
    }
}

class Utility {
    public static void printLines(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}

class School {
    private static int id = 0;
    private int schoolId;
    private String schoolName;
    private String principleName;
    private int[] classIds;

    public School(String schoolName, String principleName) {
        this.schoolId = id;
        id++;
        this.schoolName = schoolName;
        this.principleName = principleName;
        this.classIds = new int[] { 1, 2, 4, 4 };
    }

    public void getSchoolDetails() {
        System.out.println();
        Utility.printLines(50);
        System.out.println("School Id: " + this.schoolId);
        System.out.println("School Name: " + this.schoolName);
        System.out.println("School Principal: " + this.principleName);
        System.out.print("Classes: ");
        Utility.printIntArray(this.classIds);
        System.out.println();
        Utility.printLines(50);
    }
}

class Class {
    private int id;
    private String className;
    public int totalStudent;
    public int[] subjectsIds;
}

class Subjects {
    private int id;
    public String subjectName;
    public int teacherId;
}

class Teacher {
    private int id;
    public String teacherName;
}

class Student {
    private int id;
    public String studentName;
    public String rollNumber;
    public String classId;
}

class Main {
    public static void main(String[] args) {

        School s1 = new School("s1", "p1");
        s1.getSchoolDetails();

    }
}

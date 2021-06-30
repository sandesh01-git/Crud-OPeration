import java.util.*;

public class Operation {
    private List<Student> stds = new ArrayList<Student>();

    Scanner scan = new Scanner(System.in);

    public void addStudent() {
        HashSet<Integer> checkid = new HashSet<Integer>();
        System.out.print("  !!Can i get  ur id please!!  ");
        int id = scan.nextInt();
        if (this.stds.size() != 0) {

            for (Student s : this.stds) {
                checkid.add(s.getId());
            }
            while (checkid.contains(id)) {
                System.out.println("Id " + id + " alredy exist");
                System.out.print("enter ur id");
                id = scan.nextInt();
            }
        }

        System.out.println("Enter name");
        String name = scan.next();
        Student s = new Student(name, id);

        this.stds.add(s);
        System.out.println("student add");

    }

    public void getAllStudents() {
        System.out.println();
        if (this.stds.size() > 0) {
            for (Student s : this.stds) {
                System.out.println("Id " + s.getId() + " Name " + s.getName());
            }
        } else {
            System.out.println("No student found");
            System.out.println("----------------------------");
            System.out.println();
        }
        System.out.println();
    }

    public void getStudentById() {
        Boolean found = false;
        System.out.println();
        System.out.println("Enter ur Student ID");
        int id = scan.nextInt();
        for (Student s : this.stds) {
            if (s.getId() == id) {
                found = true;
                System.out.println("Record Found");
                System.out.println("Id " + s.getId() + " Name " + s.getName());
                System.out.println();
            }

        }
        if (!found) {
            System.out.println(" Record Not found");
        }
    }

    public void UpdateStudent() {
        HashSet<Integer> checkid = new HashSet<Integer>();
        Student std = null;
        Boolean found = false;

        System.out.print("!!Can i get  ur id please!!");
        int id = scan.nextInt();
        for (Student s : this.stds) {
            checkid.add(s.getId());
            if (s.getId() == id) {
                found = true;
                std = s;
            }

        }
        if (!found) {
            System.out.println("No record found");
            System.out.println();
        } else {
            System.out.println("Record Found");
            System.out.println("Id " + std.getId() + " Name " + std.getName());
            System.out.println("Enter new Id: ");
            int newid = scan.nextInt();
            while (checkid.contains(newid)) {
                System.out.println("Id " + newid + " alredy exist");
                System.out.print("enter ur id");
                id = scan.nextInt();
            }
            System.out.println("Enter ur name please");
            String name = scan.next();
            Student newstudent = new Student(name, newid);

            for (int i = 0; i < this.stds.size(); i++) {
                if (this.stds.get(i).getId() == id) {
                    this.stds.set(i, newstudent);
                    System.out.println("student update");
                    break;
                }
            }

        }

    }

    public void deleteRecord() {
        Boolean found = false;
        System.out.println();
        System.out.println(" * Delete Student * ");
        System.out.println();
        System.out.print("Please tell me ur student id to delete: ");
        int id = scan.nextInt();
        for (Student s : this.stds) {
            if (s.getId() == id) {
                found = true;
                this.stds.remove(s);
                System.out.println("Deleted !!!");

            }
        }
        if (!found) {
            System.out.println("Sorry Record Not Found !!");
        }

    }

}

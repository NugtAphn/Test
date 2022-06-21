
package New;

import java.util.Scanner;

public class PersonalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonalModel M = new PersonalModel();
        byte choose;
        do {
            System.out.println("1. Add ");
            System.out.println("2. Out");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1 -> {
                    Student s = new Student();
                    s.Input();
                    M.Add(s);
                    Employee e = new Employee();
                    e.Input();
                    M.Add(e);
                }
                case 2 -> M.Out();
                case 0 -> {
                }
                default -> System.out.println("Invalid choice!");
            }
            System.out.print("\nPress Enter to continue...");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 0);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_cas;

/**
 *
 * @author mifam
 */
import java.io.*;
import java.util.*;

public class FINAL_CAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int choice = 0;
        String Fname = "";

        System.out.println("==================================");
        System.out.println("   BASIC SCHOOL TASK ORGANIZER");
        System.out.println("==================================");

        do {
            System.out.println("\n1. Create File");
            System.out.println("2. Add Task");
            System.out.println("3. View Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Delete File");
            System.out.println("6. Exit program");

            System.out.print("Enter Choice: ");
            try {
                choice = Integer.parseInt(rs.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input!");
                continue;
            }

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter file name: ");
                        Fname = rs.nextLine() + ".txt";

                        File file = new File(Fname);

                        if (file.createNewFile()) {
                            System.out.println("File created: " + Fname);
                        } else {
                            System.out.println("File already exists.");
                        }

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    break;
                case 2:
                    try {
                        if (Fname.equals("")) {
                            System.out.println("Please create a file first.");
                            break;
                        }

                        System.out.print("Enter Subject: ");
                        String subject = rs.nextLine();
                        
                        System.out.print("Enter Task: ");
                        String task = rs.nextLine();
                        
                        System.out.print("Enter Due Date: ");
                        String due = rs.nextLine();
                        
                        BufferedWriter writer = new BufferedWriter(new FileWriter(Fname, true));
                        
                        writer.write("Subject: " + subject + " | Task: " + task + " | Due: " + due + ".");
                        writer.newLine();
                        
                        writer.close();
                        
                        System.out.println("Task added!");

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    break;
                case 3:
                    try {
                        if (Fname.equals("")) {
                            System.out.println("Please create a file first.");
                            break;
                        }

                        BufferedReader reader = new BufferedReader(new FileReader(Fname));
                        String read;
                        int i = 1;

                        System.out.println("\n--- TASKS ---");

                        while ((read = reader.readLine()) != null) {
                            System.out.println( i + ". " + read);
                            i++;
                        }

                        reader.close();

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    break;
                case 4:
                    try {
                        if (Fname.equals("")) {
                            System.out.println("Please create a file first.");
                            break;
                        }

                        BufferedReader reader = new BufferedReader(new FileReader(Fname));
                        String line;
                        
                        List<String> list = new ArrayList<>();

                        while ((line = reader.readLine()) != null) {
                            list.add(line);
                        }
                        
                        if (list.isEmpty()) {
                            System.out.println("No task found!");
                            break;
                        }
                        reader.close();
                        
                        System.out.println("\n--- Tasks ---");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                        
                        System.out.print("Enter number to Delete: ");
                        int num = rs.nextInt();
                        rs.nextLine();
                        
                        list.remove(num -1);
                        
                        BufferedWriter writer = new BufferedWriter(new FileWriter(Fname));
                        
                        for (String r : list) {
                            writer.write(r);
                            writer.newLine();
                        }
                        
                        writer.close();
                        
                        System.out.println("Task deleted!");

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    break;
                    
                case 5:
                    try {
                        if (Fname.equals("")) {
                            System.out.println("There is no file exixted");
                            break;
                        }
                        
                        File file = new File(Fname);
                        
                        if (!file.exists()) {
                            System.out.println("File does not exist.");
                            break;
                        }
                        
                        System.out.println("Are you sure you want to delete this file?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        System.out.print("Choice: ");
                        
                        int confirm;
                        
                        try {
                            confirm = Integer.parseInt(rs.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input!");
                            break;
                        }
                        
                        if (confirm == 1) {
                            if (file.delete()) {
                                System.out.println("File deleted successfully: " + Fname);
                                Fname = "";
                            } else {
                                System.out.println("Failed to delete file.");
                            }
                        } else if (confirm == 2) {
                            System.out.println("Delete cancelled.");
                        } else {
                            System.out.println("Invalid input");
                        }
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }
                    break;
     
                default:
                    System.out.println("Invalid input!");
            }

        } while (choice != 6);

        System.out.println("Program exited.");
    }
}
    
    


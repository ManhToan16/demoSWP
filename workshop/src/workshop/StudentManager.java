/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.Scanner;

/**
 *
 * @author toanl
 */
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] option={"Add new student","Search a student","Updata name and mark","Remove a student","List all","Quit"};
        int choice=0;
        StudentList list=new StudentList();
        do {            
            System.out.println("\nStudent managing Program");
            choice=Menu.getChoice(option);
            switch(choice){
                case 1: list.addStudent(); break;
                case 2: 
                    System.out.println("Enter a code of student");
                    String searchStudent=sc.nextLine();
                   searchStudent=searchStudent.trim().toUpperCase();
                    System.out.println("Output"+list.search(searchStudent));
                    break;
                case 3: 
                    if(list.size()==0) System.out.println("Empty list");
                    System.out.println("Input code of updated student");
                    String newCode=sc.nextLine();
                    int count=0;
                    for (Student student : list) {
                        if(student.getCode().trim().toUpperCase().equals(newCode.trim().toUpperCase()))
                            System.out.println("Old name: " + student.getName());
                        System.out.println("New name: ");
                        String newName=sc.nextLine();
                        student.setName(newName);
                        System.out.println("Old mark: " + student.getMark());
                        System.out.println("New mark: ");
                        int newMark=sc.nextInt();
                        student.setMark(newMark);
                        count++;
                        System.out.println("Output: Student"+student.getCode()+"has been updated");
                    }
                    if(count==0) System.out.println("Student "+ newCode+"doesn't exist");

                    break;
                case 4:
                    System.out.println("Enter a student you want to remove");
                    String removeSt=sc.nextLine();
                   removeSt=removeSt.trim().toUpperCase();
                   int count1=0;
                    for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).getCode().trim().toUpperCase().equals(removeSt.trim().toUpperCase())){
                            list.remove(i);
                            count1++;
                            System.out.println("Student"+removeSt+"has been removed");
                        }
                        
                        
                    }
                    if(count1==0) {
                        System.out.println("Student "+ removeSt+"doesn't exist");
                    }
                    break;
                case 5:
                    if(list.size()==0) System.out.println("Empty list");
                    int count2=0;
                    for (Student student : list) {
                        System.out.println(student.toString());
                        count2++;
                        
                    }
                    System.out.println(count2);
                    break;
                
                    
                
                    
                    
                   
                    
            }
            
            
        } while (choice>0&&choice<6);
    }
    
}

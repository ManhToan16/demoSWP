/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;

/**
 *
 * @author toanl
 */
public class StudentList extends ArrayList<Student>{

    public StudentList() {
    }
    public Student search(String code){
        code=code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) 
            if(this.get(i).getCode().equals(code))
                return this.get(i);
        return null;
            
           
            
         
    }
    private boolean isCodeDuppplicated(String code){
        code=code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addStudent(){
        String newCode,newName;
        int newMark;
        boolean codeDuplicated=false;
        do{
            newCode=Inputter.inputPattern("St: code s000", "[sS][\\d]{3}");
            newCode=newCode.trim().toUpperCase();
            codeDuplicated=isCodeDuppplicated(newCode);
            if (codeDuplicated) { System.out.println("Code is duplicated");
                
            }
        } while(codeDuplicated==true);
        newName=Inputter.inputNonBlankStr("Name of new studentt: ");
        newName=newName.toUpperCase();
        newMark=Inputter.inputInt("Mark: ", 0, 10);
                Student st=new Student(newCode,newName,newMark);
                this.add(st);
                System.out.println("Student "+newCode+"has been added");
                
    }
    public void searchStudent(){
    
}

    Student get(String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author toanl
 */
public class Student {
    String code;
String name;
int mark;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark>0&&mark<10)?mark:0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if((mark>0&&mark<10))
        this.mark = mark;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + mark ;
    }
    
    



}

package com.avengers.studentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> db = new HashMap<>();

    public Student getStudent(int id){

        return db.get(id);
    }
    public String addStudent(Student student){
        int id= student.getAdmnNo();
        db.put(id,student);
        return "Added successfully";

    }
    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return "Invalid Id";
        }
        db.remove(id);
        return "Student removed successfully";
    }

    public String updateStudent(int id, int age){
        if(!db.containsKey(id)){
            return null;
        }
        db.get(id).setAge(20);
        return "Age update successfully";
    }
}
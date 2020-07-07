package com.codegym.c0320h1.service.student;

import com.codegym.c0320h1.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService {
    private static Map<Long, Student> listStudent;
    static {
        listStudent = new HashMap<>();
        listStudent.put(1L, new Student(1L, "Bao", "Thai Nguyen"));
        listStudent.put(2L, new Student(2L,"Bao1", "Thai Nguyen1"));
        listStudent.put(3L, new Student(3L,"Bao2", "Thai Nguyen2"));
        listStudent.put(4L, new Student(4L,"Bao3", "Thai Nguyen3"));
    }

    @Override
    public List<Student> findAll() {
        ArrayList list = new ArrayList<>(listStudent.values());
        return list;
    }

    @Override
    public Student findById(Long id) {
        return listStudent.get(id);
    }

    @Override
    public void save(Student model) {
        listStudent.put(model.getId(), model);
    }

    @Override
    public void remove(Long id) {

    }
}
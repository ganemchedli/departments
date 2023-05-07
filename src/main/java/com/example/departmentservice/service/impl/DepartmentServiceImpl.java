package com.example.departmentservice.service.impl;
import com.example.departmentservice.repository.DepartmentRepository ;
import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}

package com.example;

import java.util.List;

class TestNoEmployeeInRepository implements EmployeeRepository{

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
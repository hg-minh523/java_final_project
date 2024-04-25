/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author KHONG TAM
 */
public class Employee {
    private String id;
    private String name;
    private String phone;
    private LocalDate delete_at;
private LocalDate update_at;
private LocalDate create_at;

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name, String phone, LocalDate delete_at, LocalDate update_at, LocalDate create_at) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.delete_at = delete_at;
        this.update_at = update_at;
        this.create_at = create_at;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDelete_at() {
        return delete_at;
    }

    public LocalDate getUpdate_at() {
        return update_at;
    }

    public LocalDate getCreate_at() {
        return create_at;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDelete_at(LocalDate delete_at) {
        this.delete_at = delete_at;
    }

    public void setUpdate_at(LocalDate update_at) {
        this.update_at = update_at;
    }

    public void setCreate_at(LocalDate create_at) {
        this.create_at = create_at;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return Objects.equals(this.id, other.id);
    }



}

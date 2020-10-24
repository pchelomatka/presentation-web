package main.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role_table")
@Data
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;


    public Integer getId() {
        return id;
    }

    public RoleEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoleEntity setName(String name) {
        this.name = name;
        return this;
    }
}

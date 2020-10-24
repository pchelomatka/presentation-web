package main.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String login;

    @Column
    String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

    public Integer getId() {
        return id;
    }

    public UserEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public UserEntity setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public UserEntity setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
        return this;
    }
}

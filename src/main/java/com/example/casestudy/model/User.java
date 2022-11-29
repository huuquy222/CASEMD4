package com.example.casestudy.model;

import com.example.casestudy.model.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Accessors(chain = true)
public class User extends BaseEnitity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String phone;

    @Column()
    private String username;

    @Column()
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public UserDTO toUserDTO() {
        return new UserDTO()
                .setId(id)
                .setPhone(phone)
                .setUsername(username)
                .setPassword(password)
                .setRole(role.toRoleDTO());
    }
}

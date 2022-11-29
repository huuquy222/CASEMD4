package com.example.casestudy.model;

import com.example.casestudy.model.dto.RoleDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
@Entity
@Accessors(chain = true)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    @OneToMany(targetEntity = User.class, mappedBy = "role", fetch = FetchType.EAGER)
    private Set<com.example.casestudy.model.User> users;

    public RoleDTO toRoleDTO(){
        return new RoleDTO()
                .setId(id)
                .setCode(code);
    }
}

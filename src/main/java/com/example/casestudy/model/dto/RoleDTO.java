package com.example.casestudy.model.dto;

import com.example.casestudy.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RoleDTO {
//    @NotNull(message = "yêu cầu đã được xử lý")
    private long id;
    private String code;

    public Role toRole(){
        return new Role()
                .setId(id)
                .setCode(code);
    }
}

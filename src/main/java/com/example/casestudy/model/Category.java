package com.example.casestudy.model;

import com.example.casestudy.model.dto.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
@Accessors(chain = true)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long id;

    private String name;

    public CategoryDTO toCategoryDTO(){
        return new CategoryDTO()
                .setId(id)
                .setName(name);
    }
}

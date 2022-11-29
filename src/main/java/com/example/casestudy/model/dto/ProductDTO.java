package com.example.casestudy.model.dto;

import com.example.casestudy.model.Category;
import com.example.casestudy.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProductDTO {

    private Long id;

    @Size(min = 4, max = 40, message = "Tên sản phẩm có độ dài 4-40 kí tự!")
    @NotBlank(message = "Phải nhập tên đầy đủ!")
    private String name;

    @NotBlank(message = "Đường dẫn không được để trống!")
    private String image;

    @NotBlank(message = "Số lượng phải nhập đầy đủ!")
    private String quantity;

    @NotBlank(message = "Giá tiền phải nhập đầy đủ!")
    private String price;

    private CategoryDTO category;

    public ProductDTO(Long id, String name, String image, int quantity, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.quantity = String.valueOf(quantity);
        this.price = String.valueOf(price);
        this.category = category.toCategoryDTO();
    }

    public Product toProduct() {
        return new Product()
                .setName(name)
                .setImage(image)
                .setQuantity(Integer.parseInt(quantity))
                .setPrice(new BigDecimal(price))
                .setCategory(category.toCategory());
    }
}

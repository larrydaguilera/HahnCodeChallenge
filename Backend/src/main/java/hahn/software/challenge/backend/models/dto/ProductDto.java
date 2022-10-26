package hahn.software.challenge.backend.models.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProductDto {

    @NotNull(message = "The id can't be null")
    @NotEmpty(message = "The id can't be empty")
    @NotBlank (message = "The id can't be Blank")
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "The name can't be null")
    @NotEmpty(message = "The name can't be empty")
    @NotBlank (message = "The name can't be Blank")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "The description can't be null")
    @NotEmpty(message = "The description can't be empty")
    @NotBlank(message = "The description can't be Blank")
    @Column(nullable = false)
    private String description;
}

package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {

    @JsonProperty("isbn")
    @NotBlank(message = "ISBN não pode ser vazio")
    private String isbn;

    @JsonProperty("titulo")
    @NotBlank(message = "Título não pode ser vazio")
    private String titulo;

    @JsonProperty("ano")
    @NotNull(message = "Ano não pode ser nulo")
    private Integer ano;

    @JsonProperty("edicao")
    @NotNull(message = "Edição não pode ser nula")
    private Integer edicao;

    @JsonProperty("autorId")
    @NotNull(message = "ID do autor não pode ser nulo")
    private Long autorId;
}

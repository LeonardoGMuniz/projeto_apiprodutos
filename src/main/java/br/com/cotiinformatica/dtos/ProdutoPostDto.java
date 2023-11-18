package br.com.cotiinformatica.dtos;

import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data


public class ProdutoPostDto {
	
	@NotBlank(message = "informe o nome do produto.")
	private String nome;
	
	@NotBlank(message= "informe a descrição do produto")
	
	private String descricao;
	@Min (value= 1 , message= "preço debe ser maior ou igual a 1.")
	
	private Double preco;
	@Min (value= 1,message="Quantidade deve ser maior ou igual a 1.")
	
	private Integer quantidade;
    @NotNull (message= "Id da categoria é obrigatório.")
	
    private UUID idCategoria;
    @NotNull(message="Id do fornecedor é obrigatório.")
	
    private UUID idFornecedor;
	

}

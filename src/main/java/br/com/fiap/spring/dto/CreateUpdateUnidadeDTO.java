package br.com.fiap.spring.dto;

public class CreateUpdateUnidadeDTO {

    private String nomeUnidade;
    private String enderecoUnidade;
    private String telefoneUnidade;

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getEnderecoUnidade() {
        return enderecoUnidade;
    }

    public void setEnderecoUnidade(String enderecoUnidade) {
        this.enderecoUnidade = enderecoUnidade;
    }

    public String getTelefoneUnidade() {
        return telefoneUnidade;
    }

    public void setTelefoneUnidade(String telefoneUnidade) {
        this.telefoneUnidade = telefoneUnidade;
    }
}

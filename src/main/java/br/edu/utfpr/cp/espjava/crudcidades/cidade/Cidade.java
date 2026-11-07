package br.edu.utfpr.cp.espjava.crudcidades.cidade;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Cidade {
    
    @NotBlank(message = "{app.cidade.blank}")
    @Size(min = 5, max = 60, message = "{app.cidade.size}")
    private String nome;

    @NotBlank(message = "{app.estado.blank}")
    @Size(min = 2, max = 2, message = "{app.estado.size}")
    private String estado;

    public Cidade() {
    }
    
    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CidadeEntidade clonar() {
        var cidadeEntidade = new CidadeEntidade();
        cidadeEntidade.setNome(this.getNome());
        cidadeEntidade.setEstado(this.getEstado());
        return cidadeEntidade;
    }

    public Cidade clonar(CidadeEntidade cidade) {
        return new Cidade(cidade.getNome(), cidade.getEstado());
    }
}
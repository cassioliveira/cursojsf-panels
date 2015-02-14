package br.com.cassioliveira.controller;

import br.com.cassioliveira.model.Usuario;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cassio
 */
@ManagedBean
public class FormularioBean {

    //Instância da classe Usuario para acesso aos atributos.
    private Usuario usuario;

    private String nomeMinusculo;
    private String sobrenomeMinusculo;

    //Construtor da Classe inicializando o objeto Usuário.
    public FormularioBean() {
        this.usuario = new Usuario();
    }

    /**
     * Método que pega os valores do nome e sobrenome, converte para minúsculo e
     * atribui às vaiáveis nomeMinusculo e sobrenomeMinusculo.
     */
    public void letrasMinusculas() {
        this.nomeMinusculo = usuario.getNome().toLowerCase();
        this.sobrenomeMinusculo = usuario.getSobrenome().toLowerCase();
    }

    public String getSobrenomeMinusculo() {
        return sobrenomeMinusculo;
    }

    public void setSobrenomeMinusculo(String sobrenomeMinusculo) {
        this.sobrenomeMinusculo = sobrenomeMinusculo;
    }

    public String getNomeMinusculo() {
        return nomeMinusculo;
    }

    public void setNomeMinusculo(String nomeMinusculo) {
        this.nomeMinusculo = nomeMinusculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

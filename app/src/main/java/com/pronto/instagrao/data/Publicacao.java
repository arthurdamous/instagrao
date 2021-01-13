package com.pronto.instagrao.data;

import java.io.Serializable;
import java.util.Objects;

public class Publicacao implements Serializable {

    private String dataPublicacao;
    private String textoPublicacao;
    private int caminhoImagem;
    private int qtdLikes;
    private int qtdComentarios;

    public Publicacao() {
    }

    public Publicacao(String dataPublicacao, int caminhoImagem, String textoPublicacao, int qtdLikes, int qtdComentarios) {
        this.dataPublicacao = dataPublicacao;
        this.caminhoImagem = caminhoImagem;
        this.textoPublicacao = textoPublicacao;
        this.qtdLikes = qtdLikes;
        this.qtdComentarios = qtdComentarios;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(int caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public int getQtdLikes() {
        return qtdLikes;
    }

    public void setQtdLikes(int qtdLikes) {
        this.qtdLikes = qtdLikes;
    }

    public int getQtdComentarios() {
        return qtdComentarios;
    }

    public void setQtdComentarios(int qtdComentarios) {
        this.qtdComentarios = qtdComentarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacao that = (Publicacao) o;
        return qtdLikes == that.qtdLikes &&
                qtdComentarios == that.qtdComentarios &&
                Objects.equals(dataPublicacao, that.dataPublicacao) &&
                Objects.equals(caminhoImagem, that.caminhoImagem) &&
                Objects.equals(textoPublicacao, that.textoPublicacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPublicacao, caminhoImagem, textoPublicacao, qtdLikes, qtdComentarios);
    }
}

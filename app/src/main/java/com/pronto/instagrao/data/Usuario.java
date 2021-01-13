package com.pronto.instagrao.data;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {

    private String userNickname;
    private String nmSeguidores;
    private String nmSeguindo;

    public Usuario() {
    }

    public Usuario(String userNickname, String nmSeguidores, String nmSeguindo) {
        this.userNickname = userNickname;
        this.nmSeguidores = nmSeguidores;
        this.nmSeguindo = nmSeguindo;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getNmSeguidores() {
        return nmSeguidores;
    }

    public void setNmSeguidores(String nmSeguidores) {
        this.nmSeguidores = nmSeguidores;
    }

    public String getNmSeguindo() {
        return nmSeguindo;
    }

    public void setNmSeguindo(String nmSeguindo) {
        this.nmSeguindo = nmSeguindo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(userNickname, usuario.userNickname) &&
                Objects.equals(nmSeguidores, usuario.nmSeguidores) &&
                Objects.equals(nmSeguindo, usuario.nmSeguindo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNickname, nmSeguidores, nmSeguindo);
    }
}

package com.pronto.instagrao.data;

import java.io.Serializable;
import java.util.Objects;

public class Stories implements Serializable {

    private int imgStorie;

    public Stories() {
    }

    public Stories(int imgStorie) {
        this.imgStorie = imgStorie;
    }

    public int getImgStorie() {
        return imgStorie;
    }

    public void setImgStorie(int imgStorie) {
        this.imgStorie = imgStorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stories stories = (Stories) o;
        return imgStorie == stories.imgStorie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imgStorie);
    }
}

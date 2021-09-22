package com.management.util.commons;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collections;
import java.util.Objects;

@Component
public class Paginacao<T> implements Pageable, Serializable {

    private Integer pagina = 0;
    private Integer totalItens = 0;

    public Paginacao() {
    }

    public Paginacao(Integer pagina, Integer totalItens) {
        if (totalItens < 1) {
            throw new IllegalArgumentException("Limit must not be less than one!");
        }
        if (pagina < 0) {
            throw new IllegalArgumentException("Offset index must not be less than zero!");
        }
        this.pagina = Objects.nonNull(pagina) ? pagina : 0;
        this.totalItens = Objects.nonNull(totalItens) ? totalItens : 0;
    }

    @Override
    public int getPageNumber() {
        return pagina / totalItens;
    }

    @Override
    public int getPageSize() {
        return totalItens;
    }

    @Override
    public long getOffset() {
        return pagina;
    }

    @Override
    public Sort getSort() {
        return Sort.by(Sort.Direction.DESC, "id");
    }

    @Override
    public Pageable next() {
        return new Paginacao(getPageSize(), (int) (getOffset() + getPageSize()));
    }

    public Pageable previous() {
        return hasPrevious() ?
                new Paginacao(getPageSize(), (int) (getOffset() - getPageSize())) : this;
    }

    @Override
    public Pageable previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    @Override
    public Pageable first() {
        return new Paginacao(getPageSize(), 0);
    }

    @Override
    public boolean hasPrevious() {
        return pagina > totalItens;
    }
}

package com.spring.pedidos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pedidos")
public class PedidoVo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer numeroPedido;
    private String produtoAssociado;
    private Integer quantidade;
    private Boolean status;


    public PedidoVo() {
    }

    public PedidoVo(Integer id, Integer numeroPedido, String produtoAssociado, Integer quantidade, Boolean status) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.produtoAssociado = produtoAssociado;
        this.quantidade = quantidade;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getProdutoAssociado() {
        return produtoAssociado;
    }

    public void setProdutoAssociado(String produtoAssociado) {
        this.produtoAssociado = produtoAssociado;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

package com.spring.pedidos.repository;

import com.spring.pedidos.model.PedidoVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PedidosRepository extends PagingAndSortingRepository<PedidoVo, Integer> {

    PedidoVo getById(Integer id);

}

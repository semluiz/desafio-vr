package com.spring.pedidos.controller;

import com.spring.pedidos.model.PedidoVo;
import com.spring.pedidos.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "api")
public class PedidoResource {
    @Autowired
    PedidosRepository repository;

    //salvando pedido
    @PostMapping("/pedido")
    public ResponseEntity<?> save(@RequestBody PedidoVo pedidoVO) {
        try {
            repository.save(pedidoVO);
            return new ResponseEntity<>(pedidoVO, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //listando todos pedidos
    @GetMapping("/pedidos")
    public ResponseEntity<?> list(Pageable pageable) {
        try {
            return new ResponseEntity<>(this.repository.findAll(pageable), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //listando o pedido por id
    @GetMapping("/pedido/{id}")
    public PedidoVo findById(@PathVariable("id") Integer pedidoId) {
        try {
            return repository.getById(pedidoId);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    //removendo o pedido
    @DeleteMapping("pedido/{id}")
    public void delete(@PathVariable("id") Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Atualizando o objeto
    @PutMapping("/pedido/{id}")
    public PedidoVo atualiza(@RequestBody PedidoVo pedidoVo) {
        try {
            return repository.save(pedidoVo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}

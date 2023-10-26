package com.projetoExemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoExemplo.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long>{

}

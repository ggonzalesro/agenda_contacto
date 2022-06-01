package com.agenda.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.contactos.modelo.Contacto;

public interface IContactoRepositorio extends JpaRepository<Contacto,Integer>{

}

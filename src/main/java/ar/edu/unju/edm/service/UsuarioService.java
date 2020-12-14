package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.UsuarioModelo;
@Service
public interface UsuarioService {
	public void guardarUsuario(UsuarioModelo unUsuario);
	public Iterable<UsuarioModelo> listar();
	public void delete(Integer id);
	public UsuarioModelo editar(Integer id) throws Exception;
	

}

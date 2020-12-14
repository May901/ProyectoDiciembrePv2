package ar.edu.unju.edm.service;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.UsuarioModelo;
import ar.edu.unju.edm.repository.UsuarioDAO;

public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	UsuarioDAO UsuarioDAO;
	
	@Override
	public void guardarUsuario(UsuarioModelo unUsuario) {
		// TODO Auto-generated method stub
		UsuarioDAO.save(unUsuario);
	}

	@Override
	public Iterable<UsuarioModelo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioModelo editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}

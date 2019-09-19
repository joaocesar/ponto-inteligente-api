/**
 * 
 */
package br.inf.jcp.pontointeligente.api.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.inf.jcp.pontointeligente.api.security.entities.Usuario;
import br.inf.jcp.pontointeligente.api.security.repositories.UsuarioRepository;
import br.inf.jcp.pontointeligente.api.security.services.UsuarioService;

/**
 * @author joaocesar
 *
 */
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Optional<Usuario> buscaPorEmail(String email) {

		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
		
	}

}

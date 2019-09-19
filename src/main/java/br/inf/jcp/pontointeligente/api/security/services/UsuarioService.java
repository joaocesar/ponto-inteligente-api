/**
 * 
 */
package br.inf.jcp.pontointeligente.api.security.services;

import java.util.Optional;

import br.inf.jcp.pontointeligente.api.security.entities.Usuario;

/**
 * @author joaocesar
 *
 */
public interface UsuarioService {
	
	Optional<Usuario> buscaPorEmail(String email);

}

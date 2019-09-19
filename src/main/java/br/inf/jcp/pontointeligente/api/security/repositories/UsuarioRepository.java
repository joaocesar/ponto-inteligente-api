/**
 * 
 */
package br.inf.jcp.pontointeligente.api.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.inf.jcp.pontointeligente.api.security.entities.Usuario;

/**
 * @author joaocesar
 *
 */
@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}

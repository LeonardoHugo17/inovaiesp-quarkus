package br.edu.iesp.repository;

import br.edu.iesp.model.Produto;
import br.edu.iesp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

}

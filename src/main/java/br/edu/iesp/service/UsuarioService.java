package br.edu.iesp.service;


import br.edu.iesp.model.Produto;
import br.edu.iesp.model.Usuario;
import br.edu.iesp.repository.ProdutoRepository;
import br.edu.iesp.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository repository;


    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public Usuario atualizar(Usuario usuario){
        return repository.save(usuario);
    }

    public void excluir(Long id){
         repository.deleteById(id);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }

    public Usuario consultar(Long id){
        return repository.findById(id).get();
    }

}

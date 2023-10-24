package br.edu.iesp.resource;

import br.edu.iesp.model.Usuario;
import br.edu.iesp.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/usuario")
public class UsuarioResource {
    @Inject
    UsuarioService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listar() {
      return service.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response incluir(Usuario usuario) {
        return Response
                .ok(service.salvar(usuario))
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response atualizar(Usuario usuario){
        return Response
                .ok(service.atualizar(usuario))
                .build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") Long id){
        service.excluir(id);
        return Response.ok().build();
    }
    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(@PathParam("id") Long id){
        return Response
                .ok(service.consultar(id))
                .build();
    }

}
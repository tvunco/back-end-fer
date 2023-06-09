/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.miapp.pi.fer.Security.Service;

import ar.miapp.pi.fer.Security.Entity.Usuario;
import ar.miapp.pi.fer.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    public Optional<Usuario> getByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario (String nombreUsuario){
       return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail (String email){
       return iusuarioRepository.existsByEmail(email);
    }
    public void save (Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}

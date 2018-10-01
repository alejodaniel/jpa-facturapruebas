package com.alejandro.ucc;

import com.alejandro.DAO.UsuarioDao;
import com.alejandro.dominio.Usuario;

public class UsuarioUcc {

    public boolean guardarUsuario(Usuario usuario) {
        UsuarioDao ud = new UsuarioDao(usuario);
        try {
            ud.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

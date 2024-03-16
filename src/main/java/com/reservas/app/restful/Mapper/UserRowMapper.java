package com.reservas.app.restful.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import com.reservas.app.restful.Model.Usuario;

public class UserRowMapper implements RowMapper<Usuario>{

    @Override
    @Nullable
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        Usuario usuario = new Usuario();
        usuario.setId(rs.getInt("id"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setFirstName(rs.getString("firstName"));
        return usuario;
    }
    
}

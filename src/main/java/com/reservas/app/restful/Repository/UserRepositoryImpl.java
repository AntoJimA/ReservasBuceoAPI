package com.reservas.app.restful.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.reservas.app.restful.Mapper.UserRowMapper;
import com.reservas.app.restful.Model.Usuario;
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Usuario> usuarios() {
        // TODO Auto-generated method stub
        String query="SELECT * FROM usuario";
        return jdbcTemplate.query(query, new UserRowMapper());
    }

    @Override
    public void save(Usuario usuario) { 
        // TODO Auto-generated method stub
        String query="INSERT INTO usuario (nombre, firstName) VALUES (?,?)";
        jdbcTemplate.update(query, usuario.getNombre(), usuario.getFirstName());
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        String query="DELETE FROM usuario WHERE id=?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public void update(Usuario usuario) {
        // TODO Auto-generated method stub
        String query="UPDATE usuario SET nombre=?, firstName=? WHERE id=?";
        jdbcTemplate.update(query, usuario.getNombre(), usuario.getFirstName(), usuario.getId());
    }

    @Override
    public void findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Usuario findById(int id) {
        // TODO Auto-generated method stub
        String query="SELECT * FROM usuario WHERE id=?";
        return jdbcTemplate.queryForObject(query, new UserRowMapper(), id);
    }

    @Override
    public void create(Usuario usuario) {
        // TODO Auto-generated method stub
        String query="INSERT INTO usuario (id,nombre, firstName) VALUES (?,?,?)";
        jdbcTemplate.update(query, usuario.getId(), usuario.getNombre(), usuario.getFirstName());
    }
    
}

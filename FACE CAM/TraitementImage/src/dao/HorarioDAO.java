
package dao;

import entity.Horario;
import java.io.Serializable;
import java.util.List;

public class HorarioDAO implements GenericDAO<Horario>{

    @Override
    public boolean save(Horario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(Horario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean saveOrUpdate(Horario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Horario getByID(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean delete(Horario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Horario> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Horario> getByParameter(String propriedade, Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Integer getCount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

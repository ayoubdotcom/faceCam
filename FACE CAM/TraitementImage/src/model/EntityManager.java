package model;

import dao.FotoDAO;
import dao.FuncionarioDAO;
import dao.GenericDAO;
import dao.RegistroDAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntityManager implements IEntityManager{
    
    public static final EntityManager INSTANCE = new EntityManager();
    private static final Map<Class, GenericDAO> DAOS = GenericDAO.instances;
    
    private EntityManager(){
        try {
            Class.forName(FuncionarioDAO.class.getName());
            Class.forName(FotoDAO.class.getName());
            Class.forName(RegistroDAO.class.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public <T> List<T> getAll(Class<T> classe) {
        return DAOS.get(classe).getAll();
    }

    @Override
    public <T> List<T> getAll(Class<T> classe, int start, int offset) {
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    @Override
    public <T> T getById(Class<T> classe, Serializable id) {
        return (T) DAOS.get(classe).getByID(id);
    }

    @Override
    public boolean delete(Serializable entity) {
        
        return DAOS.get(entity.getClass()).delete(entity);
        
    }

    @Override
    public boolean merge(Serializable entity) {
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    @Override
    public boolean save(Serializable entity) {
        return DAOS.get(entity.getClass()).save(entity);
    }

    @Override
    public boolean update(Serializable entity) {
        return DAOS.get(entity.getClass()).update(entity);
    }

    @Override
    public <T> List<T> getByParameter(Class<T> classe, String propriedade, Object valor) {
        return DAOS.get(classe).getByParameter(propriedade, valor);
    }

    @Override
    public <T> List<T> getByParameter(Class<T> type, String propriedade, Object valor, int start, int offset) {
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    @Override
    public <T> List<T> getAllBetween(Class<T> classe, String propriedade, Date inicio, Date fim) {
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    @Override
    public <T> List<T> getAllLike(Class<T> classe, String propriedade, Object valor) {
        throw new UnsupportedOperationException("Ainda não implementado!");
    }

    @Override
    public Integer getCount(Class classe) {
        return DAOS.get(classe).getCount();
    }

}

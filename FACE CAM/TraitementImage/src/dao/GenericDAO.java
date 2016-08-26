
package dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GenericDAO<EntidadePersistida extends Serializable> {
    
    Map<Class, GenericDAO> instances 
            = new HashMap<Class, GenericDAO>();
    
    boolean save(EntidadePersistida entidade);
    
    boolean update(EntidadePersistida entidade);
    
    boolean saveOrUpdate(EntidadePersistida entidade);
    
    EntidadePersistida getByID(Serializable id);
    
    boolean delete(EntidadePersistida entidade);
    
    List<EntidadePersistida> getAll();
    
    List<EntidadePersistida> getByParameter(String propriedade, Object valor);
    
    public Integer getCount();
    
}
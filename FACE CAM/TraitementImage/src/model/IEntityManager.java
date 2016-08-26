package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public interface IEntityManager {
    
    public <T> List <T> getAll(Class<T> classe);
    
    public <T> List <T> getAll(Class<T> classe, int start, int offset);
       
    public <T> T getById(Class<T> classe, Serializable id);
    
    public boolean delete(Serializable entity);
    
    public boolean merge(Serializable entity);
    
    public boolean save(Serializable entity);
    
    public boolean update(Serializable entity);
    
    public <T> List <T> getByParameter(Class<T> classe, String propriedade, Object valor);
    
    public <T> List <T> getByParameter(Class<T> type, String propriedade, Object valor, int start, int offset);
    
    public <T> List <T> getAllBetween(Class<T> classe, String propriedade, Date inicio, Date fim);
     
    public <T> List <T> getAllLike(Class<T> classe, String propriedade, Object valor);
    
    public Integer getCount(Class classe);

}
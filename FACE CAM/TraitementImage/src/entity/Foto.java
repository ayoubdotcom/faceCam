package entity;

import java.io.Serializable;
import java.util.Date;

public class Foto implements Serializable{
    
    private String      path;
    private Funcionario funcionario;
    private Integer     id;
    private Date        data;

    public Foto(String path, Funcionario funcionario) {
        this.path = path;
        this.funcionario = funcionario;
    }

    public Foto() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}

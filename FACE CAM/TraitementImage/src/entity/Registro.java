package entity;

import java.io.Serializable;
import java.util.Date;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Registro implements Serializable{
    
    public enum TipoRegistro{
        
        ENTREE(1),
        SORTI_DINNEE(2),
        ENTREE_DINNEE(3),
        SORTI(4);
        
        public int valor;
        private ResourceBundle bundle = ResourceBundle.getBundle("TipoRegistro");
        
        private TipoRegistro(int valor){
            this.valor = valor;
        }
        
        public TipoRegistro getNext(){
            for (TipoRegistro registro : values()){
                if(registro.valor == this.valor+1){
                    return registro;
                }
            }
            return ENTREE;
        }
        
        public static TipoRegistro get(int index){
            for (TipoRegistro registro : values()){
                if(registro.valor == index){
                    return registro;
                }
            }
            return ENTREE;
        }
        
        @Override
        public String toString(){
            return bundle.getString(this.name());
        }
    }
    
    public Registro() {
    }

    public Registro(Funcionario funcionario, Date data, TipoRegistro tipo) {
        this.funcionario = funcionario;
        this.data = data;
        this.tipo = tipo;
    }
    
    private Integer id;
    private Funcionario funcionario;
    private Date data;
    private TipoRegistro tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoRegistro getTipo() {
        return tipo;
    }

    public void setTipo(TipoRegistro tipo) {
        this.tipo = tipo;
    }
    
}
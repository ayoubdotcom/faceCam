package test;

import entity.Foto;
import entity.Funcionario;
import entity.Registro;
import java.util.Date;
import java.util.List;
import model.Banco;
import model.EntityManager;

public class TesteMain {

    public static void main(String[] args) {
        Banco b = new Banco();
        
        b.executeStatement(
                "insert into registro values(default, ?, ?, ?)"
               ,1, 1, new Date());
        
    }

}
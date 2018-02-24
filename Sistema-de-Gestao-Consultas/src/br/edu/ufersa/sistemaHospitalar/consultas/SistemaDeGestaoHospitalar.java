/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.sistemaHospitalar.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import br.edu.ufersa.sistemaHospitalar.consultas.bd.HibernateUtil;
import br.edu.ufersa.sistemaHospitalar.consultas.bd.repositorio.PacienteCRUD;
import br.edu.ufersa.sistemaHospitalar.consultas.entidades.Administrador;
import br.edu.ufersa.sistemaHospitalar.consultas.entidades.Paciente;
import br.edu.ufersa.sistemaHospitalar.consultas.entidades.Pessoa;
import br.edu.ufersa.sistemaHospitalar.consultas.gui.CadPaciente;
import br.edu.ufersa.sistemaHospitalar.consultas.gui.TelaLogin;

/**
 *
 * @author leone
 */
public class SistemaDeGestaoHospitalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Exemplo uso Hibernate
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Paciente p = new Paciente();
        p.setNome("Francisco Leonésio Carneiro Duarte");
        p.setBairro("Centro");
        p.setBairro("Centro");
        p.setNum_sus("123456");
        //p.setId(1l);
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(p);
        tx.commit();
        Administrador adb = (Administrador)session.get(Administrador.class, 1);
        System.out.println(adb.user);
        System.out.println(adb.senha);
        session.flush();
        session.close();
        sf.close();*/
        
        /*
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Administrador p = new Administrador("eu", "eu");
        //p.setId(1l);
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(p);
        
        tx.commit();
        
        session.flush();
        session.close();
        sf.close();*/
      
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        
        
        
       // Administrador adm = new Administrador("admin", "admin");
       // adm.validaLogin();
        /*
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createSQLQuery("select * from administrador where id = 1").addEntity(Administrador.class);
        List<Administrador> list =  (List<Administrador>)query.list();
        System.out.println(list.get(0).getUser());
        session.flush();
        session.close();*/
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.RegistroChamado;
import java.lang.reflect.InvocationTargetException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrey.imaguma
 */
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGerarCodigo() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        
        int num = chamadoDAO.gerarCodigo();
        assertTrue(num > 0);
    }
    
    @Test
    public void testGerarCodigoRegistroChamado() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        
        int num = chamadoDAO.gerarCodigo();
        assertTrue(num > 0);
    }
    
    @Test
    public void testPut() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Chamado chamado = new Chamado(null, null, 0, null, null, null, null, null);
        
        chamadoDAO.put(chamado);
        assertTrue(chamadoDAO.getChamados().size() > 0);
    }
    
    @Test
    public void testPutRegistro() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        RegistroChamado registroChamado = new RegistroChamado(null, null, null);
        
        chamadoDAO.putRegistro(registroChamado);
        assertTrue(chamadoDAO.getRegistros().size() > 0);
    }
//    
//    @Test
//    public void testLoad() {
//        
//    }
    
}

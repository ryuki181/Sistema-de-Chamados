/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Tecnico;
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
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
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
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        
        assertTrue(tecnicoDAO.gerarCodigo() > 0);
    }
    
    @Test
    public void testGet() {
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        Tecnico tecnico = new Tecnico("Teste", 0);
        
        tecnicoDAO.voltaCashTecnico().clear();
        assertEquals(null, tecnicoDAO.get(0));
        
        tecnicoDAO.put(tecnico);
        assertEquals("Teste", tecnicoDAO.get(1).getNome());
    }
    
    @Test
    public void testPut() {
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        Tecnico tecnico = new Tecnico(null, 0);
        
        tecnicoDAO.put(tecnico);
        assertTrue(tecnicoDAO.voltaCashTecnico().size() > 0);
    }
    
}

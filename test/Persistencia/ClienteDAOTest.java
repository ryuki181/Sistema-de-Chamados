/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
    public void testValidarCPF() {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        assertTrue(clienteDAO.validarCPF(3));
    }
    
    @Test
    public void testGerarCodigo() {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        int num = clienteDAO.gerarCodigo();
        assertTrue(num > 0);
    }
    
    @Test
    public void testGet() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteEmpresa cliente = new ClienteEmpresa(0, null, 0, "Teste", 0);
        
        clienteDAO.voltaCashCliente().clear();
        assertEquals(null, clienteDAO.get(0L));
        
        clienteDAO.put(cliente);
        assertEquals("Teste", clienteDAO.get(0L).getNome());
    }
    
    @Test
    public void testPut() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteEmpresa cliente = new ClienteEmpresa(0, null, 0, null, 0);
        
        clienteDAO.put(cliente);
        assertTrue(clienteDAO.voltaCashCliente().size() > 0);
    }
    
}

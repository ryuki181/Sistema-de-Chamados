/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class ControleEmpresasTest {

    public ControleEmpresasTest() {
    }

    @Test
    public void testRetorna() {
        ControleEmpresas controle = new ControleEmpresas();
        Empresa emp = new Empresa(0, "nome1");
        controle.retorna(0, "nome");
        assertEquals(0, emp.getNumeroContrato());
        assertEquals("nome1", emp.getNomeEmpresa());
    }

    @Test
    public void testValidar() {
        ControleEmpresas controle = new ControleEmpresas();
        Empresa emp = new Empresa(0, "nome1");
        controle.validar(0, "nome1");
        assertEquals(0, emp.getNumeroContrato());
        assertEquals("nome1", emp.getNomeEmpresa());

    }

    @Test
    public void testInserir() {
        ControleEmpresas controle = new ControleEmpresas();
        Empresa emp = new Empresa(0, "nome1");
        controle.inserir(0, "nome1");
        assertEquals(0, emp.getNumeroContrato());
        assertEquals("nome1", emp.getNomeEmpresa());
    }

    @Test
    public void testChecar() {
        ControleEmpresas controle = new ControleEmpresas();
        boolean num = controle.checar(0L, "nome2");
        assertTrue(num == true);
    }

    @Test
    public void testCadastrarEmpresa() {
        ControleEmpresas controle = new ControleEmpresas();
        controle.cadastrarEmpresa();
    }

    @Test
    public void testFecharTela() {
        ControleEmpresas controle = new ControleEmpresas();
        controle.fecharTela();
    }

}

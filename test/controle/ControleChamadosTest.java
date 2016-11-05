/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class ControleChamadosTest {

    public ControleChamadosTest() {
    }

    @Test
    public void testAlterarChamado() {
        Chamado chamadoTeste = new Chamado(1, null, null, 1, null, null, null, null, null, null);
        ControleChamados cc = new ControleChamados();
        cc.alterarChamado(chamadoTeste, "Ativo", "Causa Teste", "Solução Teste");

        assertEquals(chamadoTeste.getCausaProblema(), "Causa Teste");
    }

}

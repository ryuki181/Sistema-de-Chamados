/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class ControleTecnicosTest {

    @Test
    public void testInserir() {
        ControleTecnicos controle = new ControleTecnicos();
        Pessoa pes = new Pessoa("nome1", 0);
        controle.inserir(0, "nome1");
        assertEquals("nome1", pes.getNome());
        assertEquals(0, pes.getTelefone());

    }

    @Test
    public void testCadastrarTecnico() {
        ControleTecnicos controle = new ControleTecnicos();
        controle.cadastrarTecnico();
    }

}

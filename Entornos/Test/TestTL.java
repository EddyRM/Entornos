import Actividad1Evaluacion.Agentes;
import Actividad1Evaluacion.Clientes;
import Actividad1Evaluacion.TeamLeaders;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTL {

    @Test
    public void teamLeaderTest(){
        TeamLeaders tl = new TeamLeaders(35, "3 Mayo", "Eddy@hotmail.com", "Eduardo", 1400);
        assertEquals(tl.getFechaIncorporacion(), "3 Mayo");
        assertEquals(tl.getEmail(), "Eddy@hotmail.com");
        assertEquals(tl.getNombre(), "Eduardo");
        assertEquals(tl.getSueldo(), 1400);
        TeamLeaders tl2 = new TeamLeaders(35, "3 Mayo", "Eddy@hotmail.com", "Eduardo", 1400);
        assertTrue(tl.equals(tl2));
    }

    @Test
    public void AgentesTest(){
        Agentes agente = new Agentes(35, "3 Mayo", "Eddy@hotmail.com", "Eduardo", 1400);
        assertEquals(agente.getFechaIncorporacion(), "3 Mayo");
        assertEquals(agente.getEmail(), "Eddy@hotmail.com");
        assertEquals(agente.getNombre(), "Eduardo");
        assertEquals(agente.getSueldo(), 1400);
        TeamLeaders tl2 = new TeamLeaders(35, "3 Mayo", "Eddy@hotmail.com", "Eduardo", 1400);
    }

    @Test
    public void ClientesTest(){
        Clientes cliente = new Clientes(67,"Pedro@gmail.com", "5 Mayp", 3677.31f, "Pedro");
        assertEquals(cliente.getIdCliente(), 67);
        assertEquals(cliente.getEmail(), "Pedro@gmail.com");
        assertEquals(cliente.getFechaRegistro(), "5 Mayp");
        assertEquals(cliente.getDineroAcumulado(), 3677.31f);
        assertEquals(cliente.getNombre(), "Pedro");
    }




}



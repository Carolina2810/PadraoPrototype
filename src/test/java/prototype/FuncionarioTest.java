package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(123, "Funcionário Original", new Hospital("Rua C", 1), "Rio de Janeiro");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setRA(456);
        funcionarioClone.setNome("Funcionário Clonado");
        funcionarioClone.getHospital().setNumero(2);

        assertEquals("Funcionario{ra=123, nome='Funcionário Original', hospital=Hospital{logradouro='Rua C', numero=1}, localNascimento='Rio de Janeiro'}", funcionario.toString());
        assertEquals("Funcionario{ra=456, nome='Funcionário Clonado', hospital=Hospital{logradouro='Rua C', numero=2}, localNascimento='Rio de Janeiro'}", funcionarioClone.toString());
    }
}

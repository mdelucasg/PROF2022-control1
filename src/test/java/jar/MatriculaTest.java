package jar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class MatriculaTest 
{
    @Test
    public void manageNullSubjectVector()
    {
        Matricula myMatricula = new Matricula(null);
        assertThrows(Exception.class, () -> myMatricula.getImporte());
    }

}

package jar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Vector;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MatriculaMockTest {
    private final double TOTAL_SUBJECTS = 5;
    private final double FEE = 5;
    
    @Test
    public void sumSubject() throws Exception {

        Vector<Asignatura> subjects = new Vector<Asignatura>();
        for (int i = 0; i < TOTAL_SUBJECTS; ++i) {

            Asignatura s = mock(Asignatura.class);
            when(s.getImporte()).thenReturn(FEE);
            subjects.add(s);
        }

        Matricula myMatricula = new Matricula(subjects);

        assertEquals(FEE * TOTAL_SUBJECTS, myMatricula.getImporte());

    }

    @Test
    public void verifyAllSubject() throws Exception {

        Vector<Asignatura> subjects = new Vector<Asignatura>();
        for (int i = 0; i < TOTAL_SUBJECTS; ++i) {
            Asignatura s = mock(Asignatura.class);
            when(s.getImporte()).thenReturn(FEE);
            subjects.add(s);
        }

        Matricula myMatricula = new Matricula(subjects);

        myMatricula.getImporte();


        for (Asignatura subject : subjects) {
            // Verify that all of the subject's cost is called
            verify(subject).getImporte();
        }

    }
     

}

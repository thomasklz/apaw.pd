package apaw.pd.Singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ReferencesFactorySolutionTest {

	@Test
    public void testReferencesFactoryIsSingleton() {
        assertSame(ReferencesFactorySolution.getFactory(), ReferencesFactorySolution.getFactory());
    }

    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(ReferencesFactorySolution.getFactory());
    }

    @Test
    public void testReferencesFactory() {
        assertEquals(0, ReferencesFactorySolution.getFactory().getReference("cero"));
        assertEquals(1, ReferencesFactorySolution.getFactory().getReference("uno"));
        ReferencesFactorySolution.getFactory().removeReference("cero");
        assertEquals(2, ReferencesFactorySolution.getFactory().getReference("cero"));
    }

}

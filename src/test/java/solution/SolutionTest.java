package solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void deveRetornar0PoisNaoMontouNenhumPar() {
        int [] array = {10,20,30,40,50};
        Solution solution = new Solution();
        int retorno = solution.sockMerchant(5, array);
        Assert.assertEquals(0, retorno);
    }

    @Test
    public void deveRetornar3PoisMontouPares() {
        int [] array = {10,10,20,20,30,30,60,50};
        Solution solution = new Solution();
        int retorno = solution.sockMerchant(5, array);
        Assert.assertEquals(3, retorno);
    }

}

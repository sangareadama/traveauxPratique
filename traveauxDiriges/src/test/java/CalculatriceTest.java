import com.eburtis.traveauxDiriges.TestClasses.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CalculatriceTest {
    Calculatrice calcul;
    double a,b,c,result;

    @BeforeEach
    void setUp() throws Exception {

        calcul = new Calculatrice();
        a= new Random().nextDouble()*50;
        b= new Random().nextDouble()*50;
    }

    @Test
    void additionTest() {
        result=a+b;
        Assertions.assertEquals(result,calcul.addition(a,b));
    }

    @Test
    void soustractionTest() {
        result=a-b;
        Assertions.assertEquals(result,calcul.soustraction(a,b));
    }

    @Test
    void multiplicationTest() {
        result=a*b;
        Assertions.assertEquals(result,calcul.multiplication(a,b));
    }

    @Test
    void divisionTest() {
        result=a/b;
        Assertions.assertEquals(result,calcul.division(a,b));
    }

    @Test
    void carreTest(){
        result= a*a;
        Assertions.assertEquals(result,calcul.carre(a));
    }

    @Test
    void identitéRemarquableTest(){
        double a2=calcul.multiplication(a,a);
        double b2=calcul.multiplication(b,b);
        double ax2=calcul.multiplication(2,a);
        result= calcul.addition(calcul.addition(a2,calcul.multiplication(ax2,b)),b2);
        Assertions.assertEquals(result,calcul.identiteRemarquable(a,b));
    }

    @Test
    void serviceTest(){
        result= a*a;
        Assertions.assertEquals(result,calcul.carre(a));
    }


}

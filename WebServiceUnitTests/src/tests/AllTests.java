package tests;

import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
						MathsOneWebServiceTest.class,
						MathsTwoWebServiceTest.class,
						MathsThreeWebServiceTest.class,
						ShopOneWebServiceTest.class,
						ShopTwoWebServiceTest.class
					})
public class AllTests {

}

package tests;

import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
						PizzaShopOneTest.class,
						PizzaShopTwoTest.class,
						PizzaShopThreeTest.class
					})
public class AllTests {

}

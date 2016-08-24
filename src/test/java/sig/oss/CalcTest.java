import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

        @Test
	        public void testAdd() {
		                Calc c=new Calc();
				                assertEquals(30,c.add(10,20));
						                }
		public void testsub() {
				Calc c=new Calc();
						assertEquals(30,c.sub(10,20));
								}
							
		public void testmul() {
				Calc c=new Calc();
						assertEquals(200,c.mul(10,20));
						}
						}

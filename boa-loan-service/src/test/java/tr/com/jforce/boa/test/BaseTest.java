package tr.com.jforce.boa.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tr.com.jforce.loan.starter.LoanServiceStarter;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest( webEnvironment = WebEnvironment.RANDOM_PORT, classes = LoanServiceStarter.class )
public class BaseTest {

}

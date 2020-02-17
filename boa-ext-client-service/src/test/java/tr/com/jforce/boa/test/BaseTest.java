package tr.com.jforce.boa.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tr.com.jforce.extclients.starter.ExtClientServiceStarter;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest( webEnvironment = WebEnvironment.RANDOM_PORT, classes = ExtClientServiceStarter.class )
public class BaseTest {

}

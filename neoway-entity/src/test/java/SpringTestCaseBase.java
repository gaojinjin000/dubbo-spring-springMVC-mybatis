/**
 * File Name    : SpringTestCaseBase
 * Creator      : liangfen
 * Created Date : 16/11/12
 * Comment      :
 */
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:META-INF/spring/spring.xml"
        }
)
public abstract class SpringTestCaseBase extends AbstractJUnit4SpringContextTests {
//    protected static final Logger logger = LogManager.getLogger();

    @Before
    public abstract void setUp();

    @After
    public abstract void tearDown();
}

import static org.junit.Assert.*;

/**
 * Created by seth on 12/28/16.
 */
public class ConnectionManagerTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void connect() throws Exception {
        Bot bot = new Bot();
        ConnectionManager cm = new ConnectionManager();
        cm.connect(bot);
    }

}
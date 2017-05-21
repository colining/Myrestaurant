package log4j2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by asus on 2017/5/20.
 */
public interface Log4j2test {
    Logger logger = LogManager.getLogger("mylog");

}

package log4j2;

/**
 * Created by asus on 2017/5/20.
 */
public class Log4j implements Log4j2test {
    public static void main(String[] args) {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

    }
}

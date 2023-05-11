package org.example.MyLog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    public  static final Logger logger =Logger.getLogger("mylog");

    public static void main(String[] args) throws IOException
    {
        try{
            logger.setLevel(Level.ALL);
            logger.setUseParentHandlers(false);
            var hander =new FileHandler();
            hander.setLevel(Level.ALL);
            logger.addHandler(hander);
        }
        catch(IOException e)
        {
            logger.log(Level.SEVERE,"不能创建文件处理器",e);
        }
    }
}

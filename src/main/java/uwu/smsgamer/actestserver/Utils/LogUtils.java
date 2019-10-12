package uwu.smsgamer.actestserver.Utils;

import uwu.smsgamer.actestserver.ACTestServer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Some log utilities that will be used a lot throughout my program.
 */
public class LogUtils {
    /**
     * Logs a message to a file of your choice..
     *
     * @param message Message you want to log to file.
     */
    public static void logToFile(String message) {

        try {
            File dataFolder = ACTestServer.instance.getDataFolder();

            if (!dataFolder.exists()) {
                dataFolder.mkdir();
            }

            File saveTo = new File(ACTestServer.instance.getDataFolder(), "Punishment.log");
            if (!saveTo.exists()) {
                saveTo.createNewFile();
            }

            FileWriter fw = new FileWriter(saveTo, true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(message);

            pw.flush();

            pw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}

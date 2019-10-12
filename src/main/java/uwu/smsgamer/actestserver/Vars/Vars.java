package uwu.smsgamer.actestserver.Vars;

import uwu.smsgamer.actestserver.ACTestServer;
import uwu.smsgamer.actestserver.Utils.ChatUtils;

/**
 * Stores values (vars, variables) that will be taken from a config file and used in this program.
 */
public class Vars {

    public static String ps_msg = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("punished_msg"));
    public static String no_type = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("no_type"));
    public static String no_player = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("no_player"));
    public static String forgive = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("forgive_msg"));
    public static String forgive_not_found = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("forgive_not_found"));
    public static String no_perm = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("no_perm"));
    public static String check_vl = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("check_vl"));
    public static String set_vl = ChatUtils.colorize((String) ACTestServer.instance.getConfig().get("set_msg"));
}


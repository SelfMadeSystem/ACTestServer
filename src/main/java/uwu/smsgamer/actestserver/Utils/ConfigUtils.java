package uwu.smsgamer.actestserver.Utils;

import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;

/**
 * Utils for config stuff.
 */
public class ConfigUtils {
    /**
     * Sets a string for someone.
     *
     * @param p Player to set.
     * @param thing What to set.
     * @param set How to set it.
     */
    public static void setString(String p, String thing, String set) {
        ConfigManager.instance.getPlayers().set(thing+"." + p, set);
        ConfigManager.instance.savePlayers();
    }

    /**
     * Sets a boolean for someone.
     *
     * @param p Player to set.
     * @param thing What to set.
     * @param set How to set it.
     */
    public static void setBoolean(String p, String thing, boolean set) {
        ConfigManager.instance.getPlayers().set(thing+"." + p, set);
        ConfigManager.instance.savePlayers();
    }

    /**
     * Toggles a boolean for someone.
     *
     * @param p Player to set.
     * @param thing What to set.
     */
    public static void toggleBoolean(String p, String thing){
        if (ConfigManager.instance.getPlayers().getBoolean(thing+"." + p)) {
            ConfigManager.instance.getPlayers().set(thing+"." + p, true);
            ConfigManager.instance.savePlayers();
        } else {
            ConfigManager.instance.getPlayers().set(thing+"." + p, false);
            ConfigManager.instance.savePlayers();
        }
    }
}

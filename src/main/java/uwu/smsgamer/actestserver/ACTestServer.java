package uwu.smsgamer.actestserver;

import me.lucko.luckperms.api.LuckPermsApi;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import uwu.smsgamer.actestserver.Commands.Commands;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;
import uwu.smsgamer.actestserver.Events.Events;

import java.io.File;

public final class ACTestServer extends JavaPlugin {

    public static ACTestServer instance;
    public static LuckPermsApi api;


    @Override
    public void onEnable() {
        instance = this;
        getCommand("anticheat").setExecutor(new Commands());
        //getCommand("verbose").setExecutor(new Commands());
        getCommand("damage").setExecutor(new Commands());
        getCommand("hunger").setExecutor(new Commands());

        getServer().getPluginManager().registerEvents(new Events(), this);

        loadConfigManager();

        RegisteredServiceProvider<LuckPermsApi> provider = Bukkit.getServicesManager().getRegistration(LuckPermsApi.class);
        if (provider != null) {
            api = provider.getProvider();
        }

    }

    @Override
    public void onDisable() {}

    /**
     * Used to load configuration file: players.yml
     */
    public void loadConfigManager() {
        ConfigManager cfgm = new ConfigManager();
        cfgm.setup();
        cfgm.savePlayers();
        cfgm.reloadPlayers();
    }

    /**
     * Used to load configuration file: config.yml
     */
    public void loadConfig() {
        File configFile = new File(this.getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            saveDefaultConfig();
        }
    }
}

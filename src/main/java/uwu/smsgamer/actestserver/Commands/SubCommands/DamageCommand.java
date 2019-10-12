package uwu.smsgamer.actestserver.Commands.SubCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;
import uwu.smsgamer.actestserver.Utils.ConfigUtils;

/**
 * CheckVl command.
 */
public class DamageCommand {
    /**
     * Executes the damage command.
     *
     * @param sender Source of the command
     * @param cmd    Command which was executed
     * @param label  Alias of the command which was used
     * @param args   Passed command arguments
     */
    public static void damageCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length == 0) {
            if (ConfigManager.instance.getPlayers().getBoolean("damage." + sender.getName())) {
                ConfigUtils.setBoolean(sender.getName(), "damage",false);
                sender.sendMessage(ChatColor.RED + "Disabled damage!");
            } else {
                ConfigUtils.setBoolean(sender.getName(), "damage",true);
                sender.sendMessage(ChatColor.GREEN + "Enabled damage!");
            }
        }else {
            if(args[0].startsWith("y") || args[0].startsWith("t")){
                ConfigUtils.setBoolean(sender.getName(), "damage",true);
                sender.sendMessage(ChatColor.GREEN + "Enabled damage!");
            }else {
                ConfigUtils.setBoolean(sender.getName(), "damage",false);
                sender.sendMessage(ChatColor.RED + "Disabled damage!");
            }
        }
    }
}

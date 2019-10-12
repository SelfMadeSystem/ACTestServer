package uwu.smsgamer.actestserver.Commands.SubCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;
import uwu.smsgamer.actestserver.Utils.ChatUtils;
import uwu.smsgamer.actestserver.Utils.ConfigUtils;

/**
 * CheckVl command.
 */
public class VerboseCommand {
    /**
     * Executes the verbose command.
     *
     * @param sender Source of the command
     * @param cmd    Command which was executed
     * @param label  Alias of the command which was used
     * @param args   Passed command arguments
     */
    public static void verboseCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length == 0) {
            if (ConfigManager.instance.getPlayers().getBoolean("verbose." + sender.getName())) {
                ConfigUtils.setBoolean(sender.getName(), "verbose",false);
                sender.sendMessage(ChatColor.RED + "Disabled verbose!");
            } else {
                ConfigUtils.setBoolean(sender.getName(), "verbose",true);
                sender.sendMessage(ChatColor.GREEN + "Enabled verbose! You will see everyone's verbose.");
            }
        }
    }
}

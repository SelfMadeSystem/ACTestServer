package uwu.smsgamer.actestserver.Commands.SubCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;
import uwu.smsgamer.actestserver.Utils.ChatUtils;
import uwu.smsgamer.actestserver.Utils.ConfigUtils;

/**
 * CheckVl command.
 */
public class ACCommand {
    /**
     * Executes the anticheat command.
     *
     * @param sender Source of the command
     * @param cmd    Command which was executed
     * @param label  Alias of the command which was used
     * @param args   Passed command arguments
     */
    public static void acCommand(CommandSender sender, Command cmd, String label, String[] args) {

        /*TODO: AAC NCP PAC HZ MX and SPRT will all be interchangeable.
         * AACAP SEARCH NCPDragDown ETC will all be toggleable.
         */

        if(!(sender instanceof Player))
            

        if(args.length == 0){
            sender.sendMessage(ChatUtils.colorize("&c/"+label+" <anticheat>\n" +
                    "Interchangeable: [&6AAC&7, NCP, &cP&6AC&7, &9Horizon, &dMatrix&c]\n" +
                    "Toggleable: &c[&6AACAP&7, &cSearch&7&c]"));
            return;
        }
        if(args[0].equalsIgnoreCase("aac")){
            ConfigUtils.setString(sender.getName(), "anticheat", "aac");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &6AAC"));

            return;
        }
        if(args[0].equalsIgnoreCase("ncp")){
            ConfigUtils.setString(sender.getName(), "anticheat", "ncp");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &7NCP"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            return;
        }
        if(args[0].equalsIgnoreCase("phoenix") ||
                args[0].equalsIgnoreCase("pac")){
            ConfigUtils.setString(sender.getName(), "anticheat", "pac");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &cP&6AC"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            return;
        }
        if(args[0].equalsIgnoreCase("horizon") ||
                args[0].equalsIgnoreCase("hz") ||
                args[0].equalsIgnoreCase("ho") ||
                args[0].equalsIgnoreCase("hori")){
            ConfigUtils.setString(sender.getName(), "anticheat", "hz");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &9Horizon"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            return;
        }
        if(args[0].equalsIgnoreCase("matrix") ||
                args[0].equalsIgnoreCase("mtrx") ||
                args[0].equalsIgnoreCase("mx")){
            ConfigUtils.setString(sender.getName(), "anticheat", "mx");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &dMatrix"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* false");
            return;
        }
        if(args[0].equalsIgnoreCase("aacap")){
            if(!ConfigManager.instance.getPlayers().getBoolean("aacap." + sender.getName())){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass false");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass.* false");
                sender.sendMessage(ChatUtils.colorize("&aEnabled &6AACAP&a!"));
                ConfigUtils.setBoolean(sender.getName(), "aacap", true);
            }else{
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass true");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass.* true");
                sender.sendMessage(ChatUtils.colorize("&cDisabled &6AACAP&c!"));
                ConfigUtils.setBoolean(sender.getName(), "aacap", false);
            }
            return;
        }
        if(args[0].equalsIgnoreCase("search") ||
                args[0].equalsIgnoreCase("srch")){
            if(!ConfigManager.instance.getPlayers().getBoolean("srch." + sender.getName())){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass false");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass.* false");
                sender.sendMessage(ChatUtils.colorize("&aEnabled &cSearch&a!"));
                ConfigUtils.setBoolean(sender.getName(), "srch", true);
            }else{
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass true");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass.* true");
                sender.sendMessage(ChatUtils.colorize("&cDisabled Search!"));
                ConfigUtils.setBoolean(sender.getName(), "srch", false);
            }
            return;
        }
        sender.sendMessage(ChatUtils.colorize("&cWe don't know of: &d"+args[0]+"&c, sorry."));
    }
}

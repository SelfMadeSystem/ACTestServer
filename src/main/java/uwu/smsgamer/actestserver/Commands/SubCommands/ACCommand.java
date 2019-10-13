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

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Only players can use this command.");
        }
        assert sender instanceof Player;
        Player p = (Player) sender;
        p.sendMessage("Note: you might have to relog to change anticheat.");

        if(args.length == 0){
            sender.sendMessage(ChatUtils.colorize("&c/"+label+" <anticheat>\n" +
                    "Interchangeable: [&6AAC&7, NCP, &cP&6AC&7, &9Horizon, &dMatrix&7, None&c]\n" +
                    "Toggleable: &c[&6AACAP&7, &c&lSearch&7&c]"));
            sender.sendMessage(ChatUtils.colorize("&7Currently selected: " +
                    ConfigManager.instance.getPlayers().getString("anticheat." + p.getName())));
            sender.sendMessage(ChatUtils.colorize("&6AACAdditionPro&7: " + ConfigManager.instance.getPlayers().getBoolean("aacap." + sender.getName())));
            sender.sendMessage(ChatUtils.colorize("&c&lSearch&7: " + ConfigManager.instance.getPlayers().getBoolean("aacap." + sender.getName())));
            return;
        }
        if(args[0].equalsIgnoreCase("off") ||
                args[0].equalsIgnoreCase("vanilla") ||
                args[0].equalsIgnoreCase("van") ||
                args[0].equalsIgnoreCase("none")){
            ConfigUtils.setString(sender.getName(), "anticheat", "none");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &7None"));
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("aac")){
            ConfigUtils.setString(sender.getName(), "anticheat", "&6AAC");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &6AAC"));
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("ncp")){
            ConfigUtils.setString(sender.getName(), "anticheat", "ncp");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &7NCP"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("phoenixanticheat") ||
                args[0].equalsIgnoreCase("phoenix") ||
                args[0].equalsIgnoreCase("pac")){
            ConfigUtils.setString(sender.getName(), "anticheat", "&cPhoenix&7 AntiCheat");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &cP&6AC"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("horizon") ||
                args[0].equalsIgnoreCase("hz") ||
                args[0].equalsIgnoreCase("ho") ||
                args[0].equalsIgnoreCase("hori")){
            ConfigUtils.setString(sender.getName(), "anticheat", "&9Horizon");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &9Horizon"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* true");
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("matrix") ||
                args[0].equalsIgnoreCase("mtrx") ||
                args[0].equalsIgnoreCase("mx")){
            ConfigUtils.setString(sender.getName(), "anticheat", "&dMatrix");
            sender.sendMessage(ChatUtils.colorize("&aSet your anticheat to: &dMatrix"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aac.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set nocheatplus.checks.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set phoenix.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set horizon.bypass.* true");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set matrix.bypass.* false");
            ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                    10, 100, 10);
            return;
        }
        if(args[0].equalsIgnoreCase("aacadditionpro") || args[0].equalsIgnoreCase("aacap") || args[0].equalsIgnoreCase("aacp")){
            if(!ConfigManager.instance.getPlayers().getBoolean("aacap." + sender.getName())){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass false");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass.* false");
                sender.sendMessage(ChatUtils.colorize("&aEnabled &6AACAP&a!"));
                ConfigUtils.setBoolean(sender.getName(), "aacap", true);
                ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                        10, 100, 10);
            }else{
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass true");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set aacadditionpro.bypass.* true");
                sender.sendMessage(ChatUtils.colorize("&cDisabled &6AACAP&c!"));
                ConfigUtils.setBoolean(sender.getName(), "aacap", false);
                ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                        10, 100, 10);
            }
            return;
        }
        if(args[0].equalsIgnoreCase("search") ||
                args[0].equalsIgnoreCase("srch")){
            if(!ConfigManager.instance.getPlayers().getBoolean("srch." + sender.getName())){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass false");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass.* false");
                sender.sendMessage(ChatUtils.colorize("&aEnabled &c&lSearch&a!"));
                ConfigUtils.setBoolean(sender.getName(), "srch", true);
                ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                        10, 100, 10);
            }else{
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass true");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user "+sender.getName()+" permission set search.bypass.* true");
                sender.sendMessage(ChatUtils.colorize("&cDisabled &lSearch&c!"));
                ConfigUtils.setBoolean(sender.getName(), "srch", false);
                ((Player) sender).sendTitle("Please wait a few seconds or relog", "while the anticheats notice you've changed permissions.",
                        10, 100, 10);
            }
            return;
        }
        sender.sendMessage(ChatUtils.colorize("&cWe don't know of: &d"+args[0]+"&c, sorry."));
    }
}

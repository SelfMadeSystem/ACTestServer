package uwu.smsgamer.actestserver.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerKickEvent;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;

public class Events implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player))
            return;
        Player p = ((Player) e.getEntity()).getPlayer();
        if (p.getWorld().getName().equalsIgnoreCase("TestArena")) {
            if (!ConfigManager.instance.getPlayers().getBoolean("damage." + p.getName()))
                e.setCancelled(true);
        }
    }

    @EventHandler
    public void onHunger(FoodLevelChangeEvent e) {
        if (!(e.getEntity() instanceof Player))
            return;
        Player p = ((Player) e.getEntity()).getPlayer();
        if (p.getWorld().getName().equalsIgnoreCase("TestArena")) {
            if (!ConfigManager.instance.getPlayers().getBoolean("hunger." + p.getName()))
                e.setCancelled(true);
        }
    }

    @EventHandler
    public void onKick(PlayerKickEvent e) {
        if (e.getReason().equalsIgnoreCase("Kicked for spamming")){
            e.setCancelled(true);
            return;
        }
        if (!e.getReason().contains(" {kick}")/* &&
                (e.getReason().contains("aac") ||
                e.getReason().contains("horizon") || e.getReason().contains("matrix"))*/) {
            e.setCancelled(true);
            e.getPlayer().sendTitle("You would've been kicked for", e.getReason(), 10, 50, 10);
            return;
        }
    }
}

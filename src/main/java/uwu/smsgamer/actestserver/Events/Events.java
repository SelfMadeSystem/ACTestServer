package uwu.smsgamer.actestserver.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import uwu.smsgamer.actestserver.ConfigManager.ConfigManager;

public class Events implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent e){
        if(!(e.getEntity() instanceof Player))
            return;
        Player p = ((Player) e.getEntity()).getPlayer();
        if(p.getWorld().getName().equalsIgnoreCase("TestArena")){
            if(!ConfigManager.instance.getPlayers().getBoolean("damage." + p.getName()))
                e.setCancelled(true);
        }
    }

    @EventHandler
    public void onHunger(FoodLevelChangeEvent e){
        if(!(e.getEntity() instanceof Player))
            return;
        Player p = ((Player) e.getEntity()).getPlayer();
        if(p.getWorld().getName().equalsIgnoreCase("TestArena")){
            if(!ConfigManager.instance.getPlayers().getBoolean("hunger." + p.getName()))
                e.setCancelled(true);
        }
    }
}

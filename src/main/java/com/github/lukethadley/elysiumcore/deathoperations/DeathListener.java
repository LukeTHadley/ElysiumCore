package com.github.lukethadley.elysiumcore.deathoperations;

import com.github.lukethadley.elysiumcore.ElysiumCore;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Objects;

public class DeathListener implements Listener {

    private final ElysiumCore plugin;

    public DeathListener(ElysiumCore plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void playerDeathEvent(PlayerDeathEvent e){

        String world = e.getEntity().getWorld().getName();
        int x = e.getEntity().getLocation().getBlockX();
        int y = e.getEntity().getLocation().getBlockY();
        int z = e.getEntity().getLocation().getBlockZ();

        String prefix = ChatColor.RED + "" + ChatColor.BOLD + "Death" + ChatColor.DARK_GRAY + " >> ";

        Objects.requireNonNull(e.getEntity().getPlayer()).sendMessage(prefix + ChatColor.GRAY + "You died in " + ChatColor.AQUA + world + ChatColor.GRAY + " at position X:" + ChatColor.AQUA + x + ChatColor.GRAY + " Y:" + ChatColor.AQUA + y + ChatColor.GRAY + " Z:" + ChatColor.AQUA + z );

        plugin.getLogger().info("Player '" + e.getEntity().getPlayer().getName() + "' died in '" + world + "' at position X:" + x + " Y:" + y + " Z:" + z);

    }
}

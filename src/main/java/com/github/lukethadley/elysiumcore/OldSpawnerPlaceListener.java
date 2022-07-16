package com.github.lukethadley.elysiumcore;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class OldSpawnerPlaceListener implements Listener {

    @EventHandler
    public void onSpawnerPlaceEvent(BlockPlaceEvent e){
        ItemStack item = e.getItemInHand();
        if (item.getType() == Material.SPAWNER && item.getItemMeta().getDisplayName().equals("§dSpawner")){
                e.getPlayer().sendRawMessage(ChatColor.translateAlternateColorCodes('&',"&d&lSpawners &8>> &7This is an old spawner type and can't be used. Please give it to &bThomas&7 or &bPixlelily &7to replace!"));
                e.setCancelled(true);
        }

    }
}

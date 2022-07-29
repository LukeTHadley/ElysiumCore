package com.github.lukethadley.elysiumcore;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NoShulkerExplosion implements Listener {


    @EventHandler
    public void blockDestroyEventHandler(BlockDestroyEvent event){
        if (event.getBlock().getType() == Material.SHULKER_BOX){
            event.setCancelled(true);
        }

    }


}

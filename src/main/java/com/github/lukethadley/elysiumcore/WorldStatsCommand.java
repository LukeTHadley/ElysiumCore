package com.github.lukethadley.elysiumcore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class WorldStatsCommand implements CommandExecutor {

    private final ElysiumCore plugin;

    public WorldStatsCommand(ElysiumCore plugin){
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        final HashMap<String, Integer> counter = new HashMap<String, Integer>();
        for (Player player : plugin.getServer().getOnlinePlayers()){
            if (!counter.containsKey(player.getWorld().getName())){
                counter.put(player.getWorld().getName(), 1);
            }
            else {
                counter.replace(player.getWorld().getName(), counter.get(player.getWorld().getName()) + 1);
            }
        }

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&3&lElysiumCore &8>> &7Count of players and what world they are in:"));
        for (String key : counter.keySet()){
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "     &b" + key + " &7- &7" + counter.get(key) + " players"));
        }

        return true;
    }
}

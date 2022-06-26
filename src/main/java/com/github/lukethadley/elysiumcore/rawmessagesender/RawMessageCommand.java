package com.github.lukethadley.elysiumcore.rawmessagesender;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RawMessageCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("elysiumcore.rawmessage")){

            if (args.length == 0){
                sender.sendMessage(ChatColor.RED + "You must have a message, silly!");
                return false;
            }

            String message = "";
            for (String word : args){
                message = message + word + " ";
            }

            sender.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
            return true;


        }
        else {
            sender.sendMessage(ChatColor.RED + "You do not have permissions for " + ChatColor.DARK_RED + "/rawmessage");
        }
        return true;
    }
}

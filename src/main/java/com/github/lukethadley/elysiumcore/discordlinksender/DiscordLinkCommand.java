package com.github.lukethadley.elysiumcore.discordlinksender;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordLinkCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String linkMsg = "&9&lDiscord &8>> &7Join our Discord Server here! &bhttps://discord.gg/NMV4jAD9AQ";
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', linkMsg));
        return true;
    }
}

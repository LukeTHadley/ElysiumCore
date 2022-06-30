package com.github.lukethadley.elysiumcore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class VoteLinkCommand implements CommandExecutor {

    public static final String VOTE_LINK_1 = "&bhttps://minecraftservers.org/server/638039";
    public static final String VOTE_LINK_2 = "&bhttps://minecraft.buzz/vote/5364";
    public static final String VOTE_LINK_3 = "&bhttps://minecraft-server-list.com/server/488983/vote/";
    public static final String VOTE_LINK_4 = "&bhttps://minecraft-mp.com/server/306672/vote/";
    public static final String VOTE_LINK_5 = "&bhttps://minecraft-server.net/vote/ElysiumTowny/";

    public static final String VOTE_SITE_NAME_1 = "&dminecraftServer.org &8-";
    public static final String VOTE_SITE_NAME_2 = "&dminecraft.buzz &8-";
    public static final String VOTE_SITE_NAME_3 = "&dminecraft-server-list.com &8-";
    public static final String VOTE_SITE_NAME_4 = "&dminecraft-mp.com &8-";
    public static final String VOTE_SITE_NAME_5 = "&dminecraft-server.net &8-";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {




        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&3&lVote Links &7-----"));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_SITE_NAME_1));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_LINK_1));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_SITE_NAME_2));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_LINK_2));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_SITE_NAME_3));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_LINK_3));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_SITE_NAME_4));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_LINK_4));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_SITE_NAME_5));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', VOTE_LINK_5));

        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7----------------"));



        return true;
    }

}

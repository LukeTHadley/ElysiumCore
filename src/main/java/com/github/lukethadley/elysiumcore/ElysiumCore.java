package com.github.lukethadley.elysiumcore;

import com.github.lukethadley.elysiumcore.deathoperations.DeathListener;
import com.github.lukethadley.elysiumcore.discordlinksender.DiscordLinkCommand;
import com.github.lukethadley.elysiumcore.rawmessagesender.RawMessageCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class ElysiumCore extends JavaPlugin {

    @Override
    public void onEnable() {

        // Attach all command handlers for the plugin
        getCommand("rawmessage").setExecutor(new RawMessageCommand());
        getCommand("discord").setExecutor(new DiscordLinkCommand());
        getCommand("vote").setExecutor(new VoteLinkCommand());
        getCommand("resource").setExecutor(new ResourceCommand());

        // Attach the DeathMessages listener to be active for this plugin
        getServer().getPluginManager().registerEvents(new DeathListener(this), this);

    }

}
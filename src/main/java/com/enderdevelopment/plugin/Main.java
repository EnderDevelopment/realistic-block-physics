package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BlockPhysicsSimulator has been enabled!");
        getServer().getPluginManager().registerEvents(new BlockPhysicsListener(), this);
        this.getCommand("physics").setExecutor(new PhysicsCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("BlockPhysicsSimulator has been disabled!");
    }
}
package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PhysicsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("on")) {
                // Enable physics simulation
                sender.sendMessage("Block physics simulation enabled");
                return true;
            } else if (args[0].equalsIgnoreCase("off")) {
                // Disable physics simulation
                sender.sendMessage("Block physics simulation disabled");
                return true;
            }
        }
        return false;
    }
}
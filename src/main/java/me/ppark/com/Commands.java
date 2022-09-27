package me.ppark.com;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] strings) {
        if (!(commandSender instanceof Player)) {
            CommandSender cs = (CommandSender) commandSender;
            cs.sendMessage(ChatColor.RED + "Only Player!");
            return false;
        } else if (commandSender instanceof Player) {
            if (string.equalsIgnoreCase("skills")) {
                Player p = (Player) commandSender;
                p.sendMessage(ChatColor.RED + "Nothing!");
                p.getInventory().addItem(new ItemStack(Material.BARRIER));
                return true;
            }
            if (string.equalsIgnoreCase("tests")) {
                Player p = (Player) commandSender;
                p.sendActionBar(ChatColor.GREEN + "Complete!");
                p.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
                return true;
            }
            return false;
        }
        return false;
    }
}
package me.ppark.event;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String PName = p.getName();
        if (p.isOp()) {
            e.setJoinMessage(ChatColor.AQUA + PName + ChatColor.GRAY + "(이)가 "
                    + ChatColor.UNDERLINE + ChatColor.GREEN + "참여" + ChatColor.RESET
                    + ChatColor.GRAY + "하였습니다");
        } else {
            e.setJoinMessage(ChatColor.DARK_PURPLE + PName + ChatColor.GRAY + "(이)가 "
                    + ChatColor.UNDERLINE + ChatColor.GREEN + "참여" + ChatColor.RESET
                    + ChatColor.GRAY + "하였습니다");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String PName = p.getName();
        if (p.isOp()) {
            e.setQuitMessage(ChatColor.AQUA + PName + ChatColor.GRAY + "(이)가 "
                    + ChatColor.UNDERLINE + ChatColor.RED + "퇴장" + ChatColor.RESET
                    + ChatColor.GRAY + "하였습니다");
        } else {
            e.setQuitMessage(ChatColor.DARK_PURPLE + PName + ChatColor.GRAY + "(이)가 "
                    + ChatColor.UNDERLINE + ChatColor.RED + "퇴장" + ChatColor.RESET
                    + ChatColor.GRAY + "하였습니다");
        }
    }

    @EventHandler
    public void onEvent(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();

        if (a == Action.LEFT_CLICK_AIR) {
            p.sendMessage(ChatColor.RED + "[LEFT_CLICK_AIR]");
        } if (a == Action.RIGHT_CLICK_AIR) {
            p.sendMessage(ChatColor.RED + "[RIGHT_CLICK_AIR]");
        }
    }
}

package me.ppark.main;

import me.ppark.com.Commands;
import me.ppark.event.Events;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    String ver = getDescription().getVersion();

    @Override
    public void onEnable() {
        System.out.println("Ver " + ver);
        getCommand("skills").setExecutor(new Commands());
        getCommand("tests").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Bye");
    }
}

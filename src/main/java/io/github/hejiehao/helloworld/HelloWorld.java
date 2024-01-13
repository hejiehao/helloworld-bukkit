package io.github.hejiehao.helloworld;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
    public void onEnable() {
        say("HelloWorld");
    }

    public void onDisable() {
    }

    public void say(String s) {
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(s);
    }
}

package code.joe;

import code.joe.Commands.reloadCommand;
import code.joe.Config.Config;
import code.joe.Listeners.JoinListener;
import code.joe.Managers.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class JoinItem extends JavaPlugin {
    //为主类实现单例
    private static JoinItem instance;
    public JoinItem() {
        super();
    }
    public static JoinItem getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        saveDefaultConfig();
        Objects.requireNonNull(getCommand("joinitem")).setExecutor(new reloadCommand());
        ConfigManager.loadConfig();
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getConsoleSender().sendMessage(Config.getPrefix() + "§a插件已加载！");
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(Config.getPrefix() + "§c插件已卸载！");
    }
}

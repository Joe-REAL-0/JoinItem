package code.joe.Managers;

import code.joe.Config.Config;
import code.joe.JoinItem;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class ConfigManager {
    public static void loadConfig() {
        FileConfiguration configFile = JoinItem.getInstance().getConfig();
        Config config = Config.getInstance();
        config.setItemName(configFile.getString("name"));
        config.setMaterialName(configFile.getString("item"));
        config.setItemLore(configFile.getStringList("lore"));
    }
    public static void reloadConfig() {
        JoinItem.getInstance().reloadConfig();
        loadConfig();
    }
}

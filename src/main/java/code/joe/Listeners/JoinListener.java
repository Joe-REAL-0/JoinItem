package code.joe.Listeners;

import code.joe.Config.Config;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.Objects;

public class JoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        PlayerInventory inventory = event.getPlayer().getInventory();
        ItemStack item = inventory.getItem(31);
        if(item != null) return;
        ItemStack itemToSend = new ItemStack(Material.valueOf(Config.getInstance().getMaterialName()));
        try{
            Objects.requireNonNull(itemToSend.getItemMeta()).setDisplayName(Config.getInstance().getItemName());
        }catch (NullPointerException e){
            Bukkit.getConsoleSender().sendMessage(Config.getPrefix() + "§c配置文件中的物品名字不合法！");
        }
        Objects.requireNonNull(itemToSend.getItemMeta()).setLore(Config.getInstance().getItemLore());
        inventory.setItem(31, itemToSend);
    }
}

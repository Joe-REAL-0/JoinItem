package code.joe.Commands;

import code.joe.Config.Config;
import code.joe.Managers.ConfigManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class reloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(command.getName().equalsIgnoreCase("joinitem"))) return true;
        if(!sender.hasPermission("joinitem.reload")) {
            sender.sendMessage(Config.getPrefix() + "§c你没有权限！");
            return true;
        }
        if(args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            ConfigManager.reloadConfig();
            sender.sendMessage(Config.getPrefix() + "§a重载成功！");
        }
        return true;
    }
}

package code.joe.Config;

import java.util.List;

public class Config {
    //为Config实现单例
    private static Config instance;
    public Config() {
        instance = this;
    }
    public static Config getInstance() {
        return instance;
    }
    public static String getPrefix() {
        return "§7[§6JoinItem§7] ";
    }
    private String ItemName;
    private String MaterialName;
    private List<String> ItemLore;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String materialName) {
        MaterialName = materialName;
    }

    public List<String> getItemLore() {
        return ItemLore;
    }

    public void setItemLore(List<String> itemLore) {
        ItemLore = itemLore;
    }
}

package openmodularturrets.items.addons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import openmodularturrets.handler.ConfigHandler;
import openmodularturrets.reference.ModInfo;
import openmodularturrets.reference.Names;

import java.util.List;

public class DamageAmpAddonItem extends AddonItem {
    public DamageAmpAddonItem() {
        super();

        this.setUnlocalizedName(Names.Items.unlocalisedDamageAmpAddon);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":damageAmpAddon");
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.RED + StatCollector.translateToLocal("turret.addon.label"));
        p_77624_3_.add("");
        p_77624_3_.add(StatCollector.translateToLocal(
                "turret.addon.amp.a.label") + " " + ConfigHandler.getDamageAmpDmgBonus() + " " + StatCollector.translateToLocal(
                "turret.addon.amp.b.label"));
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("turret.addon.amp.flavour"));
    }
}
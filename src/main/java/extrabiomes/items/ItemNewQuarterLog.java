/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.items;

import java.util.List;
import java.util.Locale;

import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import extrabiomes.blocks.BlockCustomSapling;
import extrabiomes.blocks.BlockMiniLog;
import extrabiomes.helpers.ToolTipStringFormatter;
import extrabiomes.utility.MultiItemBlock;

public class ItemNewQuarterLog extends ItemBlock
{    
    public ItemNewQuarterLog(final Block block)
    {
        super(block);
        this.setHasSubtypes(false);
        this.setMaxDamage(0);
    }

    @Override
    public void addInformation(ItemStack itemForTooltip, EntityPlayer playerViewingToolTip, List listOfLines, boolean sneaking) {
      String line = LanguageRegistry.instance().getStringLocalization("extrabiomes.cornerlog.crafting");
      
      if(!line.equals("extrabiomes.cornerlog.crafting")) {
        if(listOfLines.size() > 0 && ((String)listOfLines.get(0)).length() > 20) {
          ToolTipStringFormatter.Format(line, listOfLines, ((String)listOfLines.get(0)).length() + 5);
        } else {
          ToolTipStringFormatter.Format(line, listOfLines);
        }
      }
    }
    
}

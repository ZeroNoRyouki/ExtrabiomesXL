package extrabiomes.utility;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import extrabiomes.api.Stuff;

public class CreativeTab extends CreativeTabs
{
    public CreativeTab(String par2Str)
    {
        super(par2Str);
    }

	@Override
	public Item getTabIconItem() {
		if(Stuff.scarecrow.isPresent()) return Stuff.scarecrow.get();
		else return null;
	}
    
}

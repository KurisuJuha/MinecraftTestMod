package jp.kyapp.minecrafttestmod;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("MinecraftTestMod")
public class MinecraftTestMod {

    public MinecraftTestMod(){
        MinecraftForge.EVENT_BUS.register(this);
    }
}

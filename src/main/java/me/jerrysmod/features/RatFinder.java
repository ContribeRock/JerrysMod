import me.jerrysmod.events.RenderEntityModelEvent;
import me.jerrysmod.utils.OutlineUtils;
import me.jerrysmod.utils.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;
import java.util.List;

public class RatFinder {

  private static List<Entity> rats = new ArrayList<>();
  
  @SubscribeEvent
  public void onEntityJoinWorld(EntityJoinWorldEvent event) {
  
    #Add location utils to check if you are in the hub
    if(event.entity.getName().contains("Rat")){
      rats.put(event.entity);
    }
  }
  
  @SubscribeEvent
  public void onRenderEntityModel(RenderEntityModelEvent event) {
    #check location is hub
    if(!rats.isEmpty && rats.contains(event.entity) {
      #Render NEU waypoint at the rat 
    } 
  }
  
}

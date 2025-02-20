package me.bymartrixx.vtd.mixin;

import me.bymartrixx.vtd.access.AbstractPackAccess;
import net.minecraft.client.gui.screen.pack.ResourcePackOrganizer;
import net.minecraft.resource.pack.ResourcePackProfile;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ResourcePackOrganizer.class)
public class ResourcePackOrganizerMixin {
    @Mixin(targets = "net/minecraft/client/gui/screen/pack/ResourcePackOrganizer$AbstractPack")
    public static class AbstractPackMixin implements AbstractPackAccess {
        @Shadow @Final
        private ResourcePackProfile profile;

        @Override
        public ResourcePackProfile vtdownloader$getProfile() {
            return this.profile;
        }
    }
}

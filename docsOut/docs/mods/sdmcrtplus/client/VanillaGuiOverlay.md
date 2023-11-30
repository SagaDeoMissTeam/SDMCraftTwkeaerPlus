# VanillaGuiOverlay

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.client.VanillaGuiOverlay;
```


## Enum Constants

VanillaGuiOverlay is an enum. It has 26 enum constants. They are accessible using the code below.

```zenscript
<constant:overlay:vignette>
<constant:overlay:spyglass>
<constant:overlay:helmet>
<constant:overlay:frostbite>
<constant:overlay:portal>
<constant:overlay:hotbar>
<constant:overlay:crosshair>
<constant:overlay:boss_event_progress>
<constant:overlay:player_health>
<constant:overlay:armor_level>
<constant:overlay:food_level>
<constant:overlay:mount_health>
<constant:overlay:air_level>
<constant:overlay:jump_bar>
<constant:overlay:experience_bar>
<constant:overlay:item_name>
<constant:overlay:sleep_fade>
<constant:overlay:debug_text>
<constant:overlay:fps_graph>
<constant:overlay:potion_icons>
<constant:overlay:record_overlay>
<constant:overlay:subtitles>
<constant:overlay:title_text>
<constant:overlay:scoreboard>
<constant:overlay:chat_panel>
<constant:overlay:player_list>
```
## Methods

:::group{name=getId}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)

```zenscript
// VanillaGuiOverlay.getId() as ResourceLocation

myVanillaGuiOverlay.getId();
```

:::


## Properties

| Name |                            Type                            | Has Getter | Has Setter |
|------|------------------------------------------------------------|------------|------------|
| id   | [ResourceLocation](/vanilla/api/resource/ResourceLocation) | true       | false      |


# Structure

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.world.level.levelgen.structure.Structure;
```


## Methods

:::group{name=getBiomes}

Return Type: stdlib.List&lt;[Biome](/vanilla/api/world/biome/Biome)&gt;

```zenscript
// Structure.getBiomes() as stdlib.List<Biome>

myStructure.getBiomes();
```

:::

:::group{name=getRegistryName}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)

```zenscript
// Structure.getRegistryName() as ResourceLocation

myStructure.getRegistryName();
```

:::


## Properties

|     Name     |                            Type                            | Has Getter | Has Setter |
|--------------|------------------------------------------------------------|------------|------------|
| biomes       | stdlib.List&lt;[Biome](/vanilla/api/world/biome/Biome)&gt; | true       | false      |
| registryName | [ResourceLocation](/vanilla/api/resource/ResourceLocation) | true       | false      |


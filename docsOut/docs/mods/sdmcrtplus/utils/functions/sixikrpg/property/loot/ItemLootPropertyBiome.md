# ItemLootPropertyBiome

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyBiome;
```


## Extending ItemLootPropertyBase

ItemLootPropertyBiome extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyBiome

## Constructors


```zenscript
new ItemLootPropertyBiome(biome as Biome) as ItemLootPropertyBiome
```
| Parameter |                  Type                   |
|-----------|-----------------------------------------|
| biome     | [Biome](/vanilla/api/world/biome/Biome) |



## Methods

:::group{name=getBiome}

Return Type: [Biome](/vanilla/api/world/biome/Biome)

```zenscript
// ItemLootPropertyBiome.getBiome() as Biome

myItemLootPropertyBiome.getBiome();
```

:::


## Properties

| Name  |                  Type                   | Has Getter | Has Setter |
|-------|-----------------------------------------|------------|------------|
| biome | [Biome](/vanilla/api/world/biome/Biome) | true       | false      |


# BlockExplosion

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockExplosion;
```


## Extending BlockPropertyDestroy

BlockExplosion extends [BlockPropertyDestroy](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/destroy/BlockPropertyDestroy). That means all methods available in [BlockPropertyDestroy](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/destroy/BlockPropertyDestroy) are also available in BlockExplosion

## Constructors


```zenscript
new BlockExplosion(radius as double, strange as double, chance as double) as BlockExplosion
```
| Parameter |  Type  |
|-----------|--------|
| radius    | double |
| strange   | double |
| chance    | double |



## Methods

:::group{name=getChance}

Return Type: double

```zenscript
// BlockExplosion.getChance() as double

myBlockExplosion.getChance();
```

:::

:::group{name=getRadius}

Return Type: double

```zenscript
// BlockExplosion.getRadius() as double

myBlockExplosion.getRadius();
```

:::

:::group{name=getStrange}

Return Type: double

```zenscript
// BlockExplosion.getStrange() as double

myBlockExplosion.getStrange();
```

:::



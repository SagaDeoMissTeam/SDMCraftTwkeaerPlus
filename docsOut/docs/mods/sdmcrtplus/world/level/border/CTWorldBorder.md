# CTWorldBorder

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.world.level.border.CTWorldBorder;
```


## Extending WorldBorder

CTWorldBorder extends [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder). That means all methods available in [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder) are also available in CTWorldBorder

## Static Properties

|       Name       |                                      Type                                      | Has Getter | Has Setter |
|------------------|--------------------------------------------------------------------------------|------------|------------|
| DEFAULT_SETTINGS | [WorldBorderSettings](/mods/sdmcrtplus/world/level/border/WorldBorderSettings) | true       | false      |

## Constructors


```zenscript
new CTWorldBorder() as CTWorldBorder
new CTWorldBorder();
```

```zenscript
new CTWorldBorder(centerX as double, centerZ as double, absoluteMaxSize as int, size as double, damagePerBlock as double, damageSafeZone as double) as CTWorldBorder
```
|    Parameter    |  Type  |
|-----------------|--------|
| centerX         | double |
| centerZ         | double |
| absoluteMaxSize | int    |
| size            | double |
| damagePerBlock  | double |
| damageSafeZone  | double |




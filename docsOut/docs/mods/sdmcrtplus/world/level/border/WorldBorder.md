# WorldBorder

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.world.level.border.WorldBorder;
```


## Methods

:::group{name=applySettings}

```zenscript
WorldBorder.applySettings(settings as WorldBorderSettings)
```

| Parameter |                                      Type                                      |
|-----------|--------------------------------------------------------------------------------|
| settings  | [WorldBorderSettings](/mods/sdmcrtplus/world/level/border/WorldBorderSettings) |


:::

:::group{name=getAbsoluteMaxSize}

Return Type: int

```zenscript
// WorldBorder.getAbsoluteMaxSize() as int

myWorldBorder.getAbsoluteMaxSize();
```

:::

:::group{name=getCenterX}

Return Type: double

```zenscript
// WorldBorder.getCenterX() as double

myWorldBorder.getCenterX();
```

:::

:::group{name=getCenterZ}

Return Type: double

```zenscript
// WorldBorder.getCenterZ() as double

myWorldBorder.getCenterZ();
```

:::

:::group{name=getDamagePerBlock}

Return Type: double

```zenscript
// WorldBorder.getDamagePerBlock() as double

myWorldBorder.getDamagePerBlock();
```

:::

:::group{name=getDamageSafeZone}

Return Type: double

```zenscript
// WorldBorder.getDamageSafeZone() as double

myWorldBorder.getDamageSafeZone();
```

:::

:::group{name=getDistanceToBorder}

Return Type: double

```zenscript
WorldBorder.getDistanceToBorder(entity as Entity) as double
```

| Parameter |                 Type                 |
|-----------|--------------------------------------|
| entity    | [Entity](/vanilla/api/entity/Entity) |


:::

:::group{name=getDistanceToBorder}

Return Type: double

```zenscript
WorldBorder.getDistanceToBorder(x as double, z as double) as double
```

| Parameter |  Type  |
|-----------|--------|
| x         | double |
| z         | double |


:::

:::group{name=getLerpRemainingTime}

Return Type: long

```zenscript
// WorldBorder.getLerpRemainingTime() as long

myWorldBorder.getLerpRemainingTime();
```

:::

:::group{name=getLerpSpeed}

Return Type: double

```zenscript
// WorldBorder.getLerpSpeed() as double

myWorldBorder.getLerpSpeed();
```

:::

:::group{name=getLerpTarget}

Return Type: double

```zenscript
// WorldBorder.getLerpTarget() as double

myWorldBorder.getLerpTarget();
```

:::

:::group{name=getMaxX}

Return Type: double

```zenscript
// WorldBorder.getMaxX() as double

myWorldBorder.getMaxX();
```

:::

:::group{name=getMaxZ}

Return Type: double

```zenscript
// WorldBorder.getMaxZ() as double

myWorldBorder.getMaxZ();
```

:::

:::group{name=getMinX}

Return Type: double

```zenscript
// WorldBorder.getMinX() as double

myWorldBorder.getMinX();
```

:::

:::group{name=getMinZ}

Return Type: double

```zenscript
// WorldBorder.getMinZ() as double

myWorldBorder.getMinZ();
```

:::

:::group{name=getStatus}

Return Type: [BorderStatus](/mods/sdmcrtplus/world/level/border/BorderStatus)

```zenscript
// WorldBorder.getStatus() as BorderStatus

myWorldBorder.getStatus();
```

:::

:::group{name=getWarningBlocks}

Return Type: int

```zenscript
// WorldBorder.getWarningBlocks() as int

myWorldBorder.getWarningBlocks();
```

:::

:::group{name=getWarningTime}

Return Type: int

```zenscript
// WorldBorder.getWarningTime() as int

myWorldBorder.getWarningTime();
```

:::

:::group{name=isInsideCloseToBorder}

Return Type: boolean

```zenscript
WorldBorder.isInsideCloseToBorder(entity as Entity, aabb as AABB) as boolean
```

| Parameter |                 Type                 |
|-----------|--------------------------------------|
| entity    | [Entity](/vanilla/api/entity/Entity) |
| aabb      | [AABB](/vanilla/api/util/math/AABB)  |


:::

:::group{name=isWithinBounds}

Return Type: boolean

```zenscript
WorldBorder.isWithinBounds(aabb as AABB) as boolean
```

| Parameter |                Type                 |
|-----------|-------------------------------------|
| aabb      | [AABB](/vanilla/api/util/math/AABB) |


:::

:::group{name=isWithinBounds}

Return Type: boolean

```zenscript
WorldBorder.isWithinBounds(pos as BlockPos) as boolean
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=isWithinBounds}

Return Type: boolean

```zenscript
WorldBorder.isWithinBounds(pos as ChunkPos) as boolean
```

| Parameter |                       Type                        |
|-----------|---------------------------------------------------|
| pos       | [ChunkPos](/mods/sdmcrtplus/world/level/ChunkPos) |


:::

:::group{name=isWithinBounds}

Return Type: boolean

```zenscript
WorldBorder.isWithinBounds(x as double, z as double) as boolean
```

| Parameter |  Type  |
|-----------|--------|
| x         | double |
| z         | double |


:::

:::group{name=isWithinBounds}

Return Type: boolean

```zenscript
WorldBorder.isWithinBounds(x as double, y as double, z as double) as boolean
```

| Parameter |  Type  |
|-----------|--------|
| x         | double |
| y         | double |
| z         | double |


:::

:::group{name=setAbsoluteMaxSize}

```zenscript
WorldBorder.setAbsoluteMaxSize(size as int)
```

| Parameter | Type |
|-----------|------|
| size      | int  |


:::

:::group{name=setCenter}

```zenscript
WorldBorder.setCenter(x as double, z as double)
```

| Parameter |  Type  |
|-----------|--------|
| x         | double |
| z         | double |


:::

:::group{name=setDamagePerBlock}

```zenscript
WorldBorder.setDamagePerBlock(damage as double)
```

| Parameter |  Type  |
|-----------|--------|
| damage    | double |


:::

:::group{name=setDamageSafeZone}

```zenscript
WorldBorder.setDamageSafeZone(zone as double)
```

| Parameter |  Type  |
|-----------|--------|
| zone      | double |


:::

:::group{name=setSize}

```zenscript
WorldBorder.setSize(size as double)
```

| Parameter |  Type  |
|-----------|--------|
| size      | double |


:::

:::group{name=setWarningBlocks}

```zenscript
WorldBorder.setWarningBlocks(distance as int)
```

| Parameter | Type |
|-----------|------|
| distance  | int  |


:::

:::group{name=setWarningTime}

```zenscript
WorldBorder.setWarningTime(time as int)
```

| Parameter | Type |
|-----------|------|
| time      | int  |


:::


## Properties

|       Name        |                               Type                               | Has Getter | Has Setter |
|-------------------|------------------------------------------------------------------|------------|------------|
| absoluteMaxSize   | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | true       | true       |
| centerX           | double                                                           | true       | false      |
| centerZ           | double                                                           | true       | false      |
| damagePerBlock    | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | true       | true       |
| damageSafeZone    | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | true       | true       |
| lerpRemainingTime | long                                                             | true       | false      |
| lerpSpeed         | double                                                           | true       | false      |
| lerpTarget        | double                                                           | true       | false      |
| maxX              | double                                                           | true       | false      |
| maxZ              | double                                                           | true       | false      |
| minX              | double                                                           | true       | false      |
| minZ              | double                                                           | true       | false      |
| size              | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | false      | true       |
| status            | [BorderStatus](/mods/sdmcrtplus/world/level/border/BorderStatus) | true       | false      |
| warningBlocks     | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | true       | true       |
| warningTime       | [WorldBorder](/mods/sdmcrtplus/world/level/border/WorldBorder)   | true       | true       |


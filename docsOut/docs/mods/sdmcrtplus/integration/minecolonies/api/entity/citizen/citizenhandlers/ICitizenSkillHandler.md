# ICitizenSkillHandler

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenSkillHandler;
```


## Methods

:::group{name=addXpToSkill}

```zenscript
ICitizenSkillHandler.addXpToSkill(var1 as invalid, var2 as double, var4 as ICitizenData)
```

| Parameter |                                       Type                                        |
|-----------|-----------------------------------------------------------------------------------|
| var1      | **invalid**                                                                       |
| var2      | double                                                                            |
| var4      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData) |


:::

:::group{name=getLevel}

Return Type: int

```zenscript
ICitizenSkillHandler.getLevel(var1 as invalid) as int
```

| Parameter |    Type     |
|-----------|-------------|
| var1      | **invalid** |


:::

:::group{name=getSkills}

Return Type: **invalid**

```zenscript
// ICitizenSkillHandler.getSkills() as invalid

myICitizenSkillHandler.getSkills();
```

:::

:::group{name=getTotalXP}

Return Type: double

```zenscript
// ICitizenSkillHandler.getTotalXP() as double

myICitizenSkillHandler.getTotalXP();
```

:::

:::group{name=incrementLevel}

```zenscript
ICitizenSkillHandler.incrementLevel(var1 as invalid, var2 as int)
```

| Parameter |    Type     |
|-----------|-------------|
| var1      | **invalid** |
| var2      | int         |


:::

:::group{name=init}

```zenscript
ICitizenSkillHandler.init(var1 as int)
```

| Parameter | Type |
|-----------|------|
| var1      | int  |


:::

:::group{name=init}

```zenscript
ICitizenSkillHandler.init(var1 as IColony, var2 as ICitizenData?, var3 as ICitizenData?, var4 as Random)
```

| Parameter |                                        Type                                        |
|-----------|------------------------------------------------------------------------------------|
| var1      | [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)            |
| var2      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData)? |
| var3      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData)? |
| var4      | [Random](/vanilla/api/util/math/Random)                                            |


:::

:::group{name=levelUp}

```zenscript
ICitizenSkillHandler.levelUp(var1 as ICitizenData)
```

| Parameter |                                       Type                                        |
|-----------|-----------------------------------------------------------------------------------|
| var1      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData) |


:::

:::group{name=removeXpFromSkill}

```zenscript
ICitizenSkillHandler.removeXpFromSkill(var1 as invalid, var2 as double, var4 as ICitizenData)
```

| Parameter |                                       Type                                        |
|-----------|-----------------------------------------------------------------------------------|
| var1      | **invalid**                                                                       |
| var2      | double                                                                            |
| var4      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData) |


:::

:::group{name=tryLevelUpIntelligence}

```zenscript
ICitizenSkillHandler.tryLevelUpIntelligence(var1 as Random, var2 as double, var4 as ICitizenData)
```

| Parameter |                                       Type                                        |
|-----------|-----------------------------------------------------------------------------------|
| var1      | [Random](/vanilla/api/util/math/Random)                                           |
| var2      | double                                                                            |
| var4      | [ICitizenData](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData) |


:::



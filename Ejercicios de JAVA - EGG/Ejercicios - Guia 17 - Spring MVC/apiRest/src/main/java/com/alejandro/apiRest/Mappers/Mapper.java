package com.alejandro.apiRest.Mappers;

public interface Mapper<EntityDTO, Entity>{

    Entity mapToEntity(EntityDTO dto);
    EntityDTO mapToDTO(Entity entity);
}
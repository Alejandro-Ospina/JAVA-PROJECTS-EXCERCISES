package com.alejandro.apiRest.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Public interface that does not work as a repository, instead, it works as base for other
 * repositories.
 * @param <Entity> Class entity.
 * @param <ID> Data type for ID entity.
 */
@NoRepositoryBean
public interface EntityRepository<Entity, ID> extends CrudRepository <Entity, ID> {
}
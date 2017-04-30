package by.bsuir.jobproject.dao;


import by.bsuir.jobproject.exception.DAOException;

import java.util.List;


public interface CrudDAO<T> {

    void addEntity(T entity) throws DAOException;

    void deleteEntity(int entity_id) throws DAOException;

    void updateEntity(T entity) throws DAOException;

    List<T> getAllEntities() throws DAOException;

    T getEntityById(int entity_id) throws DAOException;
}

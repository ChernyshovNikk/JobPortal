package by.bsuir.jobproject.service;

import by.bsuir.jobproject.exception.ServiceException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AR on 29.03.2017.
 */
public interface Service<T> {
    ArrayList<T> getAllEntities() throws ServiceException;

    void addEntity(T entity) throws ServiceException;

    boolean deleteEntity(int entity_id) throws ServiceException;

    boolean updateEntity(T entity) throws ServiceException;

    T getEntityById(int entity_id) throws ServiceException;
}

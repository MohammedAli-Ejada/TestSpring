package com.example.demoJavaSpring.EnablementTask.Services.GenericServices;

import java.util.List;

public interface IService<T,ID> {
    List<T> getAll();
    T getById(ID id);
    T add(T entity);
    void delete(ID id);
    T update(ID id, T newEntity);
}

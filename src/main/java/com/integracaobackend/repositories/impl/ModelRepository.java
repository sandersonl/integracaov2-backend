package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.IModelRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Model;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class ModelRepository implements IModelRepository {

    private final Session session = HibernateUtil.getSession();
    private Query query;

    public ModelRepository() {
    }

    @Override
    public List<Model> list() {
        query = session.createQuery("FROM Model");
        return query.getResultList();
    }

    @Override
    public List<Model> getModelByIdCategory(int id) {
        query = session.createQuery("SELECT m FROM Model m WHERE m.category.id = id");
        query.setParameter("id", id);
        return query.getResultList();
    }
}

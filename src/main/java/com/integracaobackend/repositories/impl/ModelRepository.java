package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.IModelRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Model;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class ModelRepository implements IModelRepository {

    private Session session = HibernateUtil.getInstance();
    private Query query;

    public ModelRepository() {
    }

    @Override
    public List<Model> list() {
        List<Model> modelList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("FROM Model");
        modelList = query.getResultList();
        transaction.commit();
        return modelList;
    }

    @Override
    public List<Model> getModelByIdCategory(int id) {
        List<Model> modelList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("SELECT m FROM Model m WHERE m.category.id = id");
        query.setParameter("id", id);
        modelList = query.getResultList();
        transaction.commit();
        return modelList;
    }
}

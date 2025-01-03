package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.ICategoryRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Category;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {

    private Session session = HibernateUtil.getInstance();
    private Query query;

    public CategoryRepository() {
    }

    @Override
    public List<Category> list() {
        List<Category> categoryList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("FROM Category");
        categoryList = query.getResultList();
        transaction.commit();
        return categoryList;
    }

    @Override
    public List<Category> getByLineId(int id) {
        List<Category> categoryList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("SELECT c FROM Category c WHERE c.line.id = :id");
        query.setParameter("id", id);
        categoryList = query.getResultList();
        transaction.commit();
        return categoryList;
    }
}

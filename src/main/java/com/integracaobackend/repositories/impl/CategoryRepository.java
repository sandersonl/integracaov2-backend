package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.ICategoryRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Category;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {

    private final Session session = HibernateUtil.getSession();
    private Query query;

    public CategoryRepository() {
    }

    @Override
    public List<Category> list() {
        query = session.createQuery("FROM Category");
        return query.getResultList();
    }

    @Override
    public List<Category> getByLineId(int id) {
        query = session.createQuery("SELECT c FROM Category c WHERE c.line.id = :id");
        query.setParameter("id", id);
        return query.getResultList();
    }
}

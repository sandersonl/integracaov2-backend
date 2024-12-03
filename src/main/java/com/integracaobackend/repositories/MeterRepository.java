package com.integracaobackend.repositories;

import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Meter;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class MeterRepository implements IMeterRepository {

    Session session = HibernateUtil.getSessionFactory().openSession();
    private Query query;

    public MeterRepository() {

    }

    @Override
    public List<Meter> list() {
        Query query;
        query = session.createQuery("FROM Meter");
        return query.getResultList();
    }

    @Override
    public List<Meter> getMeterByIdCategory(int id) {
        query = session.createQuery("SELECT m FROM Meter m WHERE m.category.id = id");
        query.setParameter("id", id);
        return query.getResultList();
    }
}

package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.ILineRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Line;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class LineRepository implements ILineRepository {

    private final Session session = HibernateUtil.getSession();
    private Query query;

    public LineRepository() {
    }

    @Override
    public List<Line> list() {
        query = session.createQuery("FROM Line");
        return query.getResultList();
    }

    @Override
    public Line getLineById(int id) {
        query = session.createQuery("SELECT l FROM Line l WHERE l.id = :id");
        query.setParameter("id", id);
        return (Line) query.getSingleResult();
    }
}

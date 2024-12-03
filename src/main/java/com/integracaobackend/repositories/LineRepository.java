package com.integracaobackend.repositories;

import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Line;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class LineRepository implements ILineRepository {

    private final Session session = HibernateUtil.getSessionFactory().openSession();
    private Query query;

    public LineRepository() {

    }

    @Override
    public List<Line> list() {
        query = session.createQuery("from Line");
        return query.getResultList();
    }

    @Override
    public Line getLineById(int id) {
        query = session.createQuery("SELECT l FROM Line l WHERE l.id = :id");
        query.setParameter("id", id);
        return (Line) query.getSingleResult();
    }
}

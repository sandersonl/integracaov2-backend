package com.integracaobackend.repositories.impl;

import com.integracaobackend.repositories.ILineRepository;
import com.integracaobackend.utils.HibernateUtil;
import com.integracaobackend.entity.Line;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class LineRepository implements ILineRepository {

    private Session session = HibernateUtil.getInstance();
    private Query query;

    public LineRepository() {
    }

    @Override
    public List<Line> list() {
        List<Line> lineList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("FROM Line");
        lineList = query.getResultList();
        transaction.commit();
        return lineList;
    }

    @Override
    public Line getLineById(int id) {
        Line lineList;
        session = HibernateUtil.getInstance();
        Transaction transaction = session.beginTransaction();
        query = session.createQuery("SELECT l FROM Line l WHERE l.id = :id");
        query.setParameter("id", id);
        lineList = (Line) query.getSingleResult();
        transaction.commit();
        return lineList;
    }
}

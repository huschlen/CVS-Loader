package com.huschle.roster.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huschle.roster.entity.Enrollment;

@Transactional
@Repository
public class EnrollmentDao implements IEnrollmentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void addEnrollment(Enrollment enrollment) {
        hibernateTemplate.saveOrUpdate(enrollment);
    }
    
    @Override
    public void deleteEnrollment(Enrollment enrollment) {
        hibernateTemplate.delete(enrollment);
    }
    
    /*@SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getEnrollmentInfo() {
        String query = "select teacher, count(student) from enrollment group by(teacher_id)";
        return (List<Object[]>) getHibernateTemplate().find(query);
        
    }*/

}

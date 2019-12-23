package mx.com.mb3.runnergps.persistence.dao.common;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;

 
public class BaseDAOImpl<T extends Serializable> implements BaseDAO<T> {

 	protected Class<? extends T> clazz;

	@Autowired
	private SessionFactory sessionFactory;
 

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BaseDAOImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		clazz = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public T findOne(final Serializable id) {
		return getCurrentSession().get(clazz, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll(final String login) {
		return getCurrentSession().createQuery("from " + clazz.getName() + " u where u.login='" + login + "'").list();
	}

	@Override
	public void delete(final T entity) {
		getCurrentSession().delete(entity);
	}

	@Override
	public void deleteById(final Serializable id) {
		final T entity = findOne(id);
		delete(entity);
	}

	@Override
	public void rollback() {
		getSession().getTransaction().rollback();
	}

	@Override
	public void commit() {
		getSession().getTransaction().commit();
	}

	protected Query getNamedQuery(String queryName) {
		return getSession().getNamedQuery(queryName);
	}

	@Override
	public void clear() {
		getSession().clear();
	}

	@Override
	public void flush() {
		getSession().flush();
	}

	@Override
	public void closeSession() {
		try {
			getSession().close();
		} catch (Exception e) {

		}
	}

	public Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected ClassMetadata getClassMetadata() {
		return getSessionFactory().getClassMetadata(getPersistentClass());
	}

	public T findById(Serializable id) {
		return findById(id, false);
	}

	public T findById(Serializable id, boolean lock) {
		T entity;
		if (lock)
			entity = getSession().load(getPersistentClass(), id, LockOptions.UPGRADE);
		else
			entity = getSession().load(getPersistentClass(), id);
		return entity;
	}

	public T getById(Serializable id) {
		return getSession().get(getPersistentClass(), id);
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion criterion[]) {
		Criteria criteria = createCriteria();
		Criterion acriterion[];
		int j = (acriterion = criterion).length;
		for (int i = 0; i < j; i++) {
			Criterion c = acriterion[i];
			if (c != null)
				criteria.add(c);
		}

		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion criterion[], List<Order> orders) {
		Criteria criteria = createCriteria();
		Criterion acriterion[];
		int j = (acriterion = criterion).length;
		for (int i = 0; i < j; i++) {
			Criterion c = acriterion[i];
			if (c != null)
				criteria.add(c);
		}

		for (Iterator<Order> iterator = orders.iterator(); iterator.hasNext();) {
			Order o = iterator.next();
			if (o != null)
				criteria.addOrder(o);
		}

		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance, String excludeProperty[]) {
		Criteria criteria = createCriteria();
		Example example = Example.create(exampleInstance);
		String as[];
		int j = (as = excludeProperty).length;
		for (int i = 0; i < j; i++) {
			String exclude = as[i];
			example.excludeProperty(exclude);
		}

		criteria.add(example);
		return criteria.list();
	}

	public Class<T> getPersistentClass() {
		return getPersistentClass();
	}

	@Override
	public T saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		return entity;
	}

	public T merge(T entity) {
		getSession().merge(entity);
		return entity;
	}

	public Criteria createCriteria() {
		return getSession().createCriteria(getPersistentClass());
	}

	////////////////////////////////////////////////////////////
	// IMPLEMENTACION DE SAVE Y UPDATE
	////////////////////////////////////////////////////////////
	@Override
	public Serializable save(final T entity) {
		return getCurrentSession().save(entity);
	}

	@Override
	public T update(final T entity) {
		getCurrentSession().update(entity);

		return entity;
	}
 
}

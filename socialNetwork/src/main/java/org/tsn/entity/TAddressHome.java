package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TAddress.
 * @see org.tsn.entity.TAddress
 * @author Hibernate Tools
 */
@Stateless
public class TAddressHome
{

	private static final Log	log	= LogFactory.getLog(TAddressHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TAddress transientInstance)
	{
		log.debug("persisting TAddress instance");
		try
		{
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		}
		catch(RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TAddress persistentInstance)
	{
		log.debug("removing TAddress instance");
		try
		{
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		}
		catch(RuntimeException re)
		{
			log.error("remove failed", re);
			throw re;
		}
	}

	public TAddress merge(TAddress detachedInstance)
	{
		log.debug("merging TAddress instance");
		try
		{
			TAddress result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TAddress findById(int id)
	{
		log.debug("getting TAddress instance with id: " + id);
		try
		{
			TAddress instance = entityManager.find(TAddress.class, id);
			log.debug("get successful");
			return instance;
		}
		catch(RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}
}

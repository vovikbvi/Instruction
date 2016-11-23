package com.bogdevich.tec2.instruction.dataacess.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.InstrDao;
import com.bogdevich.tec2.instruction.dataacess.filter.InstrFilter;
import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.datamodel.Instr_;

@Repository
public class InstrDaoImpl extends AbstractDaoImpl<Instr, Long, InstrFilter> implements InstrDao {

	protected InstrDaoImpl() {
		super(Instr.class);
	}

	@Override
	void handleFilterParameters(InstrFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Instr> from) {

	}
	
	@Override
	public List<Instr> getRecordSorted(InstrFilter filter) {
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Instr> cq = cb.createQuery(Instr.class);
		Root<Instr> from = cq.from(Instr.class);

		if (filter.isFetchUserProfile()) {
			from.fetch(Instr_.ovner, JoinType.LEFT);
		}

		if (filter.isFetchInstrType()) {
			from.fetch(Instr_.instrType, JoinType.LEFT);
		}
		
		if (filter.isFetchLocation()) {
			from.fetch(Instr_.location, JoinType.LEFT);
		}

		return em.createQuery(cq).getResultList();
	}

	@Override
	public Instr getWithFetch(Long id){
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Instr> cq = cb.createQuery(Instr.class);
		Root<Instr> from = cq.from(Instr.class);

		cq.select(from);
		
			from.fetch(Instr_.ovner, JoinType.LEFT);
			from.fetch(Instr_.instrType, JoinType.LEFT);
			from.fetch(Instr_.location, JoinType.LEFT);

			
		return em.createQuery(cq).getSingleResult();

	}
	
}

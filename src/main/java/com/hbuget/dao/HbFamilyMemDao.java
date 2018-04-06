package com.hbudget.dao;

import java.util.List;

import com.hbuget.vo.HbFamilyMember;

public interface HbFamilyMemDao {
	
	public void registerFamilyMem(HbFamilyMember famMem);
	public HbFamilyMember findFamilyMemById(final String famMemId);
	public boolean deRegisterFamilyMem(HbFamilyMember famMem);
	public List findAllFamilyMems();

}

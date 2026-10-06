package com.ttpone.utils.service;

public interface IDataConverter<E,RP,RQ> {
	
	public RP convertToResponseData(E entity);
	
	public E convertToEntity(RQ requestData);

}

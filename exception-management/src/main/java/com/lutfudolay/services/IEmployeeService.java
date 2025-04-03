package com.lutfudolay.services;

import com.lutfudolay.dto.DtoEmployee;

public interface IEmployeeService {

	public DtoEmployee findEmployeeById(Long id);
}

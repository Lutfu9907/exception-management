package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoEmployee;
import com.lutfudolay.model.RootEntity;

public interface RestEmployeeController {

	public RootEntity<DtoEmployee> finEmployeeById(Long id);
}

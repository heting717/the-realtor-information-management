package com.ht.service;

import java.util.List;

import com.ht.domain.Dict;

public interface DictService {

	List<Dict> findByCode(String dict_type_code);

}

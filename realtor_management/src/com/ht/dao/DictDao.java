package com.ht.dao;

import java.util.List;

import com.ht.domain.Dict;

public interface DictDao {

	List<Dict> findByCode(String dict_type_code);

}

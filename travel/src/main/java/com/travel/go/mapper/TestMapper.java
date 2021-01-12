package com.travel.go.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
	int deleteData(HashMap<Object, Object> vo) throws Exception;

    int updateData(HashMap<Object, Object> vo) throws Exception;

    int insertData(HashMap<Object, Object> vo) throws Exception;

    List<HashMap<Object, Object>> selectData(HashMap<Object, Object> vo);
}

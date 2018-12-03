package com.srit.mapper;

import java.util.Map;

public interface TbUserMapper {
	
    Map findUserByUid(String uid);

}
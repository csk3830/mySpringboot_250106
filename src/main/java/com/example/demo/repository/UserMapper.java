package com.example.demo.repository;

import com.example.demo.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void register(UserVO userVO);
}

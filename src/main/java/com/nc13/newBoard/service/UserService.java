package com.nc13.newBoard.service;

import lombok.RequiredArgsConstructor;
import com.nc13.newBoard.model.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {
    @Autowired
    private final SqlSession SESSION;

    private final String NAMESPACE = "com.nc13.mappers.UserMapper";

    public UserDTO auth(UserDTO userDTO){
    return SESSION.selectOne(NAMESPACE + ".auth", userDTO);
    }



}

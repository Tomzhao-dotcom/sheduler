package com.qlyyyxb.sheduler.service;

import com.qlyyyxb.sheduler.entity.UserEntity;

import java.util.List;

public interface UserService {
    boolean addUser(UserEntity entity);

    boolean delUser(String id);

    boolean editUser(UserEntity entity);

    List<UserEntity> findAll();

}

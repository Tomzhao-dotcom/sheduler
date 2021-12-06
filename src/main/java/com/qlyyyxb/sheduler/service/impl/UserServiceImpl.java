package com.qlyyyxb.sheduler.service.impl;

import com.qlyyyxb.sheduler.entity.UserEntity;
import com.qlyyyxb.sheduler.repository.UserRepository;
import com.qlyyyxb.sheduler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean addUser(UserEntity entity) {
        entity.setId(UUID.randomUUID().toString());
        UserEntity result = userRepository.saveAndFlush(entity);
        return !result.getId().isEmpty();
    }

    @Override
    public boolean delUser(String id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean editUser(UserEntity entity) {
        if(entity.getId()==null||"".equals(entity.getId())){
            return addUser(entity);
        }else {
            UserEntity result = userRepository.save(entity);
            return !result.getId().isEmpty();
        }
    }

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}

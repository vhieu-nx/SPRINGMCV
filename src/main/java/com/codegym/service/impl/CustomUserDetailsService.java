package com.codegym.service.impl;

import com.codegym.constant.SystemConstant;
import com.codegym.dto.MyUser;
import com.codegym.entity.RoleEntity;
import com.codegym.entity.UserEntity;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findOneByUserNameAndStatus(username, SystemConstant.ACTIVE_STATUS);
        if (userEntity==null){
            throw new UsernameNotFoundException("User not found");
        }

        //list role
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        //lay ra role
        for (RoleEntity role : userEntity.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getCode()));
        }
        MyUser myUser = new MyUser(userEntity.getUserName(),userEntity.getPassword(),true,true,true,true,
                grantedAuthorities);
        myUser.setFullname(userEntity.getFullName());
        //put infor in security duy tri login vao he thong
        return myUser;
    }
}

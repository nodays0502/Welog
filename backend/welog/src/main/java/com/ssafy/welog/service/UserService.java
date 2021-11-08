package com.ssafy.welog.service;


import com.ssafy.welog.api.controller.dto.UserDto.UserCreateReqDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserInfoDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserPutReqDto;
import com.ssafy.welog.common.util.RedisUtil;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserRepository;
import java.util.Optional;
import javax.print.attribute.standard.PresentationDirection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RedisUtil redisUtil;

    public UserService(UserRepository userRepository , PasswordEncoder passwordEncoder, RedisUtil redisUtil){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.redisUtil = redisUtil;
    }
    @Transactional
    public void deleteUser(long userId) {
        User user = userRepository.findById(userId).get();
        userRepository.delete(user);

        log.info("유저 삭제");
    }
    @Transactional
    public void createUser(UserCreateReqDto userCreateReqDto) {
        log.info("회원 가입");
        if(userRepository.existsByUserName(userCreateReqDto.getUserName())){
            // 예외처리
        }
        User newUser = User.builder()
            .userEmail(userCreateReqDto.getUserEmail())
            .userName(userCreateReqDto.getUserName())
            .password(passwordEncoder.encode(userCreateReqDto.getPassword()))
            .userRole(userCreateReqDto.getUserRole())
            .build();
        System.out.println(userCreateReqDto);
        System.out.println(newUser);
        userRepository.save(newUser);
    }

    public UserInfoDto getUser(long userId) {
        log.info("회원정보 얻기");
        User user = userRepository.findById(userId).get();
        return UserInfoDto.builder()
            .email(user.getUserEmail())
            .userName(user.getUserName())
            .userLevel(user.getUserRole())
            .build();
    }
    @Transactional
    public void patchUser(long userId,UserPutReqDto userPutReqDto) {
        User user = userRepository.findById(userId).get();
        String password = null;
        if(userPutReqDto.getPassword() != null){
            password= passwordEncoder.encode(userPutReqDto.getPassword());
        }
        user.changeInfo(userPutReqDto.getUserEmail(), password , userPutReqDto.getUserRole());
        log.info("회원정보 변경");
        System.out.println(userPutReqDto.getUserEmail());
        System.out.println(user.getUserEmail());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).get();
        if(user == null){
            // 예외처리
        }
        return org.springframework.security.core.userdetails.User.builder()
            .username(user.getUserName())
            .password(user.getPassword())
            .roles(user.getUserRole().toString())
            .build();
    }


}

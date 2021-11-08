package com.ssafy.welog.service;


import com.ssafy.welog.api.controller.dto.UserDto.UserCreateReqDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserInfoDto;
import com.ssafy.welog.api.controller.dto.UserDto.UserPutReqDto;
import com.ssafy.welog.domain.entity.User;
import com.ssafy.welog.domain.entity.UserRepository;
import java.util.Optional;
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

    public UserService(UserRepository userRepository , PasswordEncoder passwordEncoder){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void deleteUser() {
        log.info("유저 삭제");
    }

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

    public void putUser() {
        log.info("회원정보변경");
    }

    public UserInfoDto getUser(String email) {
        log.info("회원정보 얻기");
        return UserInfoDto.builder()
            .phone("000-0000-0000")
            .email("이메일")
            .nickname("닉네임")
            .build();
    }
    public void patchUser(UserPutReqDto userPutReqDto) {
        log.info("회원정보 변경");
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

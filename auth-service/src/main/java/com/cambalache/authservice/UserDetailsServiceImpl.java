package com.cambalache.authservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final List<AppUser> users = Arrays.asList(
                new AppUser(1, "omar", encoder.encode("12345"), "USER"),
                new AppUser(2, "admin", encoder.encode("12345"), "ADMIN")
        );

        for(AppUser appUser: users) {
            if (appUser.getUsername().equals(username)){
                List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                        .commaSeparatedStringToAuthorityList("ROLE_" + appUser.getRole());

                return new User(appUser.getUsername(), appUser.getPassword(), grantedAuthorities);
            }
        }

        throw new UsernameNotFoundException("Username: " + username + " not found");
    }

    private static class AppUser {
        private Integer id;
        private String username, password;
        private String role;

        public AppUser(Integer id, String username, String password, String role){
            this.id = id;
            this.username = username;
            this.password = password;
            this.role = role;
        }

        Integer getId(){
            return id;
        }

        String getUsername(){
            return username;
        }

        String getPassword(){
            return password;
        }

        String getRole(){
            return role;
        }

    }
}

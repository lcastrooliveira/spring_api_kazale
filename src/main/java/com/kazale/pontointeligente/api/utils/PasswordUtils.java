package com.kazale.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

    public PasswordUtils() {}

    private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

    public static String gerarBcrypt(String senha) {
        if(senha == null) {
            return senha;
        }

        log.info("Gerando hash com ");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(senha);
    }
}

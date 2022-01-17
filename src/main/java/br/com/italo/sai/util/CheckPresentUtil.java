package br.com.italo.sai.util;

import java.util.Optional;

public class CheckPresentUtil<T> {

    public static <T> T checkPresentAndGet(final Optional<T> t){

        return t.isPresent() ? t.get() : null;

    }

}

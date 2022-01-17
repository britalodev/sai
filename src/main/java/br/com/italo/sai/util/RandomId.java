package br.com.italo.sai.util;

import java.util.Random;

public class RandomId {

    public static long randomId(final long numeroDeIds){
        final Random random = new Random();
        final int id = random.nextInt(Integer.parseInt(String.valueOf(numeroDeIds)) + 1) + 1;
        final long l = Long.parseLong(String.valueOf(id));
        return l > numeroDeIds ? 1L : l;
    }

    public static int randomIdWithZero(final int numeroDeIds){
        final Random random = new Random();
        final int i = random.nextInt(numeroDeIds);
        return i;
    }

}

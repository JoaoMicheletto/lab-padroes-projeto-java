package me.dio.gof;

import me.dio.gof.facade.Facade;
import me.dio.gof.singleton.SingletonEager;
import me.dio.gof.singleton.SingletonLazy;
import me.dio.gof.singleton.SingletonLazyHolder;
import me.dio.gof.strategy.Comportamento;
import me.dio.gof.strategy.ComportamentoAgressivo;
import me.dio.gof.strategy.ComportamentoDefensivo;
import me.dio.gof.strategy.ComportamentoNormal;
import me.dio.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) throws Exception {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        Eager = SingletonEager.getInstancia();
        System.out.println(Eager);

        SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);
        Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("João", "14801877");
    }
}

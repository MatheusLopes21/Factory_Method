/* Pratica 2 Factory Method 
    Dupla: Igor Carvalho Braz -- RA: 42021158
            Matheus Magalhães Alves Lopes -- RA: 4231922738*/ 

interface Bolo {
    void preparar();
}

class BoloChocolate implements Bolo {
    @Override
    public void preparar() {
        System.out.println("Preparando um bolo de chocolate!");
    }
}

class BoloMorango implements Bolo {
    @Override
    public void preparar() {
        System.out.println("Preparando um bolo de morango!");
    }
}

class BoloCenoura implements Bolo {
    @Override
    public void preparar() {
        System.out.println("Preparando um bolo de ninho!");
    }
}

class BoloAbacaxi implements Bolo {
    @Override
    public void preparar() {
        System.out.println("Preparando um bolo de abacaxi!");
    }
}

abstract class FabricaBolo {
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
    }

    protected abstract Bolo criarBolo();
}

class FabricaBoloChocolate extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloChocolate();
    }
}

class FabricaBoloMorango extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloMorango();
    }
}

class FabricaBoloCenoura extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloCenoura();
    }
}

class FabricaBoloAbacaxi extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloAbacaxi();
    }
}

public class Principal {
    public static void main(String[] args) {
        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();

        fabricaChocolate.fazerBolo();
        fabricaMorango.fazerBolo();
        fabricaCenoura.fazerBolo();
        fabricaAbacaxi.fazerBolo();
    }
}

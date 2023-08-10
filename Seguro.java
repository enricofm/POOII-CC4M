public class Seguro {
    private float valor;
    private boolean vigencia;
    
    private Veiculo veiculo;
    private Cliente proprietario;
    private Cliente[] assegurados;
}

public class Cliente {
    private String nome;
    private String cpf;
    
    private Seguro seguro;
}

public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    
    private Modelo modelo;
    private Seguro seguro;
}

public class Modelo {
    private String nome;
    
    private Veiculo veiculo;
}
import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        Cidade cidadeMutavel = new Cidade("Tocantinópolis");
        System.out.println("Cidade mutável antes: " + cidadeMutavel.getNome());
        cidadeMutavel.setNome("Palmas");
        System.out.println("Cidade mutável depois: " + cidadeMutavel.getNome());

        CidadeRecord cidadeRecord = new CidadeRecord("Tocantinópolis");
        System.out.println("CidadeRecord: " + cidadeRecord.nome());

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Tarcísio", cidadeMutavel);
        System.out.println("Pessoa shallow: " + pessoaShallow);
        pessoaShallow.cidade().setNome("Palmas");
        System.out.println("Pessoa shallow após a mudança da cidade: " + pessoaShallow);

        PessoaRecord pessoaDeep = new PessoaRecord("Lanna", cidadeRecord);
        System.out.println("Pessoa deep: " + pessoaDeep);

    }
}

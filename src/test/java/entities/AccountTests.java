package entities;

import com.paschoalick.entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

    @Test
    //<ACAO> Should <Efeito> [when <CENARIO>]
    //<deposit> Should <IncreaseBalance> When PositiveAmount
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        //Padrão AAA
        // Arrange: instancie os objetos necessarios
        // Act: execute as ações necessárias
        // Assert: declare o que deveria acontecer (resultado esperado)

        // Arrange - preparar os dados
        double amount = 200.0;
        double expectedValue = 196.0; // valor tirando os 2%
        Account acc = new Account(1L, 0.0);

        // Act: Ações necessárias
        acc.deposit(amount);

        // Assert
        Assertions.assertEquals(expectedValue, acc.getBalance());

    }


}

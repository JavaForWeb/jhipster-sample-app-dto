package io.github.jhipster.sample.service.mapper;

import io.github.jhipster.sample.domain.*;
import io.github.jhipster.sample.service.dto.BankAccountDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity BankAccount and its DTO BankAccountDTO.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class, })
public interface BankAccountMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.login", target = "userLogin")
    BankAccountDTO bankAccountToBankAccountDTO(BankAccount bankAccount);

    List<BankAccountDTO> bankAccountsToBankAccountDTOs(List<BankAccount> bankAccounts);

    @Mapping(source = "userId", target = "user")
    @Mapping(target = "operations", ignore = true)
    BankAccount bankAccountDTOToBankAccount(BankAccountDTO bankAccountDTO);

    List<BankAccount> bankAccountDTOsToBankAccounts(List<BankAccountDTO> bankAccountDTOs);
}

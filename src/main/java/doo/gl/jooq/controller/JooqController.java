package doo.gl.jooq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import java.util.List;

import doo.gl.jooq.model.Money;
import doo.gl.jooq.model.TransactionDTO;
import doo.gl.jooq.model.User;
import doo.gl.jooq.model.UserDTO;
import doo.gl.jooq.repository.JooqRepository;
import doo.gl.jooq.repository.UserRepository;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class JooqController {

    @Inject
    private UserRepository userRepository;

    @Inject
    private JooqRepository jooqRepository;

    @RequestMapping(path = "/user", method = POST)
    public ResponseEntity<UserDTO> create(
        @RequestBody User user
    ) {
        user.getLimits().forEach(limit -> limit.setUser(user));
        user.getMetadata().forEach(metadata -> metadata.setUser(user));

        return ResponseEntity
            .ok(
                UserDTO.map(userRepository.saveAndFlush(user))
            );
    }

    @RequestMapping(path = "/user", method = GET)
    public ResponseEntity<List<UserDTO>> getUser() {
        return ResponseEntity.ok(jooqRepository.getUser());
    }

    @RequestMapping(path = "/users", method = GET)
    public ResponseEntity<List<UserDTO>> getUsers() {
        return ResponseEntity.ok(jooqRepository.getUsers());
    }

    @RequestMapping(path = "/transaction", method = GET)
    public ResponseEntity<List<TransactionDTO>> getTransactions() {
        return ResponseEntity.ok(jooqRepository.getTransactions());
    }

    @RequestMapping(path = "/totalByCurrency", method = GET)
    public ResponseEntity<List<Money>> getTotalByCurrency() {
        return ResponseEntity.ok(jooqRepository.getTotalByCurrency());
    }

    @RequestMapping(path = "/filteredTotalByCurrency", method = GET)
    public ResponseEntity<List<Money>> getFilteredTotalByCurrency(
        @RequestParam(required = false) String state
    ) {
        return ResponseEntity.ok(jooqRepository.getFilteredTotalByCurrency(state));
    }

    @RequestMapping(path = "/cumulativeSum", method = GET)
    public ResponseEntity<List<Money>> getCumulativeSum(
        @RequestParam(required = false) String state
    ) {
        return ResponseEntity.ok(jooqRepository.getCumulativeSum(state));
    }

    @RequestMapping(path = "/firstTransactions", method = GET)
    public ResponseEntity<List<TransactionDTO>> firstTransactions() {
        return ResponseEntity.ok(jooqRepository.firstTransactions());
    }

}

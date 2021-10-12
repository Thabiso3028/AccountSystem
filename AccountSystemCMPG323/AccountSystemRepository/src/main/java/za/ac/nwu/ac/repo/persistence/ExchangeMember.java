package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.persistence.exchangedM;

@Repository
public abstract class ExchangeMember implements JpaRepository<exchangedM, Long> {
}

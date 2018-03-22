package co.simplon.pfr.FredDemoPrf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.pfr.FredDemoPrf.model.FredUser;

@Repository
public interface FredUserRepository extends JpaRepository<FredUser, Long> {

}

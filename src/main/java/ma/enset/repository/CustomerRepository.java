package ma.enset.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import ma.enset.entity.Customer;


@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
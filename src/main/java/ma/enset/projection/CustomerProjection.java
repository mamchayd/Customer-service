package ma.enset.projection;


import org.springframework.data.rest.core.config.Projection;

import ma.enset.entity.Customer;

@Projection(name = "fullcustomer",types = Customer.class)
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
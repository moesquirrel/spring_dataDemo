package cn.yaya.demo.dao;

import cn.yaya.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JpaRepository<实体类类型，主键类型>：用来完成基本CRUD操作
 * JpaSpecificationExecutor<实体类类型>：用于复杂查询（分页等查询操作）
 */

public interface CustomerDao extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {
    @Query(value = "from Customer")
    public List<Customer> findAllCustomer();

    @Query(value = "from Customer where custName=?1")
    public Customer findCustomer(String custName);

    @Transactional
    @Query(value = "update Customer set custName=?1 where custId=?2")
     @Modifying
    public void updateCustomer(String custName, Long custId);
}

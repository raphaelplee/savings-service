package hello.dao;

import hello.dao.entity.Saving;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface SavingsDao {

    @Select("select * from account.savings")
    List<Saving> getAllSavings();

    @Select("select amount from account.savings where account = #{account}")
    BigDecimal getAmount(String account);

    @Select("update account.savings set amount = amount + #{amountDelta} where account = #{account} returning amount")
    BigDecimal updateAmount(BigDecimal amountDelta, String account);
}

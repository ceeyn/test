package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TShoppingcarEntity;



@Mapper
@Repository
public interface TShoppingcarDao extends BaseDao<TShoppingcarEntity> {

}

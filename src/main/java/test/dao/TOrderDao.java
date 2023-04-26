package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TOrderEntity;



@Mapper
@Repository
public interface TOrderDao extends BaseDao<TOrderEntity> {

}

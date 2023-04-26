package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TDetailEntity;



@Mapper
@Repository
public interface TDetailDao extends BaseDao<TDetailEntity> {

}

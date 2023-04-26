package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TUser1Entity;



@Mapper
@Repository
public interface TUser1Dao extends BaseDao<TUser1Entity> {

}

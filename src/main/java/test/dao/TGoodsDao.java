package test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import test.entity.TGoodsEntity;



@Mapper
@Repository
public interface TGoodsDao extends BaseDao<TGoodsEntity> {

}

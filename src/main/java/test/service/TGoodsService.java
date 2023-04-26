package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TGoodsEntity;
import test.entity.PageData;
import java.util.List;

public interface TGoodsService {

	void add(TGoodsEntity entity);

	void delete(TGoodsEntity entity);

	void update(TGoodsEntity entity);

	List<TGoodsEntity> select(TGoodsEntity entity);

	PageData<TGoodsEntity> likeSelect(TGoodsEntity entity);

    void exportExcel(TGoodsEntity entity, HttpServletResponse response);

}

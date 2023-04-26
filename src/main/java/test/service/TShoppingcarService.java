package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TShoppingcarEntity;
import test.entity.PageData;
import java.util.List;

public interface TShoppingcarService {

	void add(TShoppingcarEntity entity);

	void delete(TShoppingcarEntity entity);

	void update(TShoppingcarEntity entity);

	List<TShoppingcarEntity> select(TShoppingcarEntity entity);

	PageData<TShoppingcarEntity> likeSelect(TShoppingcarEntity entity);

    void exportExcel(TShoppingcarEntity entity, HttpServletResponse response);

}

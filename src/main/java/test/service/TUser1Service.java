package test.service;

import javax.servlet.http.HttpServletResponse;

import test.entity.TUser1Entity;
import test.entity.PageData;
import java.util.List;

public interface TUser1Service {

	void add(TUser1Entity entity);

	void delete(TUser1Entity entity);

	void update(TUser1Entity entity);

	List<TUser1Entity> select(TUser1Entity entity);

	PageData<TUser1Entity> likeSelect(TUser1Entity entity);

    void exportExcel(TUser1Entity entity, HttpServletResponse response);

}

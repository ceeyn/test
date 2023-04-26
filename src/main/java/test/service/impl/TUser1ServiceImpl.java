package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TUser1Dao;
import test.service.TUser1Service;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TUser1Entity;
import java.util.List;
import java.util.Map;

@Service
public class TUser1ServiceImpl implements TUser1Service {


	private final TUser1Dao dao;

	@Autowired
	public TUser1ServiceImpl(TUser1Dao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TUser1Entity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TUser1Entity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TUser1Entity entity) {
		dao.update(entity);
	}

	@Override
	public List<TUser1Entity> select(TUser1Entity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TUser1Entity> likeSelect(TUser1Entity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TUser1Entity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "user_id", "user_pw", "user_name", "user_kind"};

		String[] headEngList = new String[]{ "userId", "userPw", "userName", "userKind"};

		String[] describeList = new String[] { "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}

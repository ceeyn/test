package test.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TKindDao;
import test.service.TKindService;
import test.entity.PageData;
import test.utils.ExcelUtil;
import test.utils.PageUtil;
import java.util.LinkedHashMap;
import test.entity.TKindEntity;
import java.util.List;
import java.util.Map;

@Service
public class TKindServiceImpl implements TKindService {


	private final TKindDao dao;

	@Autowired
	public TKindServiceImpl(TKindDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TKindEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TKindEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TKindEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TKindEntity> select(TKindEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TKindEntity> likeSelect(TKindEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TKindEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "kind_id", "kind_name"};

		String[] headEngList = new String[]{ "kindId", "kindName"};

		String[] describeList = new String[] { "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
